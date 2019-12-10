package com.fcant.areaservice.controller;

import com.fcant.areaservice.bean.Country;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * AreaController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 9:32 2019/12/9
 */
@RestController
public class AreaController {

    private static final Map<Long, Country> COUNTRY_MAP;

    static {
        Map<Long, Country> countryMap = new HashMap<>();
        countryMap.put(1L, new Country(1L, "China"));
        countryMap.put(2L, new Country(2L, "America"));
        COUNTRY_MAP = Collections.unmodifiableMap(countryMap);
    }

    /**
     * 查询Country
     *
     * @param countryId 国家ID
     * @return Country
     * @author Fcant 9:42 2019/12/9
     */
    @GetMapping("/country/{countryId}")
    public Country queryCountry(@PathVariable long countryId) throws InterruptedException {
        if (COUNTRY_MAP.containsKey(countryId)) {
            return COUNTRY_MAP.get(countryId);
        }
        throw new RuntimeException("Country not found");
    }
}
