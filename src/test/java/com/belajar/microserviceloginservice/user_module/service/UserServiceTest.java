package com.belajar.microserviceloginservice.user_module.service;

import com.belajar.microserviceloginservice.user_module.entity.User;
import com.belajar.microserviceloginservice.user_module.repo.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    private UUID UUID_VALEUE = UUID.randomUUID();


    @Test
    void getUser() {
        User user1 = new User();
        user1.setId(UUID_VALEUE);
        user1.setUsername("fascal");
        user1.setPassword("fascal123");
        user1.setPhoneNumber("082219080257");
        user1.setEmail("fascalsj@gmail.com");

        Mockito.when(userRepository.findAll()).thenReturn((Collections.singletonList(user1)));

        List<User> actual = userService.findUser();

        Assertions.assertEquals(user1.getId(), actual.get(0).getId());
        Assertions.assertEquals(user1.getEmail(), actual.get(0).getEmail());
        Assertions.assertEquals(user1.getUsername(), actual.get(0).getUsername());
        Assertions.assertEquals(user1.getPhoneNumber(), actual.get(0).getPhoneNumber());
        Assertions.assertEquals(user1.getEmail(), actual.get(0).getEmail());

        Mockito.verify(userRepository).findAll();
    }


    @Test
    void createUser() {
        User user1 = new User();
        user1.setId(UUID_VALEUE);
        user1.setUsername("fascal");
        user1.setPassword("fascal123");
        user1.setPhoneNumber("082219080257");
        user1.setEmail("fascalsj@gmail.com");

        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(user1);
        User actual = userService.create(user1);

        Assertions.assertEquals(user1.getId(), actual.getId());
        Assertions.assertEquals(user1.getEmail(), actual.getEmail());
        Assertions.assertEquals(user1.getUsername(), actual.getUsername());
        Assertions.assertEquals(user1.getPhoneNumber(), actual.getPhoneNumber());
        Assertions.assertEquals(user1.getEmail(), actual.getEmail());
    }

  }
