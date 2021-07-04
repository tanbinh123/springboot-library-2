package com.pro.demo.controller;

import com.pro.demo.entity.Result;
import com.pro.demo.entity.Seat;
import com.pro.demo.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seat")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/getAllSeat")
    public Result getAllSeat () {
        return seatService.getAllSeat();
    }

    @DeleteMapping("/delSeat/{id}")
    public Result delSeat(@PathVariable int id) {
        return seatService.delSeat(id);
    }

    @GetMapping("/updateSeat")
    public Result updateSeat(Seat seat) {
        return seatService.updateSeat(seat);
    }

    @GetMapping("/addSeat")
    public Result addSeat(Seat seat) {
        return seatService.addSeat(seat);
    }
}
