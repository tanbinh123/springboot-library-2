package com.pro.demo.mapper;

import com.pro.demo.entity.Msg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MsgMapper {
//    获取全部留言
    List<Msg> getAllMsg();

//    添加留言
    Msg addMsg(Msg msg);

//    删除留言
    Msg delMsg(int id);
}
