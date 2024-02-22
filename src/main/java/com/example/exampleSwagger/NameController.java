package com.example.exampleSwagger;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/info")
public class NameController {

    @GetMapping("/chiedinome")
    public String chiediNome(@RequestParam String nome){
        return "il nome è : " + nome;
    }
    @PostMapping("/richiediuser")
    public User richiedeUser (@RequestBody User user){
        return  user;
    }
    @GetMapping("/chiedecognome")
    public User chiediCognome(@RequestBody User user){
        return user;
    }


}
