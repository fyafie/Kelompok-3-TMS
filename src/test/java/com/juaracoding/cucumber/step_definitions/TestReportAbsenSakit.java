package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.ReportAbsenSakit;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.nio.file.WatchEvent;

public class TestReportAbsenSakit {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReportAbsenSakit reportAbsenSakit = new ReportAbsenSakit();

    public TestReportAbsenSakit(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("TCC.sakit User click Report Absen")
    public void tcc_sakit_user_click_report_absen() {
        reportAbsenSakit.menuReportAbsen();
        extentTest.log(LogStatus.PASS, "user click report absen");

    }
    @When("TCC.sakit User click absen sakit")
    public void tcc_sakit_user_click_absen_sakit() {
        reportAbsenSakit.absenSakit();
        extentTest.log(LogStatus.PASS, "user click absen sakit");
    }

    @When("TCC.sakit user click position")
    public void tcc_sakit_user_click_position() {
        reportAbsenSakit.position();
        extentTest.log(LogStatus.PASS,"user click position");
    }
    @When("TCC.sakit user select position")
    public void tcc_sakit_user_select_position() {
        reportAbsenSakit.position();
        extentTest.log(LogStatus.PASS, "user select position");
    }
    @When("TCC.sakit user click branch")
    public void tcc_sakit_user_click_branch() {
        reportAbsenSakit.branch();
        extentTest.log(LogStatus.PASS, "user click branch");
    }
    @When("TCC.sakit user select branch")
    public void tcc_sakit_user_select_branch() {
       reportAbsenSakit.branchAll();
       extentTest.log(LogStatus.PASS, "user select branch");
    }
    @When("TCC.sakit user click unit")
    public void tcc_sakit_user_click_unit() {
        reportAbsenSakit.unit();
        extentTest.log(LogStatus.PASS, "user click unit");
    }
    @When("TCC.sakit user select unit")
    public void tcc_sakit_user_select_unit() {
        reportAbsenSakit.unit();
        extentTest.log(LogStatus.PASS, "user select unit");
    }
    @When("TCC.sakit user input start date")
    public void tcc_sakit_user_input_start_date() {
        reportAbsenSakit.startDate("2022-12-27");
        extentTest.log(LogStatus.PASS, "user input start date");
    }
    @When("TCC.sakit user input end date")
    public void tcc_sakit_user_input_end_date() {
       reportAbsenSakit.endDate("2022-12-27");
       extentTest.log(LogStatus.PASS, "user input end date");
    }
    @Then("TCC.sakit User valid report sakit")
    public void tcc_sakit_user_valid_report_sakit() {
        reportAbsenSakit.submit();
        extentTest.log(LogStatus.PASS, "user valid report sakit");
    }


}

