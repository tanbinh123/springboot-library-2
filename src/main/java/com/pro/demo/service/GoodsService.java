package com.pro.demo.service;

import com.pro.demo.entity.Goods;
import com.pro.demo.entity.Result;
import com.pro.demo.entity.Seat;
import com.pro.demo.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;

    //    查询所有失物招领信息
    public Result getAllGoods() {
        Result result = new Result();
        result.setMsg("获取成功");
        result.setSuccess(true);
        result.setDetail(goodsMapper.getAllGoods());
        return result;
    }

    //    添加失物招领信息
    public Result addGoods(Goods goods) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            goodsMapper.addGoods(goods);
            result.setMsg("添加成功");
            result.setSuccess(true);
            result.setDetail(1);
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }

    //    删除失物招领信息
    public Result delGoods(int id) {
        Result result = new Result();
        result.setMsg("删除成功");
        result.setSuccess(true);
        result.setDetail(goodsMapper.delGoods(id));
        return result;
    }

    //    修改座位信息
    public Result updateGoods(Goods goods) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);
        Goods editGoods = goodsMapper.updateGoods(goods);
        result.setSuccess(true);
        result.setMsg("修改成功");
        result.setDetail("ok");
        return result;
    }
}
