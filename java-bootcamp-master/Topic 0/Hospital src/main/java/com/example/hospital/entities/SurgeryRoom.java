package com.example.hospital.entities;

public class SurgeryRoom extends Room{
    public SurgeryRoom(BathRoom bathRoom){
        super(bathRoom);
    }
    public String toString() {
        return "Surgery room with " + getBathroom();
    }
}
