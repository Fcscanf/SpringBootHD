package com.fcant.userservice.feign.impl;

import com.fcant.userservice.bean.Country;
import com.fcant.userservice.feign.ICountryService;
import org.springframework.stereotype.Component;

/**
 * CountryServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 14:24 2019/12/9
 */
@Component
public class CountryServiceImpl implements ICountryService {

    private static final Country ERROR = new Country(1L, "ERROR");
    /**
     * queryCountry
     * Feign中没有指定@PathVariable(name = "countryId")变量映射关系，必须通过name属性指定
     *
     * @param countryId 城市ID
     * @return com.fcant.userservice.bean.Country
     * @author Fcant 10:53 2019/12/9
     */
    @Override
    public Country queryCountry(long countryId) {
        return ERROR;
    }
}
