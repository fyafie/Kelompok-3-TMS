package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.AbsenIzinPage;
import com.juaracoding.cucumber.pages.AbsenMasukPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenIzin {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private AbsenIzinPage absenIzin = new AbsenIzinPage();
    private LoginPage loginpage = new LoginPage();
    
    public AbsenIzin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
  //TC07
    @When("TCC07.Tampilan Izin")
    public void tcc07_tampilan_izin() {
        loginpage.login("D6200927", "1997-10-23");
        loginpage.clickBtnLogin();
        driver.get(Constants.URLIzin);
        extentTest.log(LogStatus.PASS, "TCC07.Tampilan Izin");
    }
    @And("TCC07.Submit")
  public void tcc07_submit() {
    	absenIzin.clickBtnSubmit();
    	extentTest.log(LogStatus.PASS, "TCC07.Submit");
  }
  @Then("TCC07.User mendapatkan pemberitahuan")
  public void tcc07_user_mendapatkan_pemberitahuan() {
	  Hooks.delay(2);
	  Alert alert = driver.switchTo().alert();
	  String alertMessage = driver.switchTo().alert().getText();
	  Assert.assertEquals(alertMessage, "please select a file");
	  alert.accept();
	  extentTest.log(LogStatus.PASS, "TCC07.User mendapatkan pemberitahuan");
  }
//    TC08
  @When("TCC08.Upload foto selfie")
  public void tcc08_upload_foto_selfie() {
	  driver.get(Constants.URLIzin);
      absenIzin.uploadfoto();
      extentTest.log(LogStatus.PASS, "TCC08.Upload foto selfie");
  }
  @And("TCC08.Input Divisi")
  public void tcc08_input_divisi() {
      absenIzin.clickdivisi();
      extentTest.log(LogStatus.PASS, "TCC08.Input Divisi");
  }
  @And("TCC08.Input tipe Shift")
  public void tcc08_input_tipe_shift() {
  	absenIzin.clicktypeshift();
      absenIzin.clicktypeshift1();
      extentTest.log(LogStatus.PASS, "TCC08.Input tipe Shift");
  }
  @And("TCC08.Input Nama Shift")
  public void tcc08_input_nama_shift() {
      absenIzin.clicknamashift();
      absenIzin.clicknamashift1();
      extentTest.log(LogStatus.PASS, "TCC08.Input Nama Shift");
  }
  @And("TCC08.Input Tipe Absen")
  public void tcc08_input_tipe_absen() {
	  absenIzin.clicktipeabsen();
	  extentTest.log(LogStatus.PASS, "TCC08.Input Tipe Absen");
  }
  @And("TCC08.Isi keterangan")
  public void tcc08_isi_keterangan() {
	  absenIzin.isiketerangan();
	  extentTest.log(LogStatus.PASS, "TCC08.Isi keterangan");
  }
  @Then("TCC08.Submit")
  public void tcc08_submit() {
      absenIzin.clickBtnSubmit();
      extentTest.log(LogStatus.PASS, "TCC08.Submit");
  }
//    TC09
	  @When("TCC09.Klik menu absen izin")
	  public void tcc09_klik_menu_absen_izin() {
	  	driver.get(Constants.URLSakit);
	  	extentTest.log(LogStatus.PASS, "TCC09.Klik menu absen izin");
  }
	  @Then("TCC09. Muncul Alert")
	  public void tcc09_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sedang izin");
		  alert.accept();
		  extentTest.log(LogStatus.PASS, "TCC09. Muncul Alert");
  }
}
