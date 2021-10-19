package com.cydeo.step_definitions;

import com.cydeo.pages.DashBoardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class LoginFunctionalityStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user goes to log in page")
    public void user_goes_to_log_in_page() {
        loginPage.goTo();
    }

    @When("user logs in with valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.login(ConfigReader.readProperty("username1"),ConfigReader.readProperty("password"));
    }

    @Then("Verify user is on dashboard page")
    public void verify_user_is_on_dashboard_page() {
        assertTrue(new DashBoardPage().isOnDashBoardPage());
    }

    @When("user logs in with invalid credentials")
    public void userEntersInvalidCredentials() {
        loginPage.login("hacko","hacky");
    }

    @Then("“Wrong username or password.” message should be displayed")
    public void wrongUsernameOrPasswordMessageShouldBeDisplayed() {
        assertTrue(loginPage.isLoginErrorMessageDisplayed());
    }
}
