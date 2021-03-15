package com.example.hospital.entities;
import java.util.ArrayList;

public class Hospital {
    //Debo agregar mis salas
    private ArrayList<Room> examRoom = new ArrayList<Room>();
    private ArrayList<Room> caringRoom = new ArrayList<Room>();

    public void addExamRoom(Room room){
        this.examRoom.add(room);
    }

    public void addCaringRoom(Room room){
        this.caringRoom.add(room);
    }

    public String toString(){
        String message = "Built an Hospital with :\n";
        for(Room i : this.caringRoom){
            message += "-" +  i + "\n";
        }
        for(Room i : this.examRoom){
            message +=  "-" + i + "\n";
        }
        return message;
    }


}
