package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.ReportPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestReportAbsen {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReportPage reportPage = new ReportPage();

    public TestReportAbsen(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("User click Report Absen")
    public void user_click_report_absen() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("User click absen masuk")
    public void user_click_absen_masuk() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user click position")
    public void user_click_position() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user select position")
    public void user_select_position() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user click branch")
    public void user_click_branch() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user select branch")
    public void user_select_branch() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user click unit")
    public void user_click_unit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user select unit")
    public void user_select_unit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user input start date")
    public void user_input_start_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @And("user input end date")
    public void user_input_end_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User valid report masuk")
    public void user_valid_report_masuk() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
