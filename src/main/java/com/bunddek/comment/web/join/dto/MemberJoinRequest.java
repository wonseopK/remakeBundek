package com.bunddek.comment.web.join.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberJoinRequest {
    private String email;
    private String mobile;
    private String name;
    private String password;
    private String city;
    private String street;
    private String zipcode;
}
