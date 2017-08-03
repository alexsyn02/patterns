package ua.com.creational.factory_method;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class DigitalWatchMaker implements WatchMaker {
    public Watch createWatch() {
        System.out.println("Созданы цифровые часы");
        return new DigitalWatch();
    }
}
