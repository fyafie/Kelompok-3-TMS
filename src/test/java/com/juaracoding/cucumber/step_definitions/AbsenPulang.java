package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.AbsenPulangPage;
import com.juaracoding.cucumber.pages.AbsenMasukPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenPulang {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private AbsenPulangPage absenPulang = new AbsenPulangPage();
    private LoginPage loginpage = new LoginPage();

    public AbsenPulang() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    
//    TC04
    @When("TCC04.Tampilan Pulang")
    public void tcc04_tampilan_pulang() {
        loginpage.login("D6200927", "1997-10-23");
        loginpage.clickBtnLogin();
        driver.get(Constants.URLPulang);
    }
    @When("TCC04.Submit")
  public void tcc04_submit() {
    	absenPulang.clickBtnSubmit();
  }
  @Then("TCC04.User mendapatkan pemberitahuan")
  public void tcc04_user_mendapatkan_pemberitahuan() {
	  Hooks.delay(2);
	  Alert alert = driver.switchTo().alert();
	  String alertMessage = driver.switchTo().alert().getText();
	  Assert.assertEquals(alertMessage, "please select a file");
	  alert.accept();
  }
//    TC05
  @When("TCC05.Upload foto selfie")
  public void tcc05_upload_foto_selfie() {
	  driver.get(Constants.URLPulang);
      absenPulang.uploadfoto();
  }
  @When("TCC05.Input Divisi")
  public void tcc05_input_divisi() {
      absenPulang.clickdivisi();
  }
  @When("TCC05.Input tipe Shift")
  public void tcc025_input_tipe_shift() {
  	absenPulang.clicktypeshift();
      absenPulang.clicktypeshift1();
  }
  @When("TCC05.Input Nama Shift")
  public void tcc05_input_nama_shift() {
      absenPulang.clicknamashift();
      absenPulang.clicknamashift1();
  }
  @When("TCC05.Input Tipe Absen")
  public void tcc05_input_tipe_absen() {
      absenPulang.clicktipeabsen();
  }
  @When("TCC05.Isi keterangan")
  public void tcc05_isi_keterangan() {
      absenPulang.isiketerangan();
  }
  @Then("TCC05.Submit")
  public void tcc05_submit() {
      absenPulang.clickBtnSubmit();
  }
//    TC06
	  @When("TCC06.Klik menu absen pulang")
	  public void tcc06_klik_menu_absen_pulang() {
	  	driver.get(Constants.URLPulang);
  }
	  @Then("TCC06. Muncul Alert")
	  public void tcc06_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sudah melakukan absen keluar! Jika ingin melakukan absen kembali anda harus melakukan absen masuk terlebih dahulu!");
		  alert.accept();
  }
}
