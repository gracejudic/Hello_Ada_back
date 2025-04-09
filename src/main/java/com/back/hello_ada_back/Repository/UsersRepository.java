package com.back.hello_ada_back.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.back.hello_ada_back.Models.Users;

@Repository
public interface UsersRepository extends JpaRepository <Users,Long> {

    
    

    
}
