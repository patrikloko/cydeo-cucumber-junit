package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

/*
In the class we will be able to pass pre- & post- conditions to
 each scenario and each step
 */
public class Hooks {
    //import from io.cucumber.java not from junit
    @Before(order = 1)
    public void setupScenario() {
        System.out.println("====Setting up browser using cucumber @Before");
    }
    @Before(value = "@login", order = 2)
    public void setupScenarioForLogins() {
        System.out.println("====only apply to scenarios with @login tag");
    }
    @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("====only apply to scenarios with @db tag");
    }
    @After
    public void teardownScenario() {
        System.out.println("====Setting up browser using cucumber @After");
        System.out.println("====Scenario ended/ Take a screenshot if failed!");

    }
    @BeforeStep
    public void setupStep() {
        System.out.println("-------Applying setup using @BeforeStep");
    }
    @AfterStep
    public void afterStep() {
        System.out.println("-------applying teardown using @AfterStep");
    }


}
