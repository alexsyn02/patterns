package ua.com.creational.abstract_factory;

/**
 * Created by Alexandr on 03.08.2017.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Keyboard getKeyboard();
    Touchpad getTouchpad();
}
