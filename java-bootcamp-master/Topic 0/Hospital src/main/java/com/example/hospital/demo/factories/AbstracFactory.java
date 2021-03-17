package com.example.hospital.demo.factories;

import com.example.hospital.demo.camillas.Camilla;
import com.example.hospital.demo.recetas.Farmacia;

public interface AbstracFactory {
    Camilla traerCamilla();
    Farmacia darReceta();
}
