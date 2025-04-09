
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Table;


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
    private BigInteger likes;

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

    public Posts(Long id, Long userId, BigInteger likes, String postTitle, String postPicture, Text content, DateTime createdAt){
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

    public BigInteger getLikes() {
        return this.likes;
    }

    public void setLikes(BigInteger likes) {
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

    public Text getContent() {
        return this.content;

    }

    public void setContent(Text content) {
        this.content = content;
    }

    public DateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
    }
}
