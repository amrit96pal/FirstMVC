package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {
    @RequestMapping("/")
    public String userObj(Model map){
    User user= new User();
    map.addAttribute("object",user);
    return "index";
    }
}
