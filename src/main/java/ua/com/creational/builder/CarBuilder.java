package ua.com.creational.builder;

/**
 * Created by Alexandr on 03.08.2017.
 */
abstract class CarBuilder {
    Car car;
    void createCar() {
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar() {
        return car;
    }


//    String m = "Default";
//    Transmission t = Transmission.MANUAL;
//    int s = 120;
//
//    CarBuilder buildMake(String m) {
//        this.m = m;
//        return this;
//    }
//
//    CarBuilder buildTransmission(Transmission t) {
//        this.t = t;
//        return this;
//    }
//
//    CarBuilder buildMaxSpeed(int s) {
//        this.s = s;
//        return this;
//    }
//
//    Car build() {
//        Car car = new Car();
//        car.setMake(m);
//        car.setTransmission(t);
//        car.setMaxSpeed(s);
//        return car;
//    }
}
