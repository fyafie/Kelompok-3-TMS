package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.MasterPositionPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestMasterPosition {
	
	WebDriver driver;
	private static ExtentTest extentTest;
	private MasterPositionPage Position= new MasterPositionPage();
	
	public TestMasterPosition() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
		driver.get(Constants.URLPosition);
	}
	//Add data master position invalid
	@When("User click button submit add position")
	public void user_click_button_submit_add_position() {
	    Position.clickAddButton();
	    extentTest.log(LogStatus.PASS, "User click button submit add position");
	}
	@Then("User get field null alert position")
	public void user_get_field_null_alert_position() {
	    Hooks.delay(2);
		Position.getNullAlert();
	    extentTest.log(LogStatus.PASS, "User get field null alert position");
	}
	
	//Add data master position valid
	@When("User enter jenis pekerjaan")
	public void user_enter_jenis_pekerjaan() {
	    Position.enterJenisPekerjaan("ADMINISTRASI");
	    extentTest.log(LogStatus.PASS, "User enter jenis pekerjaan");
	}
	@When("User enter posisi")
	public void user_enter_posisi() {
		Position.enterPosisi("ADMINISTRASI CABANG-APK - P000056");
		extentTest.log(LogStatus.PASS, "User select status");
	}
	@When("User enter standarisasi upah")
	public void user_enter_standarisasi_upah() {
		Position.enterUpah("110%");
		extentTest.log(LogStatus.PASS, "User enter posisi");
	}
	@When("User select status position")
	public void user_select_status_position() {
	    Position.selectStatus();
	    extentTest.log(LogStatus.PASS, "User select status position");
	}
	@Then("User get alert success add position")
	public void user_get_alert_success_add_position() {
	    Assert.assertEquals(driver.switchTo().alert().getText(), "Data Berhasil Disimpan!");
	    driver.switchTo().alert().accept();
	    extentTest.log(LogStatus.PASS, "User get alert success add position");
	}
	
	//Edit data master position invalid
	@When("User click grid button position")
	public void user_click_grid_button_position() {
		Position.clickGridButton();
		extentTest.log(LogStatus.PASS, "User click grid button position");
	}
	@When("User click edit button position")
	public void user_click_edit_button_position() {
		Position.clickEditButton();
		extentTest.log(LogStatus.PASS, "User click edit button position");
	}
	@When("User delete field position")
	public void user_delete_field_position() {
		Position.deleteField();
		extentTest.log(LogStatus.PASS, "User delete field position");
	}
	@When("User click button update position")
	public void user_click_button_update_position() {
		Position.clickUpdateButton();
		extentTest.log(LogStatus.PASS, "User click button update position");
	}
	@Then("User get field edit null alert position")
	public void user_get_field_edit_null_alert_position() {
		Assert.assertEquals(Position.getNullAlert(), "");
		extentTest.log(LogStatus.PASS, "User get field edit null alert position");
	}
	
	//Edit data master position valid
	@When("User edit field position")
	public void user_edit_field_position() {
		Position.enterPosisi("0");
		extentTest.log(LogStatus.PASS, "User select status");
	}
	@Then("User get alert success update position")
	public void user_get_alert_success_update_position() {
		Assert.assertEquals(driver.switchTo().alert().getText(), "Data Berhasil Diupdate!");
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "User select status");
	}
	
	//Cancel edit data master position
	@When("User click cancel button position")
	public void user_click_cancel_button_position() {
		Position.clickCancelButton();
		extentTest.log(LogStatus.PASS, "User click cancel button position");
	}
	@Then("User back to master position page")
	public void user_back_to_master_position_page() {
		Assert.assertEquals(driver.getCurrentUrl().toString(), "https://dev.ptdika.com/tiket.com/position_tms/master_p_tms");
		extentTest.log(LogStatus.PASS, "User back to master position page");
	}
	//Show 10 data kerja position
	@When("User click 10option position")
	public void user_click_10option_position() {
		Position.clickOption10();
		extentTest.log(LogStatus.PASS, "User click option 10");
	}
	@Then("User get 10data position")
	public void user_get_10data_position() {
		Hooks.delay(1);
		Assert.assertEquals(Position.getData10(), "1");
		extentTest.log(LogStatus.PASS, "User get 10 data position");
	}
	//Show 25 data kerja position
	@When("User click 25option position")
	public void user_click_25option_position() {
		Position.clickOption25();
		extentTest.log(LogStatus.PASS, "User click option 25");
	}
	@Then("User get 25data position")
	public void user_get_25data_position() {
		Hooks.delay(1);
		Assert.assertEquals(Position.getData25(), "11");
		extentTest.log(LogStatus.PASS, "User get 25 data position");
	}
	//Show 50 data kerja position
	@When("User click 50option position")
	public void user_click_50option_position() {
		Position.clickOption50();
		extentTest.log(LogStatus.PASS, "User click option 50");
	}
	@Then("User get 50data position")
	public void user_get_50data_position() {
		Hooks.delay(1);
		Assert.assertEquals(Position.getData50(), "26");
		extentTest.log(LogStatus.PASS, "User get 50 data position");
	}
	//Show 100 data kerja position
	@When("User click 100option position")
	public void user_click_100option_position() {
		Position.clickOption100();
		extentTest.log(LogStatus.PASS, "User click option 100");
	}
	@Then("User get 100data position")
	public void user_get_100data_position() {
		Hooks.delay(1);
		Assert.assertEquals(Position.getData100(), "51");
		extentTest.log(LogStatus.PASS, "User get 100 data position");
	}
	//Search data kerja position
	@When("User enter search keyword position")
	public void user_enter_search_keyword_position() {
	    Position.enterSearch("search");
		extentTest.log(LogStatus.PASS, "User enter search keyword");
	}
	@Then("User get data position")
	public void user_get_data_position() {
		Hooks.delay(1);
		Assert.assertEquals(Position.getSearchdata(), "search");
		extentTest.log(LogStatus.PASS, "User get data position");
	}
}
