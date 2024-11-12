package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor // 롬복 어노테이션 추가 (생성자 코드 대체)
@ToString // 롬복 어노테이션 추가2 (toString 코드 대체)
public class ArticleForm
{
    private long id;
    private String title; // 제목을 받을 필드
    private String content; // 내용을 받을 필드

    public Article toEntity()
    {
        return new Article(id, title, content);
    }
}
