package com.belajar.microserviceloginservice.user_module.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDetailDto {
    private String id;
    private String userId;
    private String firstname;
    private String lastname;
    private String gender;
}
