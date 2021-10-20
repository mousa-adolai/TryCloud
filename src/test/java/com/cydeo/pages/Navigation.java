package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.Driver.getDriver;

public class Navigation {

    /**
     * Method to click a link on the navigation
     * @param link_name is the name of the module you want to access. Should be in Camel Case.
     */
    public static void goToLink(String link_name) {
        Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//a[normalize-space(.)='"+link_name+"']")).click();
    }

}
