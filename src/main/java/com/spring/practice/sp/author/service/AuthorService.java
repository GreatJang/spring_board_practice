package com.spring.practice.sp.author.service;

import com.spring.practice.sp.author.domain.Author;
import com.spring.practice.sp.author.dto.AuthorListResDto;
import com.spring.practice.sp.author.dto.AuthorSaveReqDto;
import com.spring.practice.sp.author.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void save(AuthorSaveReqDto authorSaveReqDto){
        Author author = new Author(authorSaveReqDto.getName(),
                                   authorSaveReqDto.getEmail(),
                                   authorSaveReqDto.getPassword());
        authorRepository.save(author);
    }

    public List<AuthorListResDto> findAll(){
        List<Author> authors = authorRepository.findAll();
        List<AuthorListResDto> authorListResDtos = new ArrayList<>();
        for(Author author : authors){
            AuthorListResDto authorListResDto = new AuthorListResDto();
            authorListResDto.setName(author.getName());
            authorListResDto.setEmail(author.getEmail());
            authorListResDto.setPassword(author.getPassword());
            authorListResDtos.add(authorListResDto);
        }
        return authorListResDtos;
    }
}
