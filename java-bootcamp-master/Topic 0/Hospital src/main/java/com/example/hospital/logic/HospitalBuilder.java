package com.example.hospital.logic;
import com.example.hospital.entities.Hospital;

public class HospitalBuilder implements Builder{
    private Hospital hospital = new Hospital();

    @Override
    public void buildHospital() {
        //Metodos de construccion Factory
        RoomFactory roomFactory = new RoomFactory();
        RoomType exam = roomFactory.getRoomType("exam");
        RoomType primary = roomFactory.getRoomType("urgent");

        this.hospital.addCaringRoom(primary.getRoom("Surgery"));
        this.hospital.addCaringRoom(primary.getRoom("Surgery"));
        this.hospital.addCaringRoom(primary.getRoom("Surgery"));
        this.hospital.addCaringRoom(primary.getRoom("Urgency"));
        this.hospital.addCaringRoom(primary.getRoom("ICU"));

        this.hospital.addExamRoom(exam.getRoom("Xray"));
        this.hospital.addExamRoom(exam.getRoom("Xray"));
        this.hospital.addExamRoom(exam.getRoom("Scanner"));
        this.hospital.addExamRoom(exam.getRoom("Scanner"));
        this.hospital.addExamRoom(exam.getRoom("Scanner"));
        this.hospital.addExamRoom(exam.getRoom("Lab"));
        this.hospital.addExamRoom(exam.getRoom("Lab"));
    }

    @Override
    public Hospital getHospital() {
        return this.hospital;
    }
}
