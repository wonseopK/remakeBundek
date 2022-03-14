package com.bunddek.comment.core.member.model;

import com.bunddek.comment.core.address.model.Address;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    private String email;
    private String mobile;
    private String name;
    private String password;

    @Embedded
    private Address address;

    @CreatedDate
    private LocalDateTime joinDate;

    @Builder(access = AccessLevel.PRIVATE)
    public Member(String email,
                  String mobile,
                  String name,
                  String password,
                  Address address,
                  LocalDateTime joinDate) {
        this.email = email;
        this.mobile = mobile;
        this.name = name;
        this.password = password;
        this.address = address;
        this.joinDate = joinDate;
    }

    public static Member of(String email, String mobile, String name, String password, Address address) {
        return Member.builder()
                .email(email)
                .mobile(mobile)
                .name(name)
                .password(password)
                .address(address)
                .joinDate(LocalDateTime.now())
                .build();
    }
}
