package com.steps;

import com.pages.LoginOrangePages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class OrangeHrmLoginSteps {

    LoginOrangePages loginOrangePages = new LoginOrangePages();

    @When("Orange Hrm  webpage open")
    public void orange_hrm_webpage_open() {
        System.out.println("1");
        loginOrangePages.openPage();

    }

    @Then("user provide username and password")
    public void user_provide_username_and_password() {
        System.out.println("2");
        loginOrangePages.verifyLogin("Admin", "admin123");
    }

    @Then("user click login")
    public void user_click_login() {
        System.out.println("3");
        loginOrangePages.clickSubmitButton();

    }

    @Then("user successfully login")
    public void user_successfully_login() {
        System.out.println("4");
        loginOrangePages.verifyUserInDashboard();

    }

    @Given("User logged in")
    public void userLoggedIn() {
        loginOrangePages.openPage();
        loginOrangePages.verifyLogin("Admin", "admin123");
        loginOrangePages.clickSubmitButton();


    }

    @Then("user click my info on menu")
    public void user_click_my_info_on_menu() {
        loginOrangePages.userClickedMyInfo();
    }

    @Then("user click Edit on Personal details")
    public void user_click_edit_on_personal_details() {
        loginOrangePages.userClickedPersonalDetailsEdit();
    }

    @Then("user update personal date")
    public void user_update_personal_date() {
        loginOrangePages.userUpdatePersonalData();
    }


}
