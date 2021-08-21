package com.belajar.springstartergradle.user_module.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    private String id;
    private String username;
    private String email;
    private String password;
    private String phone_number;
}
