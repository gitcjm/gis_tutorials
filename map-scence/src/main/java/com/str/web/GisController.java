package com.str.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class GisController {

    @GetMapping("/")
    public ModelAndView index(HttpSession session) {
        return new ModelAndView("display-a-map.html");
    }


}
