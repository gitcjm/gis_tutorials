package com.str.web;

import org.springframework.boot.Banner;
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

    @GetMapping("/toggle-map")
    public ModelAndView toggleBasemap(HttpSession session) {
        return new ModelAndView("toggle-map.html");
    }

    @GetMapping("/add-feature")
    public ModelAndView addFeatureLayer(HttpSession session) {
        return new ModelAndView("add-feature-layer.html");
    }

    @GetMapping("/disp-location")
    public ModelAndView dispYourLocation(HttpSession session) {
        return new ModelAndView("display-your-location.html");
    }

    @GetMapping("/search-address")
    public ModelAndView searchAddress(HttpSession session) {
        return new ModelAndView("search-address.html");
    }

    @GetMapping("/find-places")
    public ModelAndView findPlaces(HttpSession session) {
        return new ModelAndView("find-places.html");
    }

}
