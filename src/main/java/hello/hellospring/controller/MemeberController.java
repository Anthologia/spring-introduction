package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemeberController {

    private final MemberService memberService;

    // DI : Field Injection
    // @Autowired private MemberService memberService;

    // DI : Setter Injection
    // @Autowired
    // public void setMemberService(MemberService memberService) {
    //     this.memberService = memberService;
    // }

    // DI : Constructor Injection
    @Autowired
    public MemeberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
