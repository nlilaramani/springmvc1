/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author itexps
 */
@Controller
public class LoginController {
    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(@RequestParam("username") String username,@RequestParam("password") String password,Model model){
        System.out.println("In Login Controller");
        model.addAttribute("username", username);
        return "login";
    }
    
}
