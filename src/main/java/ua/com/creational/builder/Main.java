package ua.com.creational.builder;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SubaruSolarisBuilder());
        Car car = director.BuildCar();
        System.out.println(car.toString());
        director.setBuilder(new FordMondeoBuilder());
        car = director.BuildCar();
        System.out.println(car.toString());
    }
}
