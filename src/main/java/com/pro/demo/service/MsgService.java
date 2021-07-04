package com.pro.demo.service;

import com.pro.demo.entity.Msg;
import com.pro.demo.entity.Result;
import com.pro.demo.mapper.MsgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MsgService {
    @Autowired
    private MsgMapper msgMapper;

    //    查询所有留言信息
    public Result getAllMsg() {
        Result result = new Result();
        result.setMsg("获取成功");
        result.setSuccess(true);
        result.setDetail(msgMapper.getAllMsg());
        return result;
    }

//    添加留言
public Result addMsg(Msg msg) {
    Result result = new Result();
    result.setSuccess(false);
    result.setDetail(null);
    try {
        msgMapper.addMsg(msg);
        result.setMsg("留言成功");
        result.setSuccess(true);
        result.setDetail(1);
    } catch (Exception e) {
        result.setMsg(e.getMessage());
        e.printStackTrace();
    }
    return result;
}

//    删除留言
    public Result delMsg(int id) {
        Result result = new Result();
        result.setMsg("删除成功");
        result.setSuccess(true);
        result.setDetail(msgMapper.delMsg(id));
        return result;
    }
}
