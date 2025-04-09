package com.back.hello_ada_back.Repository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.back.hello_ada_back.Models.Posts;

@Repository
public interface PostsRepository extends JpaRepository<Posts,Long> {

    
}
