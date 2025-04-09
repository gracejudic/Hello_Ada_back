package com.back.hello_ada_back.Models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, name = "username", length = 25)
    private String username;

    @Column(nullable = true, name = "profile_picture", length = 500)
    private String profilPicture;

    @Column(nullable = true, name = "description", length = 255)
    private String description;

    @Column(nullable = false, name = "email", length = 255)
    private String email;

    @Column(nullable = false, name = "password", length = 255)
    private String password;
  
    
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Posts> posts;

    public Users() {
    }

    public Users(Long id, String username, String profilPicture, String description, String email, String password) {
    this.id = id;
    this.username = username;
    this.profilPicture = profilPicture;
    this.description = description;
    this.email = email;
    this.password = password;
    }

    // getters and setters

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProfilPicture() {
        return this.profilPicture;
    }

    public void setProfilPicture(String profilPicture) {
        this.profilPicture = profilPicture;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}