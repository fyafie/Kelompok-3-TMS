package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.AbsenMasukPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenMasuk {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private AbsenMasukPage absenMasuk = new AbsenMasukPage();
    private LoginPage loginpage = new LoginPage();

    public AbsenMasuk() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
    //TC01
    @When("TCC01.Tampilan Masuk")
    public void tcc01_tampilan_masuk() {
    	driver.get(Constants.URL);
        loginpage.login("D6200927", "1997-10-23");
        loginpage.clickBtnLogin();
        driver.get(Constants.URLMasuk);
        extentTest.log(LogStatus.PASS, "TCC01.Tampilan Masuk");
    }
    @And("TCC01.Submit")
  public void tcc01_submit() {
    	absenMasuk.clickBtnSubmit();
    	extentTest.log(LogStatus.PASS, "TCC01.Submit");
  }
  @Then("TCC01.User mendapatkan pemberitahuan")
  public void tcc01_user_mendapatkan_pemberitahuan() {
	  Assert.assertEquals(driver.getCurrentUrl(), "https://dev.ptdika.com/tiket.com/absen/masuk");
	  extentTest.log(LogStatus.PASS, "TCC01.User mendapatkan pemberitahuan");
  }
//    TC02
  @When("TCC02.Upload foto selfie")
  public void tcc02_upload_foto_selfie() {
      absenMasuk.uploadfoto();
      extentTest.log(LogStatus.PASS, "TCC02.Upload foto selfie");
  }
  @And("TCC02.Input Divisi")
  public void tcc02_input_divisi() {
      absenMasuk.clickdivisi();
      extentTest.log(LogStatus.PASS, "TCC02.Input Divisi");
  }
  @And("TCC02.Input tipe Shift")
  public void tcc02_input_tipe_shift() {
  	absenMasuk.clicktypeshift();
      absenMasuk.clicktypeshift1();
      extentTest.log(LogStatus.PASS, "TCC02.Input tipe Shift");
  }
  @And("TCC02.Input Nama Shift")
  public void tcc02_input_nama_shift() {
      absenMasuk.clicknamashift();
      absenMasuk.clicknamashift1();
      extentTest.log(LogStatus.PASS, "TCC02.Input Nama Shift");
  }
  @And("TCC02.Input Tipe Absen")
  public void tcc02_input_tipe_absen() {
      absenMasuk.clicktipeabsen();
      extentTest.log(LogStatus.PASS, "TCC02.Input Tipe Absen");
  }
  @And("TCC02.Isi keterangan")
  public void tcc02_isi_keterangan() {
      absenMasuk.isiketerangan();
      extentTest.log(LogStatus.PASS, "TCC02.Isi keterangan");
  }
  @Then("TCC02.Submit")
  public void tcc02_submit() {
      absenMasuk.clickBtnSubmit();
      extentTest.log(LogStatus.PASS, "TCC02.Submit");
  }
//    TC03
	  @When("TCC03.Klik menu absen pulang")
	  public void tcc03_klik_menu_absen_pulang() {
	  	driver.get(Constants.URLPulang);
	  	extentTest.log(LogStatus.PASS, "TCC03.Klik menu absen pulang");
  }
	  @Then("TCC03. Muncul Alert")
	  public void tcc03_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sudah melakukan absen pulang!! Jika ingin melakukan absen kembali anda harus melakukan absen masuk terlebih dahulu!");
		  alert.accept();
		  extentTest.log(LogStatus.PASS, "TCC03. Muncul Alert");
  }
}
