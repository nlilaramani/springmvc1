/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author itexps
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value="/home",method=RequestMethod.GET)
    public String showHomePage(Model model){
        System.out.println("In the controller");
        return "home";
    }
}
