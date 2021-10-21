package com.TryCloud.pages;

import com.TryCloud.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public boolean isOnDashBoardPage(){
       return Driver.getDriver().getTitle().contains("Dashboard - Trycloud QA");
    }
}
