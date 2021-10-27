package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.cydeo.utilities.Driver.getDriver;
import static org.junit.Assert.assertEquals;
import static com.cydeo.pages.Navigation.goToLink;

public class NavigationStepsDef {

    @And("user clicks on {string}")
    public void userClicksOn(String str) {
        goToLink(str);
    }

    @Then("user should be on the {string} page")
    public void userShouldBeOnThePage(String str) {
        String expected_page = str + " - Trycloud QA";
        System.out.println(expected_page);
        assertEquals(expected_page, getDriver().getTitle());
    }
}