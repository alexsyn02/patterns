package ua.com.creational.builder;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class Director {
    CarBuilder builder;

    void setBuilder(CarBuilder b) {
        builder = b;
    }

    Car BuildCar() {
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildMaxSpeed();
        Car car = builder.getCar();

        return car;
    }
}
