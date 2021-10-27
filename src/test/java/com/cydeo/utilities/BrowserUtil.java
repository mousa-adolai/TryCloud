package com.cydeo.utilities;

import org.openqa.selenium.WebElement;

import java.util.List;

public class BrowserUtil {

    public static void waitFor(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

    }

    public static boolean isAllSelected(List<WebElement> allCboxFiles) {
        for (int i = 0; i <= allCboxFiles.size() - 1; i = i + 1) {
            if (allCboxFiles.get(i).isSelected() == false) {
                return false;

            }



        }
        return true;
    }
}







