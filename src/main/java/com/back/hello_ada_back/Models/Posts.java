package com.back.hello_ada_back.Models;

import java.math.BigInteger;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;

@Entity
@Table(name = "posts")

public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(nullable = false, name = "likes")
    private int likes;

    @Column(nullable = false, name = "post_title", length = 255)
    private String postTitle;

    @Column(nullable = true, name = "post_picture", length = 255)
    private String postPicture;

    @Column(nullable = false, name = "content", length = 1000)
    private String content;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    public Posts(){

    }

    public Posts(Long id, Long userId, int likes, String postTitle, String postPicture, String content, Date createdAt){
        this.id = id;
        this.userId = userId;
        this.likes = likes;
        this.postTitle = postTitle;
        this.postPicture = postPicture;
        this.content = content;
        this.createdAt = createdAt;
    }
    
    @ManyToOne
    @JoinColumn(name = "user_id",
    nullable = false,
    foreignKey = @ForeignKey(name = "user_id"))
    private Users user;

    // getters and setters

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getLikes() {
        return this.likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public String getPostTitle() {
        return this.postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostPicture() {
        return this.postPicture;
    }

    public void setPostPicture(String postPicture) {
        this.postPicture = postPicture;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
