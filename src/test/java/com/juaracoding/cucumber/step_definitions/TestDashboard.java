package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.DashboardPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDashboard {

    WebDriver driver;
    private static ExtentTest extentTest;
    private DashboardPage dashboardPage = new DashboardPage();

    public TestDashboard() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click menu Dashboard")
    public void user_click_menu_dashboard() {
//		Hooks.delay(1);
        dashboardPage.menuDashboard();
        extentTest.log(LogStatus.PASS, "User click menu Dashboard");
    }

    @Then("User on menu Dashboard")
    public void user_on_menu_dashboard() {
        //Sengaja fail untuk uji fungsi screenshot
        Assert.assertEquals(dashboardPage.getTxtDashboard(), "Launching Soo");
        extentTest.log(LogStatus.PASS, "User on menu Dashboard");
    }

}
