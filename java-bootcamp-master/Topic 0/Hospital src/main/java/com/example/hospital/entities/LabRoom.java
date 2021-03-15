package com.example.hospital.entities;

public class LabRoom extends Room{
    public LabRoom(BathRoom bathRoom){
        super(bathRoom);
    }
    public String toString() {
        return "Lab room with " + getBathroom();
    }
}
