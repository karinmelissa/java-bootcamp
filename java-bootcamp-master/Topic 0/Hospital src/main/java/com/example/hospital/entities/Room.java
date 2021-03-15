package com.example.hospital.entities;

public class Room {
    private BathRoom bathroom = null;
    public Room(){
    }

    public Room(BathRoom bathroom) {
        this.bathroom = bathroom;
    }

    public BathRoom getBathroom() {
        return this.bathroom;
    }
}
