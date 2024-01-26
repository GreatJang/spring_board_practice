package com.spring.practice.sp.author.dto;

import lombok.Data;
import org.springframework.stereotype.Repository;

@Data
public class AuthorListResDto {
    private String name;
    private String email;
    private String password;
}
