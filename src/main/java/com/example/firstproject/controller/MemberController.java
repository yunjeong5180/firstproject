package com.example.firstproject.controller;

import com.example.firstproject.dto.MemberForm;
import com.example.firstproject.entity.Member; // Member 클래스 임포트
import com.example.firstproject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller // 컨트롤러 선언
public class MemberController 
{
    // 스프링 부트가 미리 생성해 놓은 리파지터리 객체 주입(DI)
    @Autowired
    private MemberRepository memberRepository; // memberRepository 객체 선언
    
    @GetMapping("/member/new") // URL 요청 접수
    public String newMemberForm() // 메서드 생성 및 반환값 작성
    {
        return "member/new";
    }

    @PostMapping("/join")
    public String joinMember(MemberForm form) // 폼 데이터를 DTO로 받기
    {
        System.out.println(form.toString()); // DTO에 폼 데이터가 잘 담겼는지 확인

        // 1. DTO를 엔티티로 변환
        Member member = form.toEntity();
        System.out.println(member.toString()); // DTO가 엔티티로 잘 변환되는지 확인 출력

        // 2. 리파지터리로 엔티티를 DB에 저장
        Member saved = memberRepository.save(member); // member 엔티티를 저장해 saved 객체에 반환
        System.out.println(saved.toString()); // member가 DB에 잘 저장되는지 확인 출력

        return "";
    }
}
