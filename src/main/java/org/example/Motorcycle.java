package org.example;

public class Motorcycle extends Vehicle{
    private String type;


    public Motorcycle(String manufacturer, String model, int year, String type) {
        super(manufacturer, model, year);
        this.type = type;
    }
    public void motorInfo(){
        System.out.println("the type of motorcycle:"+type);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "type='" + type + '\'' +
                "} " + super.toString();
    }
}
