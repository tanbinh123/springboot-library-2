package com.pro.demo.controller;

import com.pro.demo.entity.Result;
import com.pro.demo.entity.User;
import com.pro.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/stu")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllStu")
    public Result getAllStu() {
        return userService.findAll();
    }

    @RequestMapping(value = "/login")
    public Result login(String sno, String password){
        return userService.login(sno, password);
    }

    @GetMapping(value = "/register")
    public Result register(User user) {
        return userService.register(user);
    }

    @GetMapping(value = "/update")
    public Result update(User user) {
        return userService.update(user);
    }

    @DeleteMapping(value = "/delStu/{id}")
    public Result delStu(@PathVariable int id) {
        return userService.delStu(id);
    }
}
