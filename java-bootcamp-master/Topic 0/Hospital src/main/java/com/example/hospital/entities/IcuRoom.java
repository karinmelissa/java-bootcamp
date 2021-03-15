package com.example.hospital.entities;

public class IcuRoom extends Room{
    public IcuRoom(BathRoom bathRoom){
        super(bathRoom);
    }
    public String toString() {
        return "ICU with " + getBathroom();
    }
}
