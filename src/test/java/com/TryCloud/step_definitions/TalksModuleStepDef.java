package com.TryCloud.step_definitions;

import com.TryCloud.pages.LoginPage;
import com.TryCloud.pages.Navigation;
import com.TryCloud.pages.Talk;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.TryCloud.pages.Navigation.goToLink;
import static com.TryCloud.utilities.ConfigReader.readProperty;
import static com.TryCloud.utilities.Driver.getDriver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TalksModuleStepDef {
    LoginPage login_page = new LoginPage();
    Talk talks = new Talk();

    @Given("a user has logged in")
    public void aUserHasLoggedIn() {
        login_page.login(readProperty("username1"), readProperty("password"));
    }

    @When("the user clicks the talks module")
    public void theUserClicksTheTalksModule() {
        goToLink("Talk");
    }

    @Then("the user should be at the Talks module page")
    public void theUserShouldBeAtTheTalksModulePage() {
        assertEquals("Talk - Trycloud QA", getDriver().getTitle());
    }

    @When("the user searches for a {string} from the box on the top left")
    public void theUserSearchesForAFromTheBoxOnTheTopLeft(String user) {
        talks.finduser(user);
    }

    @And("the user sends a message {string}")
    public void theUserWritesAMessage(String msg) {
        talks.sendMessageToUser(msg);
    }

    @Then("the message should be displayed in the conversation log with {string}")
    public void theMessageShouldBeDisplayedInTheConversationLog(String msg) {
        assertTrue(talks.checkSentMessage(msg));
    }
}
