package ua.com.creational.builder;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class FordMondeoBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Ford Mondeo");
    }
    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
