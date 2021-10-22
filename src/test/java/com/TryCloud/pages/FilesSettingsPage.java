package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesSettingsPage {


    @FindBy(xpath = "//div[@id='app-settings-header']")
    public WebElement settingsBtn;

    @FindBy(xpath = "//div[@id='files-setting-richworkspace']")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//*[@id='rich-workspace']")
    public WebElement displayedMessage;

    @FindBy(xpath = "//a[@class= 'icon-quota svg']//p")
    public WebElement usageStorage;

    @FindBy(xpath = "//a[@class= 'button new']")
    public WebElement plusBtn;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement uploadFileBtn;

    public FilesSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }




}
