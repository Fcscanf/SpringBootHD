package com.fcant.userservice.bean;

import lombok.Data;

/**
 * Country
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 9:30 2019/12/9
 */
@Data
public class Country {
    private Long countryId;
    private String countryName;

    public Country(long countryId, String countryName) {
    }

    public Country() {
    }
}
