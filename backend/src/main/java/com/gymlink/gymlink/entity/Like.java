package com.gymlink.gymlink.entity;

import jakarta.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "likes")
public class Like {
    @EmbeddedId
    private LikeId id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("userId")
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @MapsId("postId")
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

    @Column(name = "created_at", nullable = false, insertable = false, updatable = false)
    private OffsetDateTime createdAt;

    public Like() {}

    public Like(User user, Post post) {
        this.user = user;
        this.post = post;
        this.id = new LikeId(user.getId(), post.getId());
    }

    public LikeId getId() { return id; }
    public User getUser() { return user; }
    public Post getPost() { return post; }
    public OffsetDateTime getCreatedAt() { return createdAt; }
}