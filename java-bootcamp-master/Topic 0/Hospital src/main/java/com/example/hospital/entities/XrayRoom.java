package com.example.hospital.entities;

public class XrayRoom extends Room{
    public XrayRoom(BathRoom bathRoom){
        super(bathRoom);
    }
    public String toString() {
        return "A Surgery room with " + getBathroom();
    }
}
