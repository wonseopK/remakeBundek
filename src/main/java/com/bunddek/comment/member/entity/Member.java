package com.bunddek.comment.member.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String name;

    private String password;

    private String email;

    private LocalDate regDate;

    private String email2;
    private String email22131;
    private String email2213sdfsd1;
    private String email2213sdfsd12;
    private String sdfsemail2213sdfsd12;
}