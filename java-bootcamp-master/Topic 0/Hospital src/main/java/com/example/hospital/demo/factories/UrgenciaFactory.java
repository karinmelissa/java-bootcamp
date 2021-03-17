package com.example.hospital.demo.factories;

import com.example.hospital.demo.camillas.Camilla;
import com.example.hospital.demo.recetas.Farmacia;
import com.example.hospital.demo.recetas.FarmaciaUrgencia;
import com.example.hospital.demo.camillas.CamillaUrgencia;

public class UrgenciaFactory implements AbstracFactory{
    @Override
    public Camilla traerCamilla() {
        return new CamillaUrgencia();
    }

    @Override
    public Farmacia darReceta() {
        return new FarmaciaUrgencia();
    }
}
