package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article; // Article 클래스 임포트 확인
import com.example.firstproject.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j // println() 문을 대체하는, 로깅 기능을 위한 어노테이션 추가
@Controller
public class ArticleController
{
    private static final Logger log = LoggerFactory.getLogger(ArticleController.class);
    // 스프링 부트가 미리 생성해 놓은 리파지터리 객체 주입(DI)
    @Autowired
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm()
    {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form)
    {
        log.info(form.toString()); // 로깅 코드 추가
        // System.out.println(form.toString()); // 기존 코드 주석 처리

        // 1. DTO를 엔티티로 변환
        Article article = form.toEntity();
        // DTO가 엔티티로 잘 변환되는지 확인 출력
        log.info(article.toString()); // 로깅 코드 추가
        // System.out.println(article.toString()); // 기존 코드 주석 처리
        
        // 2. 리파지터리로 엔티티를 DB에 저장
        Article saved = articleRepository.save(article);
        // article이 DB에 잘 저장되는지 확인 출력
        log.info(saved.toString()); // 로킹 코드 추가
        // System.out.println(saved.toString()); // 기존 코드 주석 처리

        return "";
    }
}
