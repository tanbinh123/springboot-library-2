package com.pro.demo.mapper;

import com.pro.demo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

//    获取所有失物招领信息
    List<Goods> getAllGoods();

//    添加一条失物招领信息
    Goods addGoods(Goods goods);

//    删除一条失物招领信息
    Goods delGoods(int id);

//    修改失物招领信息
    Goods updateGoods(Goods goods);
}
