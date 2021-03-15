package com.example.hospital.demo;

import com.example.hospital.entities.Hospital;
import com.example.hospital.logic.HospitalBuilder;
import com.example.hospital.logic.HospitalConstructor;
import org.springframework.boot.SpringApplication;
public class DemoApplication {

    public static void main(String[] args) {
        HospitalConstructor createHospital = new HospitalConstructor((new HospitalBuilder()));
        Hospital hospital = null;

        createHospital.builtHospital();
        hospital = createHospital.getHospital();

        System.out.println(hospital);

    }

}
