package com.spring.core.oop.order;

import com.spring.core.oop.discount.DiscountPolicy;
import com.spring.core.oop.member.Grade;
import com.spring.core.oop.member.Member;
import com.spring.core.oop.member.MemberRepository;
import com.spring.core.oop.member.MemoryMemberRepository;

//역할: 적당한 회원 저장소에서 회원 정보를 조회한 후
//회원등급에 따라 적당한 할인 정책을 적용한 주문 정보를 생성하는 책임
public class OrderService {

    private final MemberRepository memberRepository; //의존성 주입
    private final DiscountPolicy discountPolicy;

    public OrderService(MemberRepository memberRepository,DiscountPolicy discountPolicy){
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    //주문 기능
    public  Order createOrder(long id, String itemName, int price){
        Member member = memberRepository.findById(id);
        Grade grade = member.getGrade();

        //주문 생성 할인 적용
        int discount = discountPolicy.discount(member, price);
        Order order = new Order(id, itemName, price, discount);
        return order;

    }

}
