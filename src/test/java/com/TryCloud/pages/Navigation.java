package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.By;

public class Navigation {

    /**
     * Method to click a link on the navigation
     * @param link_name is the name of the module you want to access. Should be in Camel Case.
     */
    public static void goToLink(String link_name) {
        Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[normalize-space(.)='"+link_name+"']")).click();
    }

}
