package com.bunddek.comment.web.join.controller;

import com.bunddek.comment.web.join.dto.MemberJoinRequest;
import com.bunddek.comment.web.join.service.MemberJoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemberJoinController {
    private final MemberJoinService memberJoinService;

    @PostMapping("/member")
    public String join(@RequestBody MemberJoinRequest memberJoinRequest){
        memberJoinService.saveNewMember(memberJoinRequest);
        return "join";
    }
}
