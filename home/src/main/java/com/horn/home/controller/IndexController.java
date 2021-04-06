package com.horn.home.controller;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Service
@RestController
@Controller
public class IndexController {

    @RequestMapping("/")
    public ModelAndView indexHtml(HashMap<String, Object> map) {
        ModelAndView mv =  new ModelAndView("index");
        return mv;
    }

    // @RequestMapping("/error")
    // public String errorHtml(HashMap<String, Object> map) {
    //     map.put("error", "欢迎进入HTML页面");
    //     return "/error";
    // }

}