package com.fcant.springbootcore.controller;

import org.springframework.web.bind.annotation.*;

/**
 * RestController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 10:41 2019/12/3
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {
    @RequestMapping(method = RequestMethod.GET, path = "/demo1")
//    @GetMapping(path = "/demo1")
    public String demo1() {
        return "Hello World";
    }

    @GetMapping(path = "/demo2/{name}")
    public String demo2(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping(path = "/demo3")
    public String demo3(@RequestParam String name) {
        return "Hello " + name;
    }

    @PostMapping(path = "demo4")
    public String demo4(@RequestBody String name) {
        return "Hello " + name;
    }

    @PostMapping(path = "demo5")
    public String demo5(@RequestParam String name) {
        return "Hello " + name;
    }
}
