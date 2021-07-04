package com.pro.demo.entity;

public class Room {
    private int id;
    private String roomId;
    private String floor;

    public Room() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public Room(int id, String roomId, String floor) {
        this.id = id;
        this.roomId = roomId;
        this.floor = floor;
    }
}
