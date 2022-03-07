package com.bunddek.comment.comment.entity;

import com.bunddek.comment.member.entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_id")
    private Long id;

    private String content;
    private LocalDate regDate;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    //master2
}
