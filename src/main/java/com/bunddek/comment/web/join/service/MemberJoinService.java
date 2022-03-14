package com.bunddek.comment.web.join.service;

import com.bunddek.comment.core.address.model.Address;
import com.bunddek.comment.core.member.model.Member;
import com.bunddek.comment.core.member.repository.MemberRepository;
import com.bunddek.comment.web.join.dto.MemberJoinRequest;
import com.bunddek.comment.web.join.dto.MemberJoinResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberJoinService {
    private final MemberRepository memberRepository;

    public MemberJoinResponse saveNewMember(MemberJoinRequest memberJoinRequest) {
        Address address = Address.of(memberJoinRequest.getCity(), memberJoinRequest.getStreet(), memberJoinRequest.getZipcode());

        Member member = Member.of(
                memberJoinRequest.getEmail(),
                memberJoinRequest.getMobile(),
                memberJoinRequest.getName(),
                memberJoinRequest.getPassword(),
                address);

        Member saveMember = memberRepository.save(member);
        return new MemberJoinResponse(saveMember.getId());
    }
}
