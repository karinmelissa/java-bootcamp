package com.example.hospital.logic;

import com.example.hospital.entities.*;

public class ExamRoom extends RoomType{

    @Override
    public Room getRoom(String type) {
        if(type.equals("Xray")){
            return new XrayRoom(new BathRoom());
        }
        else if(type.equals("Scanner")){
            return new ScannerRoom(new BathRoom());
        }
        else{
            return new LabRoom(new BathRoom());
        }
    }
}
