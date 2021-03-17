package com.example.hospital.demo.recetas;

public class FarmaciaUrgencia implements Farmacia{

    @Override
    public void darReceta() {
        System.out.println("Entregar receta en Urgencia.");
    }
}
