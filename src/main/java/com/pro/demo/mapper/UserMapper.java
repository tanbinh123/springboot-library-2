package com.pro.demo.mapper;

import com.pro.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
//    查询全部学生
    List<User> findAll();

//    根据学号查询学生
    User findBySno(String sno);
    //    登录
    User login(String sno, String password);

//    添加学生/注册
    void register(User user);

//    修改学生信息
    User update(User user);

//    删除学生
    User delStu(int id);

}
