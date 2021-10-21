package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.Driver.getDriver;

public class Navigation {
    @FindBy(xpath = "//li[@data-id='dashboard']")
    private WebElement dashboard_navlnk;

    @FindBy(xpath = "//li[@data-id='files']")
    private WebElement files_navlnk;

    @FindBy(xpath = "//li[@data-id='photos']")
    private WebElement photos_navlnk;

    @FindBy(xpath = "//li[@data-id='activity']")
    private WebElement activity_navlnk;

    @FindBy(xpath = "//li[@data-id='spreed']")
    private WebElement talk_navlnk;

    @FindBy(xpath = "//li[@data-id='mail']")
    private WebElement mail_navlnk;

    @FindBy(xpath = "//li[@data-id='contacts']")
    private WebElement contacts_navlnk;

    @FindBy(xpath = "//li[@data-id='circles']")
    private WebElement circles_navlnk;

    @FindBy(xpath = "//li[@data-id='calendar']")
    private WebElement calendar_navlnk;

    @FindBy(xpath = "//li[@data-id='deck']")
    private WebElement deck_navlnk;

    @FindBy(xpath = "//li[@data-id='more-apps']")
    private WebElement more_navlnk;

    public Navigation() {
        PageFactory.initElements(getDriver(), this);
    }

    /**
     * Method to click a link on the navigation
     * @param link_name is the name of the module you want to access. Should be in Camel Case.
     */
    public void goToLink(String link_name) {
        switch (link_name) {
            case "dashboard":
                dashboard_navlnk.click();
                break;
            case "files":
                files_navlnk.click();
                break;
            case "photos":
                photos_navlnk.click();
                break;
            case "activity":
                activity_navlnk.click();
                break;
            case "talk":
                talk_navlnk.click();
                break;
            case "mail":
                mail_navlnk.click();
                break;
            case "contacts":
                contacts_navlnk.click();
                break;
            case "circles":
                circles_navlnk.click();
                break;
            case "calendar":
                calendar_navlnk.click();
                break;
            case "deck":
                deck_navlnk.click();
                break;
            case "more-apps":
                more_navlnk.click();
                break;
            default:
                System.err.println("Invalid navlink provided");
                break;
        }
    }

}
