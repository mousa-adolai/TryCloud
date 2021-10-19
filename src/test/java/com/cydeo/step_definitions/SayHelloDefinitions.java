package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.Assert.*;

public class SayHelloDefinitions {

    @Given("smile")
    public void smile(){
        System.out.println("Smile");
    }

    @Then("{word} says hello to the world")
    public void helloWorld(String name){
        System.out.println("name = " + name);
        fail();
    }
}
