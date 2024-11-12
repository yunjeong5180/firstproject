package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor // (24.11.12 추가)
@AllArgsConstructor // Member 생성자 대체하는 어노테이션 추가
@ToString // toString() 메서드 대체하는 어노테이션 추가
@Entity // 엔티티 선언
@Getter
public class Member
{
    @Id // 엔티티의 대푯값 지정
    @GeneratedValue // 자동 생성 기능 추가(숫자가 자동으로 매겨짐)
    Long id;
    @Column // email 필드 선언, DB 테이블의 email 열과 연결됨
    String email;
    @Column // password 필드 선언, DB 테이블의 password 열과 연결됨
    String password;

//    // Member 생성자 추가
//    public Member(Long id, String email, String password)
//    {
//        this.id = id;
//        this.email = email;
//        this.password = password;
//    }
//
//    // toString() 메서드 추가
//    @Override
//    public String toString()
//    {
//        return "Member{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }


}

