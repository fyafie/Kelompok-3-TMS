package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.ReportPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestReportAbsenMasuk {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReportPage reportPage = new ReportPage();

    public TestReportAbsenMasuk(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("user on menu dashboard")
    public void user_on_menu_dashboard() {
        Assert.assertEquals(reportPage.getTxtDashboard(), "Dashboard");
        extentTest.log(LogStatus.PASS, "User on menu Requirement");
    }
    @And("User click Report Absen")
    public void user_click_report_absen() {
        reportPage.menuReportAbsen();
        extentTest.log(LogStatus.PASS, "User click Report Absen");
    }

    @And("User click absen masuk")
    public void user_click_absen_masuk() {
        reportPage.absenMasuk();
        extentTest.log(LogStatus.PASS, "User click absen masuk");
    }

    @And("user click position")
    public void user_click_position() {
        reportPage.position();
        extentTest.log(LogStatus.PASS,"user click position");
    }

    @And("user select position")
    public void user_select_position() {
        reportPage.positionAll();
        extentTest.log(LogStatus.PASS, "user select position");
    }

    @And("user click branch")
    public void user_click_branch() {
        reportPage.branch();
        extentTest.log(LogStatus.PASS, "user click branch");
    }

    @And("user select branch")
    public void user_select_branch() {
        reportPage.branchAll();
        extentTest.log(LogStatus.PASS, "user select branch");
    }

    @And("user click unit")
    public void user_click_unit() {
        reportPage.unit();
        extentTest.log(LogStatus.PASS, "user clict unit");
    }

    @And("user select unit")
    public void user_select_unit() {
        reportPage.unitAll();
        extentTest.log(LogStatus.PASS, "user select unit");
    }

    @And("user input start date")
    public void user_input_start_date() {
       reportPage.startDate("2022-09-01");
       extentTest.log(LogStatus.PASS, "user input start date");
    }

    @And("user input end date")
    public void user_input_end_date() {
        reportPage.endDate("2022-09-11");
        extentTest.log(LogStatus.PASS, "user input end date");
    }

    @Then("User valid report masuk")
    public void user_valid_report_masuk() {
        reportPage.submit();
        extentTest.log(LogStatus.PASS, "user valid report masuk");
    }
}
