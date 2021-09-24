package com.spring.core.oop.member;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberTest {

    //테스트 메서드 생성
    @Test
    void lombokTest(){
        Member member = new Member(1L,"낌ㄴ철쑤ㅡ",Grade.VIP);
        member.setId(1L);
        member.getGrade();

        new Member();

        System.out.println("====================");
        System.out.println(member);
    }


}