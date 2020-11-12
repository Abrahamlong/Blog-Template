package com.abraham.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @Date 2020/11/12
 */
@Controller
public class ContactController {

    @RequestMapping("/contact")
    public String contact(){
        return "/contact/contact";
    }
}
