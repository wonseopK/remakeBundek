package com.bunddek.comment.comment.repository;

import com.bunddek.comment.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}