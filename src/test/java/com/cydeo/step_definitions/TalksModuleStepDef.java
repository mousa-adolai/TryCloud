package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cydeo.utilities.ConfigReader.readProperty;
import static com.cydeo.utilities.Driver.getDriver;
import static org.junit.Assert.assertEquals;

public class TalksModuleStepDef {
    LoginPage login_page = new LoginPage();
    Navigation nav = new Navigation();

    @Given("a user has logged in")
    public void aUserHasLoggedIn() {
        login_page.login(readProperty("username1"), readProperty("password"));
    }

    @When("the user clicks the talks module")
    public void theUserClicksTheTalksModule() {
        nav.goToLink("talk");
    }

    @Then("the user should be at the Talks module page")
    public void theUserShouldBeAtTheTalksModulePage() {
        assertEquals("Talk - Trycloud QA", getDriver().getTitle());
    }

    @When("the user searches for a {string} from the box on the top left")
    public void theUserSearchesForAFromTheBoxOnTheTopLeft(String user) {
    }

    @And("the user writes a message")
    public void theUserWritesAMessage() {
    }

    @And("the user clicks the send button")
    public void theUserClicksTheSendButton() {
    }

    @Then("the message should be displayed in the conversation log")
    public void theMessageShouldBeDisplayedInTheConversationLog() {
    }
}
