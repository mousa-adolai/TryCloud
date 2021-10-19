package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesModulePage {

@FindBy(linkText = "/index.php/apps/files/")
    public WebElement filesTab;

@FindBy(xpath = "//a[@class='button new']" )
    public WebElement plusIcon;

@FindBy(xpath = "//a[@class='menuitem'][1]" )
    public WebElement newFolderTab;

@FindBy(id = "view13-input-folder")
    public WebElement folderName;

@FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;

@FindBy(xpath = "//h2[@class='app-sidebar-header__maintitle']")
    public WebElement verify;








}