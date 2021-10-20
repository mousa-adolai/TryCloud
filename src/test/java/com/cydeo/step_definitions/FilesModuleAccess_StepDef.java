package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FilesModuleAccess_StepDef {
    LoginPage loginPage = new LoginPage();

    @Given("Login as a user")
    public void login_as_a_user() {
        loginPage.goTo();
        ////li[@data-id= 'files']

    }
    @And("Click Settings on the left bottom corner")
    public void clickSettingsOnTheLeftBottomCorner() {
    }

    @Then("Verify user can click any buttons.")
    public void verifyUserCanClickAnyButtons() {
    }
}
