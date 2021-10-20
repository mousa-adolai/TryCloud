package com.cydeo.step_definitions;

import com.cydeo.pages.Navigation;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.cydeo.utilities.Driver.getDriver;
import static org.junit.Assert.assertEquals;

public class NavigationStepsDef {
    Navigation nav = new Navigation();

    @And("user clicks on {string}")
    public void userClicksOn(String str) {
        nav.goToLink(str);
    }

    @Then("user should be on the {string} page")
    public void userShouldBeOnThePage(String str) {
        String expected_page = str.substring(0, 1).toUpperCase() + str.substring(1) + " - Trycloud QA";
        System.out.println(expected_page);
        assertEquals(expected_page, getDriver().getTitle());
    }
}
