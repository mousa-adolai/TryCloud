package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStory3_Step_Def {

    @Given("Login as a User")
    public void login_as_a_user() {
        System.out.println("@Given code can use as: login_as_a_user");
    }

    @Then("Verify the page tile is \"Files-Trycloud")
    public void verify_the_page_tile_is_files_trycloud() {
        System.out.println("@Then code can use as: verify_the_page_tile_is_files_trycloud");
    }

    @Given("login as a user")
    public void loginAsAUser() {


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
