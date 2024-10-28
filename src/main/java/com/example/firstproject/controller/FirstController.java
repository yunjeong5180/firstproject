package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Model 클래스 패키지 자동 임포트
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 1. 컨트롤러 선언
public class FirstController {
    @GetMapping("/hi") // 1~2 URL 요청 접수
    public String niceToMeetYou(Model model) { // model 객체 받아 오기
        // model 객체가 "박지환" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "Park Jihwan"); // "박지환" -> ""Park Jihwan" 수정
        return "greetings"; // greetings.mustache 파일 반환
    }
}
