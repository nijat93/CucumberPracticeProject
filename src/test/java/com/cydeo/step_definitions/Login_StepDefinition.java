package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {


    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("user is on the library login page");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("user enters librarian username");

    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");

    }
    @Then("user should be see dashboard")
    public void user_should_be_see_dashboard() {
        System.out.println("user should be see dashboard");

    }

    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("user enters student username");

    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("user enters student password");

    }

    @When("user enters admin username")
    public void user_Enters_Admin_Username() {
        System.out.println("user enters admin username");

    }

    @And("user enters admin password")
    public void user_Enters_Admin_Password() {
        System.out.println("user enters admin password");
    }
}
