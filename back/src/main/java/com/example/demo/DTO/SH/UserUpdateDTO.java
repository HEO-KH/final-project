package com.example.demo.DTO.SH;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserUpdateDTO {
    private int userId;
    private String nickname;
    private String password;
    private String phoneNumber;
}