package com.example.hospital.demo;

import com.example.hospital.demo.camillas.Camilla;
import com.example.hospital.demo.recetas.Farmacia;
import com.example.hospital.demo.factories.AbstracFactory;

public class HospitalCreator {
    private Camilla camilla;
    private Farmacia farmacia;

    public HospitalCreator(AbstracFactory factory) {
        camilla = factory.traerCamilla();
        farmacia = factory.darReceta();
    }
    public void crearElementos(){
        camilla.traerCamilla();
        farmacia.darReceta();
    }
}
