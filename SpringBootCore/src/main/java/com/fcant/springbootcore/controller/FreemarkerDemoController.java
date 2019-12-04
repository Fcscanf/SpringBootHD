package com.fcant.springbootcore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * RestController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcant
 * @date 10:41 2019/12/3
 */
@Controller
@RequestMapping("/freemarker")
public class FreemarkerDemoController {

    @GetMapping("/demo")
    public String Demo01(Model model, @RequestParam String content) {
        model.addAttribute("content", content);
        return "demo01";
    }
}
