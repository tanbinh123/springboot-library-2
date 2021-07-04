package com.pro.demo.mapper;

import com.pro.demo.entity.Seat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SeatMapper {
//    所有座位信息
    List<Seat> getAllSeat();

//    删除座位信息
    Seat delSeat(int id);

//    修改座位信息
    Seat updateSeat(Seat seat);

//    添加座位信息
    Seat addSeat(Seat seat);

}
