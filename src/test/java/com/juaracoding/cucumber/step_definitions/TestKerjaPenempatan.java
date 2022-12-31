package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.KerjaPenempatanPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestKerjaPenempatan {
	
	WebDriver driver;
	private static ExtentTest extentTest;
	private KerjaPenempatanPage Penempatan= new KerjaPenempatanPage();
	
	public TestKerjaPenempatan() {
		driver = Hooks.driver;
		extentTest = Hooks.extentTest;
		driver.get(Constants.URLPenempatan);
	}
	
	//Add data kerja penempatan invalid
	@When("User click button submit add penempatan")
	public void user_click_button_submit_add_penempatan() {
	    Penempatan.clickAddButton();
		extentTest.log(LogStatus.PASS, "User click button submit add penempatan");
	}
	@Then("User get field null alert penempatan")
	public void user_get_field_null_alert_penempatan() {
		Assert.assertEquals(Penempatan.getNullAlert(), "");
		extentTest.log(LogStatus.PASS, "User get field null alert penempatan");
	}
	//Add data kerja penempatan valid
	@When("User enter unit kerja penempatan")
	public void user_enter_unit_kerja_penempatan() {
		Penempatan.enterUnitKerja("KANTOR PUSAT - BIRO ANTI FRAUD - 1387");
		extentTest.log(LogStatus.PASS, "User enter unit kerja penempatan");
	}
	@When("User enter kode cabang pembayaran")
	public void user_enter_kode_cabang_pembayaran() {
		Penempatan.enterKodeCabang("0998");
		extentTest.log(LogStatus.PASS, "User enter kode cabang pembayaran");
	}
	@When("User enter RCC pembayaran")
	public void user_enter_rcc_pembayaran() {
		Penempatan.enterRCCPembayaran("080");
		extentTest.log(LogStatus.PASS, "User enter RCC pembayaran");
	}
	@When("User select status")
	public void user_select_status() {
	    Penempatan.clickSelectStatus();
		extentTest.log(LogStatus.PASS, "User select status");
	}
	@Then("User get alert success add penempatan")
	public void user_get_alert_success_add_penempatan() {
	    Assert.assertEquals(driver.switchTo().alert().getText(), "Data Berhasil Disimpan!");
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "User get alert success add penempatan");
	}
	//Edit data kerja penempatan invalid
	@When("User click grid button penempatan")
	public void user_click_grid_button_penempatan() {
	    Penempatan.clickGridButton();
	    extentTest.log(LogStatus.PASS, "User click grid button penempatan");
	}
	@When("User click edit button penempatan")
	public void user_click_edit_button_penempatan() {
	    Penempatan.clickEditButton();
	    extentTest.log(LogStatus.PASS, "User click edit button penempatan");
	}
	@When("User delete field penempatan")
	public void user_delete_field_penempatan() {
	    Penempatan.deleteField();
	    extentTest.log(LogStatus.PASS, "User delete field penempatan");
	}
	@When("User click button update penempatan")
	public void user_click_button_update_penempatan() {
	    Penempatan.clickUpdateButton();
	    extentTest.log(LogStatus.PASS, "User click button update penempatan");
	}
	@Then("User get field edit null alert penempatan")
	public void user_get_field_edit_null_alert_penempatan() {
	    Assert.assertEquals(Penempatan.getNullAlert(), "");
	    extentTest.log(LogStatus.PASS, "User get field edit null alert penempatan");
	}
	//Edit data kerja penempatan valid
	@When("User edit field penempatan")
	public void user_edit_field_penempatan() {
	    Penempatan.enterUnitKerja("8");
	    extentTest.log(LogStatus.PASS, "User edit field penempatan");
	}
	@Then("User get alert success update penempatan")
	public void user_get_alert_success_update_penempatan() {
	    Assert.assertEquals(driver.switchTo().alert().getText(), "Data Berhasil Diupdate!");
		driver.switchTo().alert().accept();
		extentTest.log(LogStatus.PASS, "User get alert success update penempatan");
	}
	//Cancel edit data kerja penempatan
	@When("User click cancel button penempatan")
	public void user_click_cancel_button_penempatan() {
	    Penempatan.clickCancelButton();
		extentTest.log(LogStatus.PASS, "User click cancel button penempatan");
	}
	@Then("User back to kerja penempatan page")
	public void user_back_to_kerja_penempatan_page() {
	    Assert.assertEquals(driver.getCurrentUrl().toString(), "https://dev.ptdika.com/tiket.com/wpu/master_wpu");
		extentTest.log(LogStatus.PASS, "User back to kerja penempatan page");
	}
	//Show 10 data kerja penempatan
		@When("User click 10option penempatan")
		public void user_click_10option_penempatan() {
			Penempatan.clickOption10();
			extentTest.log(LogStatus.PASS, "User click option 10");
		}
		@Then("User get 10data penempatan")
		public void user_get_10data_penempatan() {
			Hooks.delay(1);
			Assert.assertEquals(Penempatan.getData10(), "1");
			extentTest.log(LogStatus.PASS, "User get 10 data penempatan");
		}
		//Show 25 data kerja penempatan
		@When("User click 25option penempatan")
		public void user_click_25option_penempatan() {
			Penempatan.clickOption25();
			extentTest.log(LogStatus.PASS, "User click option 25");
		}
		@Then("User get 25data penempatan")
		public void user_get_25data_penempatan() {
			Hooks.delay(1);
			Assert.assertEquals(Penempatan.getData25(), "11");
			extentTest.log(LogStatus.PASS, "User get 25 data penempatan");
		}
		//Show 50 data kerja penempatan
		@When("User click 50option penempatan")
		public void user_click_50option_penempatan() {
			Penempatan.clickOption50();
			extentTest.log(LogStatus.PASS, "User click option 50");
		}
		@Then("User get 50data penempatan")
		public void user_get_50data_penempatan() {
			Hooks.delay(1);
			Assert.assertEquals(Penempatan.getData50(), "26");
			extentTest.log(LogStatus.PASS, "User get 50 data penempatan");
		}
		//Show 100 data kerja penempatan
		@When("User click 100option penempatan")
		public void user_click_100option_penempatan() {
			Penempatan.clickOption100();
			extentTest.log(LogStatus.PASS, "User click option 100");
		}
		@Then("User get 100data penempatan")
		public void user_get_100data_penempatan() {
			Hooks.delay(1);
			Assert.assertEquals(Penempatan.getData100(), "51");
			extentTest.log(LogStatus.PASS, "User get 100 data penempatan");
		}
		//Search data kerja penempatan
		@When("User enter search keyword penempatan")
		public void user_enter_search_keyword_penempatan() {
		    Penempatan.enterSearch("search");
			extentTest.log(LogStatus.PASS, "User enter search keyword");
		}
		@Then("User get data penempatan")
		public void user_get_data_penempatan() {
			Assert.assertEquals(Penempatan.getSearchdata(), "search");
			extentTest.log(LogStatus.PASS, "User get data penempatan");
		}
}
