package com.pro.demo.controller;

import com.pro.demo.entity.Msg;
import com.pro.demo.entity.Result;
import com.pro.demo.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/msg")
public class MsgController {

    @Autowired
    private MsgService msgService;

    @GetMapping("/getAllMsg")
    public Result getAllMsg () {
        return msgService.getAllMsg();
    }

    @GetMapping("/addMsg")
    public Result addMsg (Msg msg) {
        return msgService.addMsg(msg);
    }

    @GetMapping("/delMsg/{id}")
    public Result delMsg (@PathVariable int id) {
        return msgService.delMsg(id);
    }


}
