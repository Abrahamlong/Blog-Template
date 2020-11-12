package com.abraham.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @Date 2020/11/12
 */
@Controller
@RequestMapping("/pages")
public class PagesController {

    @RequestMapping("/page-archive")
    public String pageArchive(){
        return "pages/page-archive";
    }

    @RequestMapping("/page-author")
    public String pageAuthor(){
        return "pages/page-author";
    }

    @RequestMapping("/page-blog")
    public String pageBlog(){
        return "pages/page-blog";
    }

    @RequestMapping("/page-category")
    public String pageCategory(){
        return "pages/page-category";
    }

    @RequestMapping("/page-error")
    public String pageError(){
        return "pages/page-error";
    }

    @RequestMapping("/page-search")
    public String pageSearch(){
        return "pages/page-search";
    }
}
