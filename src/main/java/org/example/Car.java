package org.example;

public class Car extends Vehicle {
    private int doorsNum;

    public Car() {

    }

    public Car(String manufacturer, String model, int year, int doorsNum) {
        super(manufacturer, model, year);
        this.doorsNum = doorsNum;
    }

    public void carInfo(){
        super.vehicleInfo();
        System.out.println("this car has "+doorsNum+" doors.");

    }

    @Override
    public String toString() {
        return "Car{" +
                "doorsNum=" + doorsNum +
                "} " + super.toString();
    }
}
