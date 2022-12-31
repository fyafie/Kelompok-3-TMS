package com.juaracoding.cucumber.step_definitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.juaracoding.cucumber.pages.AbsenMasukPage;
import com.juaracoding.cucumber.pages.AbsenSakitPage;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;

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
        loginpage.login("D6201227", "1997-10-23");
        loginpage.clickBtnLogin();
        driver.get(Constants.URLSakit);
    }
    @And("TCC10.Submit")
  public void tcc10_submit() {
    	absenSakit.clickBtnSubmit();
  }
  @Then("TCC10.User mendapatkan pemberitahuan")
  public void tcc10_user_mendapatkan_pemberitahuan() {
	  Hooks.delay(2);
	  Alert alert = driver.switchTo().alert();
	  String alertMessage = driver.switchTo().alert().getText();
	  Assert.assertEquals(alertMessage, "please select a file");
	  alert.accept();
  }
//    TC11
  @When("TCC11.Upload foto selfie")
  public void tcc11_upload_foto_selfie() {
	  driver.get(Constants.URLSakit);
      absenSakit.uploadfoto();
  }
  @And("TCC11.Input Divisi")
  public void tcc11_input_divisi() {
      absenSakit.clickdivisi();
  }
  @And("TCC11.Input tipe Shift")
  public void tcc11_input_tipe_shift() {
  	absenSakit.clicktypeshift();
      absenSakit.clicktypeshift1();
  }
  @And("TCC11.Input Nama Shift")
  public void tcc11_input_nama_shift() {
      absenSakit.clicknamashift();
      absenSakit.clicknamashift1();
  }
  @And("TCC11.Input Tipe Absen")
  public void tcc11_input_tipe_absen() {
	  absenSakit.clicktipeabsen();
  }
  @And("TCC11.Isi keterangan")
  public void tcc11_isi_keterangan() {
	  absenSakit.isiketerangan();
  }
  @Then("TCC11.Submit")
  public void tcc11_submit() {
      absenSakit.clickBtnSubmit();
  }
//    TC12
	  @When("TCC12.Klik menu absen sakit")
	  public void tcc12_klik_menu_absen_sakit() {
	  	driver.get(Constants.URLSakit);
  }
	  @Then("TCC12. Muncul Alert")
	  public void tcc12_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sudah absen izin");
		  alert.accept();
  }
//	  TC13
	  @When("TCC13.Klik menu absen sakit")
	  public void tcc13_klik_menu_absen_sakit() {
	  	driver.get(Constants.URLSakit);
  }
	  @Then("TCC13. Muncul Alert")
	  public void tcc13_muncul_alert() {
		  Hooks.delay(2);
		  Alert alert = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertMessage, "Anda sedang sakit");
		  alert.accept();
  }
}
