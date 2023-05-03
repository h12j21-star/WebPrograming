package gcu.backend.orderservice.controller;


import gcu.backend.orderservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import gcu.backend.orderservice.domain.Member;

import java.util.Optional;


@RestController
public class MemberController {

    @Autowired
    final
    MemberRepository memberRepository;

    public MemberController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @PostMapping("/api/member")
    public String create(@RequestBody Member member){
        memberRepository.save(member);
        return "create ok";
    }
    @GetMapping("/member/{id}")
    public Optional<Member> getMemberId(@PathVariable("id") Long id ){
            return  memberRepository.findById(id);
        }
    }

