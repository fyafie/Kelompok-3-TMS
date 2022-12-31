package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //T1 User go to invalid Web SIT
    @When("User go to invalid Web SIT")
    public void user_go_to_invalid_web_sit() {
    	driver.get(Constants.URL2);
        extentTest.log(LogStatus.PASS, "User go to Web SIT");
    }
    @Then("User invalid credentials website")
    public void user_invalid_credentials_website() {
    	Assert.assertEquals(loginPage.getInvalidWebsite(), "404 Page Not Found");
    	extentTest.log(LogStatus.PASS, "User invalid credentials website");
    }
    //T1 User go to invalid Web SIT
    
    //T2 User go to website
    @When("User go to Web SIT")
    public void user_go_to_Web_HRM() {
        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User go to Web SIT");
    }
    
    @Then("User valid credentials website")
    public void user_valid_credentials_website() {
    	Hooks.delay(1);
    	Assert.assertEquals(loginPage.getValidWebsite(), "Login menggunakan NIK & DOB");
    	extentTest.log(LogStatus.PASS, "User valid credentials website");
    }
    //T2 User go to website
    
    //T3 User login null username and null password
    @When("User enter null username null password")
    public void user_enter_null_username_null_password() {
    	loginPage.login("", "");
    	extentTest.log(LogStatus.PASS, "User enter null username & null password");
    }
    //T3 User login null username and null password
    
    //T4 User login null username and invalid password
    @When("User enter null username invalid password")
    public void user_enter_null_username_invalid_password() {
    	loginPage.login("", "password");
    	extentTest.log(LogStatus.PASS, "User enter null username invalid password");
    }
    //T4 User login null username and invalid password
    
    //T5 User login null username and valid password
    @When("User enter null username valid password")
    public void user_enter_null_username_valid_password() {
    	loginPage.login("", "d1k4@passw0rd");
    	extentTest.log(LogStatus.PASS, "User enter null username valid password");
    }
    //T5 User login null username and valid password
    
    //T6 User login invalid username and null password
    @When("User enter invalid username null password")
    public void user_enter_invalid_username_null_password() {
    	loginPage.login("username", "");
        extentTest.log(LogStatus.PASS, "User enter null username valid password");
    }
    //T6 User login invalid username and null password
     
    //T7 User login invalid username and invalid password
    @When("User enter invalid username invalid password")
    public void user_enter_invalid_username_invalid_password() {
    	loginPage.login("username", "d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter invalid username invalid password");
    }
    //T7 User login invalid username and invalid password
    
    //T8 User enter invalid username valid password
    @When("User enter invalid username valid password")
    public void user_enter_invalid_username_valid_password() {
    	loginPage.login("username", "password");
        extentTest.log(LogStatus.PASS, "User enter invalid username valid password");
    }
    //T8 User enter invalid username valid password
    
    //T9 User login valid username and null password
    @When("User enter valid username null password")
    public void user_enter_valid_username_null_password() {
    	loginPage.login("admin_tms", "");
    	extentTest.log(LogStatus.PASS, "User enter valid username null password");
    }
    //T9 User login valid username and null password
    
    //T10 User enter valid username invalid password
    @When("User enter valid username invalid password")
    public void user_enter_valid_username_invalid_password() {
    	loginPage.login("admin_tms", "password");
    	extentTest.log(LogStatus.PASS, "User enter valid username invalid password");
    }
    //T10 User enter valid username invalid password
    
    @Then("User invalid credentials")
    public void user_invalid_credentials() {
    	Hooks.delay(1);
    	Assert.assertEquals(loginPage.getInvalidAlert(), "×");
        extentTest.log(LogStatus.PASS, "User get invalid password alert");
    }
    @Then("User get null username alert")
    public void user_get_null_username_alert() {
        Assert.assertEquals(loginPage.getUsernameNullAlert(), "");
        extentTest.log(LogStatus.PASS, "User username get null alert");
    }
    @Then("User get null password alert")
    public void user_get_null_password_alert() {
    	Assert.assertEquals(loginPage.getPasswordNullAlert(), "");
    	extentTest.log(LogStatus.PASS, "User password get null alert");
    }
    //T11 User valid login
    @And("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.login("admin_tms", "d1k4@passw0rd");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }

    @And("User click button login")
    public void user_click_button_login() {
        loginPage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "User click button login");
    }
    
    @Then("User valid credentials")
    public void user_valid_credentials() {
    	Hooks.delay(1);
    	Assert.assertEquals(loginPage.getDashboardTxt(), "Dashboard");
    	extentTest.log(LogStatus.PASS, "User valid credentials");
    }
    //T11 User valid login
    //User valid logout
    @When("User click profile")
    public void user_click_profile() {
    	loginPage.clickProfile();
    	extentTest.log(LogStatus.PASS, "User click profile");
    }
    @When("User click logout button")
    public void user_click_logout_button() {
    	loginPage.clickLogoutButton();
    	extentTest.log(LogStatus.PASS, "User click logout button");
    }
    @Then("User back to login page")
    public void User_back_to_login_page() {
    	Assert.assertEquals(driver.getCurrentUrl(), "https://dev.ptdika.com/tiket.com/login");
    	extentTest.log(LogStatus.PASS, "User back to login page");
    	loginPage.login("admin_tms", "d1k4@passw0rd");
    	loginPage.clickBtnLogin();
    }
}
