package com.example.firstproject.controller;

import com.example.firstproject.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
    // Execute 경로로 GET 요청을 받는 메소드
    @PostMapping("/login")
    public String executeLogin(@RequestParam(name="id", required=false) String id,
                               @RequestParam(name="password", required=false) String password,
                               Model model)
    {
        // 모델에 User 객체 추가 (뷰에서 사용 가능)
        model.addAttribute("id", id);
        model.addAttribute("password", password);

        // login.html 뷰 리턴
        return "greetings";
    }

    @GetMapping("/loginpage")
    public String seeYouNext()
    { // 1. model 객체 받아 오기
        return "login";
    }
}

// 모델은 컨트롤러의 메서드에서 매개변수로 받아온다.
// 템플릿을 사용했기 때문에 모델로 받아온건가.?


// 템플릿이 아닌, html 파일로 한다면 되지 않을까..?