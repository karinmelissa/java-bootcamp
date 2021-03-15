package com.example.hospital.logic;

import com.example.hospital.entities.*;

public class PrimaryRoom extends RoomType{

    @Override
    public Room getRoom(String type) {
        if(type.equals("Urgency")){
            return new UrgencyRoom(new BathRoom());
        }
        else if(type.equals("Surgery")){
            return new SurgeryRoom(new BathRoom());
        }
        else{
            return new IcuRoom(new BathRoom());
        }
    }
}
