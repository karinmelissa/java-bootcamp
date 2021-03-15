package com.example.karin.house;

public class House {
    private int bedrooms;
    private int bathrooms;
    private int floors;
    private double squaremeters;

    public House(){
    }

    public House(HouseBuilder builder){
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.floors = builder.floors;
        this.squaremeters = builder.squaremeters;
    }
    //All getter, and NO setter to provde immutability
    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public int getFloors() {
        return floors;
    }

    public double getSquaremeters() {
        return squaremeters;
    }
    public String toString(){
        return "Built a House of " + getSquaremeters() + " square meters, with " + getFloors()+
                " floors, that has " + getBedrooms() + " bedrooms and "+ getBathrooms() + " bathrooms" ;
    }
}
