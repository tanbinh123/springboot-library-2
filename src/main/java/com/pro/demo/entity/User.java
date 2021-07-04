package com.pro.demo.entity;

// 和数据库保持一致
public class User {
    private int id;
    private String sno;
    private String name;
    private String password;
    private int age;
    private String position;
    private int count;
    private String province;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    public User(int id, String sno, String name, String password, int age, String position, int count, String province) {
        this.id = id;
        this.sno = sno;
        this.name = name;
        this.password = password;
        this.age = age;
        this.position = position;
        this.count = count;
        this.province = province;
    }
}
