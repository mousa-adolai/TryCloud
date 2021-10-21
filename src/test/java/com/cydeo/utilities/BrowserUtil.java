package com.cydeo.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtil {

    public static void waitFor(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }
    public static int randomNumber(int a, int b) {
        return new Faker().number().numberBetween(a, b);
    }


}
