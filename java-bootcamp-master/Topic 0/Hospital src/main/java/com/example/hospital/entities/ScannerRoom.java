package com.example.hospital.entities;

public class ScannerRoom extends Room{
    public ScannerRoom(BathRoom bathRoom){
        super(bathRoom);
    }
    public String toString() {
        return "Scanner room with " + getBathroom();
    }
}
