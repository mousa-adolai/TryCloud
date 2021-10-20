package com.cydeo.step_definitions;

import com.cydeo.pages.FilesModulePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesModuleStepDefs {

    LoginPage loginPage = new LoginPage();
    FilesModulePage filesModulePage = new FilesModulePage();

    @Given("user is at library login page")
    public void user_is_at_library_login_page() {
        loginPage.goTo();
    }

    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String email, String password) {
        loginPage.login(email, password);
    }

    @When("Click Files icon")
    public void click_files_icon() {
        BrowserUtil.waitFor(2);
    filesModulePage.filesTab.click();
    }

    @When("Click the plus icon on top")
    public void click_the_icon_on_top() {
        BrowserUtil.waitFor(2);
    filesModulePage.plusIcon1.click();
    filesModulePage.plusIcon1.sendKeys("NewFolder");
    }








/*
    @When("Click “New Folder”")
    public void click_new_folder() {
    filesModulePage.newFolderTab.click();
    }

    @When("Write a folder name")
    public void write_a_folder_name() {
    filesModulePage.folderName.sendKeys("New Folder1");
    }

    @When("Click submit icon")
    public void click_submit_icon() {
    filesModulePage.submitIcon.click();
    }

 */

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
    filesModulePage.verify.isDisplayed();
    }
}
