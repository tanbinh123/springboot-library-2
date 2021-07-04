package com.pro.demo.service;

import com.pro.demo.entity.Result;
import com.pro.demo.entity.Seat;
import com.pro.demo.entity.User;
import com.pro.demo.mapper.SeatMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatMapper seatMapper;

//    获取所有座位
    public Result getAllSeat() {
        Result result = new Result();
        result.setMsg("获取成功");
        result.setSuccess(true);
        result.setDetail(seatMapper.getAllSeat());
        return result;
    }

//    删除座位
    public Result delSeat(int id) {
        Result result = new Result();
        result.setMsg("删除成功");
        result.setSuccess(true);
        result.setDetail(seatMapper.delSeat(id));
        return result;
    }

//    修改座位信息
    public Result updateSeat(Seat seat) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        Seat editSeat = seatMapper.updateSeat(seat);
        result.setSuccess(true);
        result.setMsg("修改成功");
        result.setDetail("ok");
        return result;
    }

//    添加座位信息
    public Result addSeat(Seat seat) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            seatMapper.addSeat(seat);
            result.setMsg("新增成功");
            result.setSuccess(true);
            result.setDetail(1);
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}
