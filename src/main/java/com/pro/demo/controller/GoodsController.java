package com.pro.demo.controller;

import com.pro.demo.entity.Goods;
import com.pro.demo.entity.Result;
import com.pro.demo.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @GetMapping("/getAllGoods")
    public Result getAllGoods() {
        return goodsService.getAllGoods();
    }

    @GetMapping("/addGoods")
    public Result addGoods (Goods goods) {
        return goodsService.addGoods(goods);
    }

    @DeleteMapping("/delGoods/{id}")
    public Result delGoods (@PathVariable int id) {
        return goodsService.delGoods(id);
    }

    @GetMapping("/updateGoods")
    public Result updateGoods(Goods goods) {
        return goodsService.updateGoods(goods);
    }
}
