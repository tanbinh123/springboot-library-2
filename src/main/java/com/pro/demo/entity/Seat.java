package com.pro.demo.entity;

public class Seat {
    private int id;
    private String floor;
    private String roomId;
    private String deskId;
    private String userSno;

    public Seat() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getDeskId() {
        return deskId;
    }

    public void setDeskId(String deskId) {
        this.deskId = deskId;
    }

    public String getUserSno() {
        return userSno;
    }

    public void setUserSno(String userSno) {
        this.userSno = userSno;
    }

    public Seat(int id, String floor, String roomId, String deskId, String userSno) {
        this.id = id;
        this.floor = floor;
        this.roomId = roomId;
        this.deskId = deskId;
        this.userSno = userSno;
    }
}
