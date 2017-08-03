package ua.com.creational.factory_method;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        WatchMaker maker = getMakerByName("Rome");

        Watch watch = maker.createWatch();
        watch.showTime();
    }

    public static WatchMaker getMakerByName(String maker) {
        if (maker.equals("Digital")) {
            return new DigitalWatchMaker();
        } else if (maker.equals("Rome")) {
            return new RomeWatchMaker();
        }

        throw new RuntimeException("Не поддерживаемая производственная линия часов: " + maker);
    }
}
