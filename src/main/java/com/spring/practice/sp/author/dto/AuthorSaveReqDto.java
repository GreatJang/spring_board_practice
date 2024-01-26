package com.spring.practice.sp.author.dto;

import lombok.Data;

import javax.persistence.Entity;

@Data
public class AuthorSaveReqDto {
    private String name;
    private String email;
    private String password;
}
