package com.fcant.userservice.feign;

import com.fcant.userservice.bean.Country;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * ICountryService
 * 通过@FeignClient注解指定Feign客户端，名称为要访问的服务名
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 10:24 2019/12/9
 */
@FeignClient(name = "area-service")
public interface ICountryService {

    /**
     * queryCountry
     * Feign中没有指定@PathVariable(name = "countryId")变量映射关系，必须通过name属性指定
     *
     * @param countryId 城市ID
     * @return com.fcant.userservice.bean.Country
     * @author Fcant 10:53 2019/12/9
     */
    @GetMapping("/country/{countryId}")
    Country queryCountry(@PathVariable(name = "countryId") long countryId);
}
