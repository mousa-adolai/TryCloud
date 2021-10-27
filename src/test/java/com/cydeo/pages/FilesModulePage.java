package com.cydeo.pages;

import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesModulePage {

    @FindBy(xpath = "//*[@id='appmenu']/li[2]/a")
    public WebElement filesTab;


    @FindBy(xpath = "//input[@type='file']")  //   //a[@class='button new']      //*[@id='controls']/div[2]/a
    // a[@class='actions creatable']             //span[@class='icon icon-add']
    public WebElement plusIcon;

    @FindBy(xpath = "//span[@class='icon icon-add']")  //   //a[@class='button new']      //*[@id='controls']/div[2]/a
    // a[@class='actions creatable']             //span[@class='icon icon-add']
    public WebElement plusIcon1;


    @FindBy(xpath = "//a[@class='menuitem'][1]")
    public WebElement newFolderTab;

    @FindBy(id = "view13-input-folder")
    public WebElement folderName;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;

    @FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement verify;
    @FindBy(xpath = "//td[@class='selection']/input")
    public List<WebElement> allCboxFiles;
    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement selectAllCbox;



    public FilesModulePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public boolean isOnFilePage() {
        return Driver.getDriver().getTitle().contains("Files - Trycloud QA");

    }


    }








