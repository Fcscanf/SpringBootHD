package com.fcant.springbootdata.controller;

import com.fcant.springbootdata.bean.UserCart;
import com.fcant.springbootdata.repository.UserCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserCartController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 20:20 2019/12/4
 */
@RestController
@RequestMapping("/user")
public class UserCartController {
    private UserCartRepository userCartRepository;

    @Autowired
    public UserCartController(UserCartRepository userCartRepository) {
        this.userCartRepository = userCartRepository;
    }

    @GetMapping("/all")
    List<UserCart> list() {
        return userCartRepository.findAll();
    }

    @GetMapping("/{id}")
    UserCart query(@PathVariable long id) {
        return userCartRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @PostMapping
    UserCart create(@RequestBody @Validated UserCart userCart, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new IllegalArgumentException(bindingResult.toString());
        }
        return userCartRepository.save(userCart);
    }

    @PutMapping
    UserCart update(@RequestBody UserCart userCart) {
        return userCartRepository.save(userCart);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable long id) {
        userCartRepository.deleteById(id);
    }
}
