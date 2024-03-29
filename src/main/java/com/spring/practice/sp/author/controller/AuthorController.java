package com.spring.practice.sp.author.controller;

import com.spring.practice.sp.author.dto.AuthorListResDto;
import com.spring.practice.sp.author.dto.AuthorSaveReqDto;
import com.spring.practice.sp.author.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/author/save")
    @ResponseBody
    public String authorSave(){
        return "OK";
    }

    @PostMapping("/author/save")
    @ResponseBody
    public String authorSave(AuthorSaveReqDto authorSaveReqDto){
        authorService.save(authorSaveReqDto);
        System.out.println(authorSaveReqDto);
        return "OK";
    }

    @PostMapping("/author/list")
    @ResponseBody
    public List<AuthorListResDto> authorList(){
        return authorService.findAll();
    }

}
