package ua.com.creational.factory_method;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class RomeWatchMaker implements WatchMaker {
    public Watch createWatch() {
        System.out.println("Созданы римские часы");
        return new RomeWatch();
    }
}