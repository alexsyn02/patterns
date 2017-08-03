package ua.com.creational.builder;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class Car {
    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", transmission=" + transmission + ", maxSpeed=" + maxSpeed + "]";
    }
}
