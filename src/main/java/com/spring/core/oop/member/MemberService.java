package com.spring.core.oop.member;

//역할: 적당한 회원 저장소에 저장 명령을 내리는 책임
public class MemberService { //클

    private MemberRepository memberRepository; //서버


    public MemberService(MemberRepository memberRepository) {//의존성 주입
        this.memberRepository = memberRepository;
    }


    //회원가입 명령 기능
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원조회 명령 기능
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

}
