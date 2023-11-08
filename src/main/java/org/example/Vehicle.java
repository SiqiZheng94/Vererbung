package org.example;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int year;
    public Vehicle(){

    }

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public void vehicleInfo(){
        System.out.println("manufacturer:"+manufacturer+" mode:"+model+" year:"+year);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
