package com.belajar.microserviceloginservice.user_module.service;

import com.belajar.microserviceloginservice.user_module.entity.User;
import com.belajar.microserviceloginservice.user_module.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> findUser() {
        return userRepository.findAll();
    }

    public User create(User user) {
        log.info("Creating Patient " + user.getUsername() + "|" + user.getEmail());
        return userRepository.save(user);
    }
}
