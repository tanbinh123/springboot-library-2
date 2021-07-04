package com.pro.demo.controller;

import com.pro.demo.entity.Result;
import com.pro.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping("/getAllRoom")
    public Result getAllRoom() {
        return roomService.getAllMsg();
    }
}
