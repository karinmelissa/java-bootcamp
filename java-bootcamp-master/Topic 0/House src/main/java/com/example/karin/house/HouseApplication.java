package com.example.karin.house;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HouseApplication {
    public static void main(String[] args) {
        HouseBuilder first_built = new HouseBuilder();
        House first_house;
        first_house = first_built.addBedroom(2).addBathrooms(1).addFloor(2).addSquareMeters(150).getHouse();

        HouseBuilder second_built = new HouseBuilder();
        House second_house;
        second_house = second_built.addBedroom(4).addBathrooms(3).addFloor(2).addSquareMeters(220).getHouse();

        HouseBuilder third_built = new HouseBuilder();
        House third_house;
        third_house = third_built.addBedroom(2).addBathrooms(1).addSquareMeters(800).getHouse();

        System.out.println("House number 1 : " + first_house);
        System.out.println("House number 2 : " + second_house);
        System.out.println("House number 3 : " + third_house);


    }

}
