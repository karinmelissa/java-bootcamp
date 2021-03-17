package com.example.hospital.demo;

import com.example.hospital.demo.factories.PediatriaFactory;
import com.example.hospital.demo.factories.UrgenciaFactory;
import com.example.hospital.demo.factories.AbstracFactory;

public class DemoApplication {

    public static HospitalCreator configureApp(){
        HospitalCreator hospital;
        AbstracFactory factory;

        String origenPaciente1 = "Urgencia";
        if(origenPaciente1.equals("Urgencia")){
            factory = new UrgenciaFactory();
            hospital = new HospitalCreator(factory);
        }else{
            factory = new PediatriaFactory();
            hospital = new HospitalCreator(factory);
        }
        return hospital;
    }
    public static void main(String[] args) {
        HospitalCreator hospital = configureApp();
        hospital.crearElementos();

    }

}
