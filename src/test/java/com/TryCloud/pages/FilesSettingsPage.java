package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesSettingsPage {


//        ////*[@id= 'appmenu']//*[contains(text(),'Files')]
    @FindBy(xpath = "//div[@id='app-settings-header']")
    public WebElement settingsBtn;
    // multiple checkboxes
    ////div[@id='files-setting-richworkspace']----- 1st one
    @FindBy(xpath = "//div[@id='files-setting-richworkspace']")
    public WebElement firstCheckBox;

    ////div[@id='recommendations-setting-enabled']----2nd one
    @FindBy(xpath = "//input[@id='recommendationsEnabledToggle']")
    public WebElement secondCheckBox;

    ////div[@id='files-setting-showhidden'] ----3rd one
    @FindBy(xpath = "//div[@id='files-setting-showhidden']")
    public WebElement thirdCheckBox;

    public FilesSettingsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }





}
