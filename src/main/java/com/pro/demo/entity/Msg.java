package com.pro.demo.entity;

public class Msg {
    private int id;
    private String username;
    private String msg;
    private String send_time;

    public Msg () {

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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getSend_time() {
        return send_time;
    }

    public void setSend_time(String send_time) {
        this.send_time = send_time;
    }

    public Msg(int id, String username, String msg, String send_time) {
        this.id = id;
        this.username = username;
        this.msg = msg;
        this.send_time = send_time;
    }
}
