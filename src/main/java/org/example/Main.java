package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Tesla","Y",2018);
        vehicle.vehicleInfo();

        Car car = new Car("Tesla","Y",2018, 2);
        car.carInfo();
        System.out.println(car);

        Motorcycle motor = new Motorcycle("ddf","kfjkl",2020,"Chopper");
        motor.motorInfo();
        System.out.println(motor);
    }
}