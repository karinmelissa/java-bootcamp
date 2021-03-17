package com.example.hospital.demo.factories;

import com.example.hospital.demo.camillas.Camilla;
import com.example.hospital.demo.recetas.Farmacia;
import com.example.hospital.demo.camillas.CamillaPediatria;
import com.example.hospital.demo.recetas.FarmaciaPediatria;

public class PediatriaFactory implements AbstracFactory{
    @Override
    public Camilla traerCamilla() {
        return new CamillaPediatria();
    }

    @Override
    public Farmacia darReceta() {
        return new FarmaciaPediatria();
    }
}
