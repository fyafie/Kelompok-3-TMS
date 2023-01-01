package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.AbsenMasukPage;
import com.juaracoding.cucumber.pages.AbsenSakitPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AbsenSakit {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private AbsenSakitPage absenSakit = new AbsenSakitPage();
    private LoginPage loginpage = new LoginPage();
    
    public AbsenSakit() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
  //TC10
    @When("TCC10.Tampilan Sakit")
    public void tcc10_tampilan_Sakit() {
    	driver.get(Constants.URL);
        loginpage.login("D6200927", "1997-10-23");
        loginpage.clickBtnLogin();
        extentTest.log(LogStatus.PASS, "TCC09. Muncul Alert");
    }
    @And("TCC10.Submit")
  public void tcc10_submit() {
    	driver.get(Constants.URLSakit);
    	absenSakit.clickBtnSubmit();
    	extentTest.log(LogStatus.PASS, "TCC09. Muncul Alert");
  }
  @Then("TCC10.User mendapatkan pemberitahuan")
  public void tcc10_user_mendapatkan_pemberitahuan() {
	  Assert.assertEquals(driver.getCurrentUrl(), "https://dev.ptdika.com/tiket.com/absen/sakit");
	  extentTest.log(LogStatus.PASS, "TCC09. Muncul Alert");
  }
//    TC11
  @When("TCC11.Upload foto selfie")
  public void tcc11_upload_foto_selfie() {
	  driver.get(Constants.URLSakit);
      absenSakit.uploadfoto();
      extentTest.log(LogStatus.PASS, "TCC11.Upload foto selfie");
  }
  @And("TCC11.Input Divisi")
  public void tcc11_input_divisi() {
      absenSakit.clickdivisi();
      extentTest.log(LogStatus.PASS, "TCC11.Input Divisi");
  }
  @And("TCC11.Input tipe Shift")
  public void tcc11_input_tipe_shift() {
  	absenSakit.clicktypeshift();
      absenSakit.clicktypeshift1();
      extentTest.log(LogStatus.PASS, "TCC11.Input tipe Shift");
  }
  @And("TCC11.Input Nama Shift")
  public void tcc11_input_nama_shift() {
      absenSakit.clicknamashift();
      absenSakit.clicknamashift1();
      extentTest.log(LogStatus.PASS, "TCC11.Input Nama Shift");
  }
  @And("TCC11.Input Tipe Absen")
  public void tcc11_input_tipe_absen() {
	  absenSakit.clicktipeabsen();
	  extentTest.log(LogStatus.PASS, "TCC11.Input Tipe Absen");
  }
  @And("TCC11.Isi keterangan")
  public void tcc11_isi_keterangan() {
	  absenSakit.isiketerangan();
	  extentTest.log(LogStatus.PASS, "TCC11.Isi keterangan");
  }
  @Then("TCC11.Submit")
  public void tcc11_submit() {
      absenSakit.clickBtnSubmit();
      extentTest.log(LogStatus.PASS, "TCC11.Submit");
  }
//    TC12
	  @When("TCC12.Klik menu absen sakit")
	  public void tcc12_klik_menu_absen_sakit() {
	  	driver.get(Constants.URLSakit);
	  	extentTest.log(LogStatus.PASS, "TCC12.Klik menu absen sakit");
  }
	  @Then("TCC12. Muncul Alert")
	  public void tcc12_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sudah absen izin");
		  alert.accept();
		  extentTest.log(LogStatus.PASS, "TCC12. Muncul Alert");
  }
//	  TC13
	  @When("TCC13.Klik menu absen sakit")
	  public void tcc13_klik_menu_absen_sakit() {
	  	driver.get(Constants.URLSakit);
	  	extentTest.log(LogStatus.PASS, "TCC13.Klik menu absen sakit");
  }
	  @Then("TCC13. Muncul Alert")
	  public void tcc13_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sedang sakit");
		  alert.accept();
		  extentTest.log(LogStatus.PASS, "TCC13. Muncul Alert");
  }
}
