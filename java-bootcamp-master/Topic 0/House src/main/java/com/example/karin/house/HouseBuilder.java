package com.example.karin.house;

public class HouseBuilder {
    public int bedrooms;
    public int bathrooms;
    public int floors;
    public double squaremeters;

    public HouseBuilder addBedroom(int bedrooms){
        if (this.bedrooms < 5) {
            this.bedrooms = bedrooms;
        } else {
            throw new RuntimeException("Too many bedrooms!");
        }
        return this;
    }
    public HouseBuilder addBathrooms(int bathrooms){
        if (this.bathrooms< this.bedrooms){
            this.bathrooms = bathrooms;
        } else{
            throw new RuntimeException("Too many bathrooms!");
        }
        return this;
    }
    public HouseBuilder addFloor(int floors){
        if (this.floors<3){
            this.floors = floors;
        }else{
            throw new RuntimeException("OMG its just a house not an skyscraper!");
        }
        return this;
    }
    public HouseBuilder addSquareMeters(float squaremeters){
        if (this.squaremeters<400.00){
            this.squaremeters = squaremeters;
        }else{
            throw new RuntimeException("OMG its just a house not an mansion!");
        }
        return this;
    }
    public House getHouse(){
        House house = new House(this);
        return house;
    }
}
