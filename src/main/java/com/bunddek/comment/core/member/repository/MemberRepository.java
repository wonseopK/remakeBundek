package com.bunddek.comment.core.member.repository;

import com.bunddek.comment.core.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
