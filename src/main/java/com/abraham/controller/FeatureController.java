package com.abraham.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author long
 * @Date 2020/11/12
 */
@Controller
@RequestMapping("/feature")
public class FeatureController {

    @RequestMapping("/post-audio")
    public String postAudio(){
        return "/feature/post-audio";
    }

    @RequestMapping("/post-full-width")
    public String postFullWidth(){
        return "/feature/post-full-width";
    }

    @RequestMapping("/post-gallery")
    public String postGallery(){
        return "/feature/post-gallery";
    }

    @RequestMapping("/post-image")
    public String postImage(){
        return "/feature/post-image";
    }

    @RequestMapping("/post-quate")
    public String postQuate(){
        return "/feature/post-quate";
    }

    @RequestMapping("/post-video")
    public String postVideo(){
        return "/feature/post-video";
    }

    @RequestMapping("/single-post-full")
    public String singlePostFull(){
        return "/feature/single-post-full";
    }

    @RequestMapping("/single-post-left-sidebar")
    public String singlePostLeftSidebar(){
        return "/feature/single-post-left-sidebar";
    }

    @RequestMapping("/single-post-standard")
    public String singlePostStandard(){
        return "/feature/single-post-standard";
    }
}
