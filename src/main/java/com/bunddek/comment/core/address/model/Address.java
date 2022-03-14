package com.bunddek.comment.core.address.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Address {
    private String city;
    private String street;
    private String zipcode;


    public static Address of(String city, String street, String zipcode) {
        return new Address(city, street, zipcode);
    }
}
