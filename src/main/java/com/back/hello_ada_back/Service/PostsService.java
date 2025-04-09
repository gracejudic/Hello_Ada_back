package com.back.hello_ada_back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.back.hello_ada_back.Models.Posts;
import com.back.hello_ada_back.Models.Users;
import com.back.hello_ada_back.Repository.PostsRepository;

@Service
public class PostsService {
    @Autowired

    private PostsRepository postsRepository;

    public Posts createPosts() {
        Posts post = new Posts();
        post.setUser(user.getId());
        post.setLikes(18);
        post.setPostTitle("Journée de merde à l'école...");
        post.setPostPicture("https://adatechschool.fr/app/uploads/2023/08/VisualContent_ADA_by_BenoitBillard0071_Edited_WEB-e1710082326520.jpg");
        post.setContent("C'est difficile Java et Dorothée écoute tout ce qu'on fait, elle écoute tout !");
    }
}
