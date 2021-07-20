package com.example.security.controller;

import com.example.security.domain.Equipment;
import com.example.security.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class UserController {
    @Autowired
    private  EquipmentService equipmentService;

    @GetMapping  ("/user") // user
    public String getuser(Authentication authentication){
        return "Hell "+authentication.getPrincipal()+ " " + authentication.getAuthorities()+ " " +authentication.getDetails();
    }

    @GetMapping("/admin") // admin
    public String getAdmin(){
        return  "helloAdmin";
    }

    @GetMapping("/public")
    public String geetPublic (){
        return  "helloBydefaultpublic";
    }

    @PostMapping("/save")
    public Equipment saveEq(@RequestBody Equipment equipment){
        return equipmentService.save(equipment);
    }

}
