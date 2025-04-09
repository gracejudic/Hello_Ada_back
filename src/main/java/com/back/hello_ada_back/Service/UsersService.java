package com.back.hello_ada_back.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.back.hello_ada_back.Models.Users;
import com.back.hello_ada_back.Repository.UsersRepository;

@Service
public class UsersService {
    @Autowired

    private UsersRepository usersRepository;

    public Users createUser(Users user) {
        return usersRepository.save(user);
    }

    public Users findById(Long id) {
        return usersRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }
}