package com.dixit.ceti.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by adixit on 12/15/14.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showIndex() {
        return "index";
    }


    @RequestMapping(value = "/home2", method = RequestMethod.GET)
    public ModelAndView showIndex2() {
        return new ModelAndView("index");
    }

}
