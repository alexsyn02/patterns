package ua.com.creational.factory_method;

import java.util.Date;

/**
 * Created by Alexandr on 03.08.2017.
 */
public class DigitalWatch implements Watch {
    public void showTime() {
        System.out.println(new Date());
    }
}
