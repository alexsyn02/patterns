package ua.com.creational.abstract_factory;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class Main {
    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("RU");
        Mouse m = factory.getMouse();
        Keyboard k = factory.getKeyboard();
        Touchpad t = factory.getTouchpad();

        m.click();
        k.println();
        m.scroll(20);
        t.track(10, 50);
    }

    public static DeviceFactory getFactoryByCountryCode(String lang) {
        switch (lang.toLowerCase()) {
            case "en":
                return new EnDeviceFactory();
            case "ru":
                return new RuDeviceFactory();
            default:
                throw new RuntimeException("Unsupported country code: " + lang);
        }
    }
}

