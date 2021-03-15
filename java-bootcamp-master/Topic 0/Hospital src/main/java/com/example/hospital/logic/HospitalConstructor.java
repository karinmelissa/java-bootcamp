package com.example.hospital.logic;
import com.example.hospital.entities.Hospital;

public class HospitalConstructor {
    private Builder builder;

    public HospitalConstructor(Builder builder){
        this.builder = builder;
    }
    public void builtHospital(){
        this.builder.buildHospital();
    }
    public Hospital getHospital(){
        return this.builder.getHospital();
    }
}
