package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.ReportAbsenPulang;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;


public class TestReportAbsenPulang {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReportAbsenPulang reportAbsenPulang = new ReportAbsenPulang();

    public TestReportAbsenPulang(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click Report Absen")
    public void user_click_report_absen() {
        reportAbsenPulang.menuReportAbsen();
        extentTest.log(LogStatus.PASS, "User click Report Absen");
    }

    @And("User click absen pulang")
    public void user_click_absen_pulang() {
        reportAbsenPulang.absenPulang();
        extentTest.log(LogStatus.PASS, "User click absen masuk");
    }

    @And("user click position")
    public void user_click_position() {
        reportAbsenPulang.position();
        extentTest.log(LogStatus.PASS,"user click position");
    }

    @And("user select position")
    public void user_select_position() {
        reportAbsenPulang.positionAll();
        extentTest.log(LogStatus.PASS, "user select position");
    }

    @And("user click branch")
    public void user_click_branch() {
        reportAbsenPulang.branch();
        extentTest.log(LogStatus.PASS, "user click branch");
    }

    @And("user select branch")
    public void user_select_branch() {
        reportAbsenPulang.branchAll();
        extentTest.log(LogStatus.PASS, "user select branch");
    }

    @And("user click unit")
    public void user_click_unit() {
        reportAbsenPulang.unit();
        extentTest.log(LogStatus.PASS, "user clict unit");
    }

    @And("user select unit")
    public void user_select_unit() {
        reportAbsenPulang.unitAll();
        extentTest.log(LogStatus.PASS, "user select unit");
    }

    @And("user input start date")
    public void user_input_start_date() {
        reportAbsenPulang.startDate("2022-09-01");
        extentTest.log(LogStatus.PASS, "user input start date");
    }

    @And("user input end date")
    public void user_input_end_date() {
        reportAbsenPulang.endDate("2022-09-11");
        extentTest.log(LogStatus.PASS, "user input end date");
    }

    @Then("User valid report pulang")
    public void user_valid_report_pulang() {
        reportAbsenPulang.submit();
        extentTest.log(LogStatus.PASS, "user valid report pulang");
    }
}
