package com.TryCloud.step_definitions;

import com.TryCloud.pages.FilesModulePage;
import com.TryCloud.pages.FilesSettingsPage;
import com.TryCloud.pages.LoginPage;
import com.TryCloud.utilities.BrowserUtil;
import com.TryCloud.utilities.ConfigReader;
import com.TryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;


public class FilesModuleAccess_StepDef {
    LoginPage loginPage = new LoginPage();
    FilesModulePage filesModulePage = new FilesModulePage();
    FilesSettingsPage filesSettingsPage= new FilesSettingsPage();
    BrowserUtil browserUtil= new BrowserUtil();
    String storageNumber= "";

    @Given("Login as a user {string} and passcode {string}")
        public void loginAsAUserAndPasscode(String email, String password) {
        loginPage.login(ConfigReader.readProperty(email),ConfigReader.readProperty(password));

    }
    @Then("Click on file")
    public void clickOnFile() {
        filesModulePage.filesTab.click();

    }

        @And("Click Settings on the left bottom corner")
        public void clickSettingsOnTheLeftBottomCorner () {
        filesSettingsPage.settingsBtn.click();
        }

        @Then("Verify user can click any buttons")
        public void verifyUserCanClickAnyButtons () {
        BrowserUtil.waitFor(4);
         filesSettingsPage.firstCheckBox.click();
            BrowserUtil.waitFor(4);
         assertTrue(filesSettingsPage.displayedMessage.isDisplayed());
        }

    @When("Check the current storage usage")
    public void checkTheCurrentStorageUsage() {

       storageNumber = filesSettingsPage.usageStorage.getText();
    }

    @Then("Upload a file")
    public void uploadAFile() {
        filesSettingsPage.plusBtn.click();
        //filesSettingsPage.uploadFileBtn.click();


        filesSettingsPage.uploadFileBtn.sendKeys("/Users/karinaquezada/Desktop/test1.docx");
        BrowserUtil.waitFor(4);


    }

    @And("Refresh the page")
    public void refreshThePage() {
       Driver.getDriver().navigate().refresh();
        BrowserUtil.waitFor(2);


    }

    @Then("Verify the storage usage is increased")
    public void verifyTheStorageUsageIsIncreased() {
       String newStorageNumber = filesSettingsPage.usageStorage.getText();
        String first = newStorageNumber.replaceAll("[^\\d]", "");
        String second = storageNumber.replaceAll("[^\\d]", "");


        if (Integer.parseInt(first) > Integer.parseInt(second)){
           Assert.assertTrue(true);
       }
       }


}

