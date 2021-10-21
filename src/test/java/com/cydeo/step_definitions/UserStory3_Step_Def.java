package com.cydeo.step_definitions;

import com.cydeo.pages.DashBoardPage;
import com.cydeo.pages.FilesModulePage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.Navigation;
import com.cydeo.utilities.ConfigReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class UserStory3_Step_Def {
    LoginPage loginPage = new LoginPage();

    @Given("Login as a User")
    public void login_as_a_user() {
        //System.out.println("@Given code can use as: login_as_a_user");
        loginPage.goTo();
        loginPage.login(ConfigReader.readProperty("username1"), ConfigReader.readProperty("password"));

    }

    @When("Click the file module Btn")
    public void goToFilePage(){
        Navigation.goToLink("Files");
        System.out.println("File is opened");

}

    @Then("Verify the page tile is {string}")
    public void verifyThePageTileIs(String arg0) {
       // System.out.println("@Then code can use as: verifyThePageTileIs");
        assertTrue(new FilesModulePage().isOnFilePage());
    }


    @When("Click the top  left checkBox of the table")
    public void click_the_top_left_check_box_of_the_table() {
        System.out.println("When code is used in: click_the_top_left_check_box_of_the_table");
    }

    @Then("assert all files are selected")
    public void assert_all_files_are_selected() {
        System.out.println("Then code is used to: assert_all_files_are_selected");


    }



    }

