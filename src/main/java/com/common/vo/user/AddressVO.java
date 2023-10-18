package com.common.vo.user;

import lombok.Data;

@Data
public class AddressVO {

    private Long id;

    private String street;

    private String city;

    private String state;

    private String postalCode;

    private String country;
}
