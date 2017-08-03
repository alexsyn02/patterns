package ua.com.creational.builder;

/**
 * Created by Alexandr on 04.08.2017.
 */
public class SubaruSolarisBuilder extends CarBuilder {
    void buildMake() {
        car.setMake("Subaru Solaris");
    }
    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }
    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
