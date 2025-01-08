package com.vikas.spring_boot_rest.service;


import com.vikas.spring_boot_rest.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User saveUser(User user) {
//        user.getPassword(encoder.encode(user.getPassword()));
//        System.out.println(user.getPassword());
        return repo.save(user);
    }
}
