package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.ReportAbsenPulang;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;


public class TestReportAbsenPulang {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ReportAbsenPulang reportAbsenPulang = new ReportAbsenPulang();

    public TestReportAbsenPulang(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("TCC.pulang User click Report Absen")
    public void tcc_pulang_user_click_report_absen() {
        reportAbsenPulang.menuReportAbsen();
        extentTest.log(LogStatus.PASS, "User click Report Absen");
    }

    @When("TCC.pulang User click absen pulang")
    public void tcc_pulang_user_click_absen_pulang() {
        reportAbsenPulang.absenPulang();
        extentTest.log(LogStatus.PASS, "User click absen pulang");
    }

    @When("TCC.pulang user click position")
    public void tcc_pulang_user_click_position() {
        reportAbsenPulang.position();
        extentTest.log(LogStatus.PASS,"user click position");
    }

    @When("TCC.pulang user select position")
    public void tcc_pulang_user_select_position() {
        reportAbsenPulang.positionAll();
        extentTest.log(LogStatus.PASS, "user select position");
    }

    @When("TCC.pulang user click branch")
    public void tcc_pulang_user_click_branch() {
        reportAbsenPulang.branch();
        extentTest.log(LogStatus.PASS, "user click branch");
    }

    @When("TCC.pulang user select branch")
    public void tcc_pulang_user_select_branch() {
        reportAbsenPulang.branchAll();
        extentTest.log(LogStatus.PASS, "user select branch");
    }

    @When("TCC.pulang user click unit")
    public void tcc_pulang_user_click_unit() {
        reportAbsenPulang.unit();
        extentTest.log(LogStatus.PASS, "user clict unit");
    }

    @When("TCC.pulang user select unit")
    public void tcc_pulang_user_select_unit() {
        reportAbsenPulang.unitAll();
        extentTest.log(LogStatus.PASS, "user select unit");
    }

    @When("TCC.pulang user input start date")
    public void tcc_pulang_user_input_start_date() {
        reportAbsenPulang.startDate("2022-09-01");
        extentTest.log(LogStatus.PASS, "user input start date");
    }

    @When("TCC.pulang user input end date")
    public void tcc_pulang_user_input_end_date() {
        reportAbsenPulang.endDate("2022-09-11");
        extentTest.log(LogStatus.PASS, "user input end date");
    }

    @Then("TCC.pulang User valid report pulang")
    public void tcc_pulang_user_valid_report_pulang() {
        reportAbsenPulang.submit();
        extentTest.log(LogStatus.PASS, "user valid report pulang");
    }

    @Given("TCC.pulang User invalid report masuk")
    public void tcc_pulang_user_invalid_report_masuk() {
        reportAbsenPulang.submit();
        extentTest.log(LogStatus.PASS, "user invalid report masuk");
    }

    @Then("TCC.pulang user get alert no data")
    public void tcc_pulang_user_get_alert_no_data() {
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
    }




}
