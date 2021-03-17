package com.example.hospital.demo.recetas;

public class FarmaciaPediatria implements Farmacia{

    @Override
    public void darReceta() {
        System.out.println("Entregar receta en Pediatria.");
    }
}
