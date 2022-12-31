package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.ParameterShiftingPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestParameterShifting {
	
	WebDriver driver;
	private static ExtentTest extentTest;
	private ParameterShiftingPage Shifting= new ParameterShiftingPage();
	
	public TestParameterShifting() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
		driver.get(Constants.URLShfting);
	}
	
	//Add data parameter shifting invalid
	@When("User click button add shifting")
	public void user_click_button_add_shifting() {
		Shifting.clickAddButton();
		extentTest.log(LogStatus.PASS, "User click button add shifting");
	}
	@When("User click button submit shifting")
	public void user_click_button_submit_shifting() {
		Shifting.clickSubmitButton();
		extentTest.log(LogStatus.PASS, "User click button submit shifting");
	}
	@Then("User get field null alert shifting")
	public void user_get_field_null_alert_shifting() {
		Hooks.delay(2);
		Assert.assertEquals(Shifting.getNullAlert(), "The Unit field is required.");
		extentTest.log(LogStatus.PASS, "User get field null alert shifting");
	}
	//Add data parameter shifting valid
	@When("User select unit")
	public void user_select_unit() {
	    Shifting.selectUnit();
		extentTest.log(LogStatus.PASS, "User select unit");
	}
	@When("User enter nama shift")
	public void user_enter_nama_shift() {
	    Shifting.EnterNamaShift("D1");
		extentTest.log(LogStatus.PASS, "User enter nama shift");
	}
	@When("User enter jam mulai")
	public void user_enter_jam_mulai() {
	    Shifting.EnterJamMulai("06:00");
		extentTest.log(LogStatus.PASS, "User enter jam mulai");
	}
	@When("User enter jam selesai")
	public void user_enter_jam_selesai() {
	    Shifting.EnterJamSelesai("15:00");
		extentTest.log(LogStatus.PASS, "User enter jam selesai");
	}
	@Then("User get success alert shifting")
	public void user_get_success_alert_shifting() {
		Hooks.delay(2);
	    Assert.assertEquals(Shifting.getSuccessAlert(), "Success!");
		extentTest.log(LogStatus.PASS, "User get field success alert");
	}
	//Cancel Add data parameter shifting
	@When("User click button back shifting")
	public void user_click_button_back_shifting() {
		Shifting.clickBackButton();
		extentTest.log(LogStatus.PASS, "User click button back shifting");
	}
	@Then("User back to parameter shifting page")
	public void user_back_to_parameter_shifting_page() {
		Hooks.delay(2);
		Assert.assertEquals(Shifting.getEditNullAlert(), "Tambah");
		extentTest.log(LogStatus.PASS, "User back to parameter shifting page");
	}
	//Edit data parameter shifting invalid
	@When("User delete field shifting")
	public void user_delete_field_shifting() {
	    Shifting.deleteField();
		extentTest.log(LogStatus.PASS, "User delete field shifting");
	}
	@When("User get field edit null alert shifting")
	public void user_get_field_edit_null_alert_shifting() {
		Hooks.delay(2);
	    Assert.assertEquals(Shifting.getEditNullAlert(), "Form Add");
		extentTest.log(LogStatus.PASS, "User get field edit null alert shifting");
	}
	//Edit data parameter shifting valid
	@When("User click grid button shifting")
	public void user_click_grid_button_shifting() {
		Shifting.clickGridButton();
		extentTest.log(LogStatus.PASS, "User click grid button shifting");
	}
	@When("User click edit button shifting")
	public void user_click_edit_button_shifting() {
		Hooks.delay(1);
		Shifting.clickEditButton();
		extentTest.log(LogStatus.PASS, "User click edit button shifting");
	}
	@When("User edit field shifting")
	public void user_edit_field_shifting() {
		
		extentTest.log(LogStatus.PASS, "User edit field");
	}
	//Delete data parameter shifting
	@When("User click delete button shifting")
	public void user_click_delete_button_shifting() {
		Hooks.delay(1);
		Shifting.clickDeleteButton();
		extentTest.log(LogStatus.PASS, "User click delete button shifting");
	}
	@When("User click ok shifting")
	public void user_click_ok_shifting() {
	    driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "User click ok");
	}
	//Cancel delete data parameter shifting
	@Then("User click cancel shifting")
	public void user_click_cancel_shifting() {
	    Assert.assertEquals(driver.switchTo().alert().getText(), "Sure ?");
		driver.switchTo().alert().dismiss();
		extentTest.log(LogStatus.PASS, "User click cancel");
	}
	//Show 10 data parameter shifting
	@When("User click 10option shifting")
	public void user_click_10option_shifting() {
		Shifting.clickOption10();
		extentTest.log(LogStatus.PASS, "User click option 10");
	}
	@Then("User get 10data shifting")
	public void user_get_10data_shifting() {
		Hooks.delay(1);
		Assert.assertEquals(Shifting.getData10(), "1");
		extentTest.log(LogStatus.PASS, "User get 100 data shifting");
	}
	//Show 25 data parameter shifting
	@When("User click 25option shifting")
	public void user_click_25option_shifting() {
		Shifting.clickOption25();
		extentTest.log(LogStatus.PASS, "User click option 25");
	}
	@Then("User get 25data shifting")
	public void user_get_25data_shifting() {
		Hooks.delay(1);
		Assert.assertEquals(Shifting.getData25(), "11");
		extentTest.log(LogStatus.PASS, "User get 100 data shifting");
	}
	//Show 50 data parameter shifting
	@When("User click 50option shifting")
	public void user_click_50option_shifting() {
		Shifting.clickOption50();
		extentTest.log(LogStatus.PASS, "User click option 50");
	}
	@Then("User get 50data shifting")
	public void user_get_50data_shifting() {
		Hooks.delay(1);
		Assert.assertEquals(Shifting.getData50(), "26");
		extentTest.log(LogStatus.PASS, "User get 100 data shifting");
	}
	//Then("User get 100data shifting")
	@When("User click 100option shifting")
	public void user_click_100option_shifting() {
		Shifting.clickOption100();
		extentTest.log(LogStatus.PASS, "User click option 100");
	}
	@Then("User get 100data shifting")
	public void user_get_100data_shifting() {
		Hooks.delay(1);
		Assert.assertEquals(Shifting.getData100(), "51");
		extentTest.log(LogStatus.PASS, "User get 100 data shifting");
	}
	//
	@When("User enter search keyword shifting")
	public void user_enter_search_keyword_shifting() {
		Shifting.enterSearch("search");
		extentTest.log(LogStatus.PASS, "User enter search keyword");
	}
	@Then("User get data shifting")
	public void user_get_data_shifting() {
		Hooks.delay(1);
		Assert.assertEquals(Shifting.getSearchdata(), "search");
		extentTest.log(LogStatus.PASS, "User get data shifting");
	}
}
