package com.example.hospital.entities;

public class UrgencyRoom extends Room{
    public UrgencyRoom(BathRoom bathRoom){
        super(bathRoom);
    }
    public String toString() {
        return "Urgency room with " + getBathroom();
    }
}
