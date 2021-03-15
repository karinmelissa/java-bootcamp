package com.example.hospital.logic;

public class RoomFactory {
    public RoomType getRoomType(String type){
        if (type.equals("exam")){
            return new ExamRoom();
        }
        else{
            return new PrimaryRoom();
        }
    }
}
