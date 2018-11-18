/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.springwebapp;

import com.itexps.dao.UserDao;
import com.itexps.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author itexps
 */
@Component
@Controller
public class RegistrationController {

    
    @RequestMapping(value="/process",method=RequestMethod.POST)
    public String registerUser(@ModelAttribute User user){
        
        System.out.println("In Process Controller");
        //model.addAttribute("user", user);s
        new UserService().saveUser(user);
        return "success";
    }
    
    
}
