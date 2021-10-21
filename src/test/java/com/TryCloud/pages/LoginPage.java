package com.TryCloud.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.TryCloud.utilities.ConfigReader.readProperty;
import static com.TryCloud.utilities.Driver.getDriver;

public class LoginPage {
    @FindBy(id = "user")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "submit-form")
    private WebElement loginBtn;

    @FindBy(id = "user")
    private WebElement loginErrorMessage;

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
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }

    public boolean isLoginErrorMessageDisplayed(){
        return loginErrorMessage.isDisplayed();
    }
}
