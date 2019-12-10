package com.fcant.userservice.bean;

import lombok.Data;

/**
 * User
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 10:04 2019/12/9
 */
@Data
public class User {
    private Long id;
    private String userName;
    private String email;
    private String sex;
    private Long countryId;
    private String countryName;

    public User(Long id, String userName, String email, String sex, Long countryId, String countryName) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.sex = sex;
        this.countryId = countryId;
        this.countryName = countryName;
    }

    public User() {
    }
}
