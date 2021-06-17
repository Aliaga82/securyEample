package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UserController {
    @GetMapping  ("/user") // user
    public String getuser(){
        return "Hell";
    }

    @GetMapping("/admin") // admin
    public String getAdmin(){
        return  "helloAdmin";
    }

    @GetMapping("/public")
    public String geetPublic (){
        return  "helloBydefaultpublic";
    }

}
