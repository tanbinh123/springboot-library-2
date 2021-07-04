package com.pro.demo.service;

import com.pro.demo.entity.Result;
import com.pro.demo.entity.User;

import com.pro.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

//    依赖注入问题
    @Autowired
    private UserMapper userMapper;

//    查询所有学生信息
    public Result findAll() {
        Result result = new Result();
        result.setMsg("获取成功");
        result.setSuccess(true);
        result.setDetail(userMapper.findAll());
        return result;
    }

//    登录
    public Result login(String sno, String password) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        User user = userMapper.login(sno, password);
        if(user != null) {
            result.setSuccess(true);
            result.setMsg("登录成功");
            result.setDetail(user);
        } else {
            result.setMsg("学号或密码错误");
        }
        return result;
    }

//    添加一名学生/注册
    public Result register(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            String sno = user.getSno();
            User existUser = userMapper.findBySno(sno);
            if(existUser == null) {
                userMapper.register(user);
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            } else {
                result.setMsg("该学生已存在");
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

//    更新学生信息
    public Result update(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        User editUser = userMapper.update(user);
        result.setSuccess(true);
        result.setMsg("修改成功");
        result.setDetail("ok");
        return result;
    }

//    删除学生信息
    public Result delStu(int id) {
        Result result = new Result();
        result.setMsg("删除成功");
        result.setSuccess(true);
        result.setDetail(userMapper.delStu(id));
        return result;
    }
}
