package com.pro.demo.mapper;

import com.pro.demo.entity.Room;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {
    List<Room> getAllRoom();
}
