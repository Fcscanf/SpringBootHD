package com.fcant.userservice.controller;

import com.fcant.userservice.bean.Country;
import com.fcant.userservice.bean.User;
import com.fcant.userservice.feign.ICountryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * FeignController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant 10:06 2019/12/9
 */
@RestController
@RequestMapping("/user")
public class FeignController {
    private static final List<User> USER_LIST;

    static {
        List<User> userList = new ArrayList<>();
        userList.add(new User(3L, "User 03", "男", "user03@fcant.com", 1L, ""));
        userList.add(new User(4L, "User 04", "女", "user04@fcant.com", 2L, ""));
        USER_LIST = userList;
    }

    private final ICountryService countryService;

    public FeignController(ICountryService countryService) {
        this.countryService = countryService;
    }


    @GetMapping("/feign")
    public List<User> queryUser() {
        List<User> userList = new ArrayList<>(USER_LIST);
        userList.forEach(user -> {
            // TODO:无法提供Service层或者说无法通过RestTemplate获取远程服务返回的json进行解析值绑定，以至于当前对象的值为null
            Country country = countryService.queryCountry(user.getCountryId());
            user.setCountryName(country.getCountryName());
        });
        return userList;
    }
}
