package com.jetbrains.jwt_security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greeting")
public class UserController {

    @GetMapping("/user")
    public String aUser(){
        return "Welcome User!";
    }

    @GetMapping("/admin")
    public String anAdmin(){
        return "Welcome Admin!";
    }

}
