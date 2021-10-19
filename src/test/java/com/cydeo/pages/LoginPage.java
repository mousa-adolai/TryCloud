package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utilities.ConfigReader.readProperty;
import static com.cydeo.utilities.Driver.getDriver;

public class LoginPage {
    @FindBy(id = "user")
    private WebElement username_input;

    @FindBy(id = "password")
    private WebElement password_input;

    @FindBy(id = "submit-form")
    private WebElement login_btn;

    public LoginPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void goTo() {
        getDriver().get(readProperty("trycloud_url"));
    }

    public void login(String username, String password) {
        // Open URL
        goTo();

        // Login
        username_input.sendKeys(username);
        password_input.sendKeys(password);
        login_btn.click();
    }
}
