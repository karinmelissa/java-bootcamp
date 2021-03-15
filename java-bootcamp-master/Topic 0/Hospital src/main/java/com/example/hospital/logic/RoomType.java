package com.example.hospital.logic;
import com.example.hospital.entities.Room;

public abstract class RoomType {
    public abstract Room getRoom(String type);
}
