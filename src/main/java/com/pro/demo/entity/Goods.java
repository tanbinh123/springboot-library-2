package com.pro.demo.entity;

public class Goods {
    private int id;
    private String username;
    private String des;
    private String goods;
    private String sno;
    private String imgSrc;
    private String agree;

    public Goods () {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getAgree() {
        return agree;
    }

    public void setAgree(String agree) {
        this.agree = agree;
    }

    public Goods(int id, String username, String des, String goods, String sno, String imgSrc, String agree) {
        this.id = id;
        this.username = username;
        this.des = des;
        this.goods = goods;
        this.sno = sno;
        this.imgSrc = imgSrc;
        this.agree = agree;
    }
}
