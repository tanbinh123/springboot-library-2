package com.pro.demo.service;

import com.pro.demo.entity.Result;
import com.pro.demo.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomMapper roomMapper;
    //    查询所有留言信息
    public Result getAllMsg() {
        Result result = new Result();
        result.setMsg("获取成功");
        result.setSuccess(true);
        result.setDetail(roomMapper.getAllRoom());
        return result;
    }
}
