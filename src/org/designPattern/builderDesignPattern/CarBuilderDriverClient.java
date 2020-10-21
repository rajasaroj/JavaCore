package org.designPattern.builderDesignPattern;

import java.io.Serializable;

// Builder
interface Builder {

    void reset();
    void setEngine(String engine);
    void setGPS(String gps);
    void setTripMeter(String tripMeter);
    void setTransmission(String transmission);
    void setType(String type);
}

// Car Builder  provides implementation to Director instrcution/commands
class CarBuilder implements Builder {

    Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setGPS(String gps) {
        this.car.setGps(gps);
    }

    @Override
    public void setTripMeter(String tripMeter) {
        this.car.setTripMeter(tripMeter);
    }

    @Override
    public void setTransmission(String transmission) {
        this.car.setTransmission(transmission);
    }

    @Override
    public void setType(String type) {
        this.car.setType(type);
    }

    public Car getDelivery() {
        Car newCar = this.car;
        this.car = null;
        return newCar;
    }
}

// Directory Does step by step construction of object working in association with builder
class CarDirector {
    Builder builder;

    CarDirector(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public void buildSuv(int budget) {



        if (budget < 25000) {
            builder.reset();
            builder.setEngine("V4 Engine");
            builder.setTransmission("Manual");
            builder.setType("Normal");

        } else
        {
            builder.reset();
            builder.setEngine("V6 Turbo Engine");
            builder.setTransmission("Auto 8 speed");
            builder.setTripMeter("Smart trip meter");
            builder.setType("Sports");
        }

    }

}


// Complex object
class Car implements Serializable {
    private String engine;
    private String gps;
    private String tripMeter;
    private String transmission;
    private String type;

    public String getEngine() {
        return engine;
    }

    public String getGps() {
        return gps;
    }

    public String getTripMeter() {
        return tripMeter;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getType() {
        return type;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public void setTripMeter(String tripMeter) {
        this.tripMeter = tripMeter;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", gps='" + gps + '\'' +
                ", tripMeter='" + tripMeter + '\'' +
                ", transmission='" + transmission + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}



public class CarBuilderDriverClient {

    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();

        CarDirector carDirector = new CarDirector(carBuilder);

        carDirector.buildSuv(20000);


        Car normalCar = carBuilder.getDelivery();

        carDirector.buildSuv(60000);
        Car sportsCar = carBuilder.getDelivery();

        System.out.println(normalCar);
        System.out.println(sportsCar);

    }

}
