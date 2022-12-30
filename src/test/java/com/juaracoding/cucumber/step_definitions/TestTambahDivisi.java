package com.juaracoding.cucumber.step_definitions;

import org.testng.AssertJUnit;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.TambahDivisi;
import com.juaracoding.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okio.Timeout;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestTambahDivisi {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private TambahDivisi tambahDivisi = new TambahDivisi();

    public TestTambahDivisi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constants.URLtambahDivisi);
    }

    // TCC.TMS.001
    @When("Admin input Nama Divisi")
    public void admin_input_nama_divisi() {
    	tambahDivisi.inputnamaDivisi("Sales");
        extentTest.log(LogStatus.PASS, "Admin input Nama Divisi");
        Hooks.delay(1);
    }
    
    @And("Admin click simpan")
    public void admin_click_simpan() {
    	tambahDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "Admin click simpan");
        Hooks.delay(1);
    }
    
    @Then("Data berhasil disimpan")
    public void data_berhasil_disimpan() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        extentTest.log(LogStatus.PASS, "Data berhasil disimpan");
        Hooks.delay(1);
    }

    // TCC.TMS.002
    @When("Admin click simpan gagal")
    public void admin_input_nama_divisi_gagal() {
    	tambahDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "Admin click simpan gagal");
        Hooks.delay(1);
    }
    
    @Then("Input divisi gagal dan ada pemberitahuan untuk input nama divisi")
    public void input_divisi_gagal_dan_ada_pemberitahuan_untuk_input_nama_divisi() {
    	extentTest.log(LogStatus.FAIL, "Input divisi gagal dan ada pemberitahuan untuk input nama divisi");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.003
    @When("admin choose show entries 10")
    public void admin_choose_show_entries_10() {
    	tambahDivisi.choose10();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 10");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.004
    @When("admin choose show entries 25")
    public void admin_choose_show_entries_25() {
    	tambahDivisi.choose25();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 25");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.005
    @When("admin choose show entries 50")
    public void admin_choose_show_entries_50() {
    	tambahDivisi.choose50();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 50");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.006
    @When("admin choose show entries 100")
    public void admin_choose_show_entries_100() {
    	tambahDivisi.choose100();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 100");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.007
    @When("admin click next")
    public void admin_click_next() {
    	tambahDivisi.clickNext();
        extentTest.log(LogStatus.PASS, "admin click next");
        Hooks.delay(1);
    }
    
    // TCC.TMS.008
    @When("admin click nomor page 2")
    public void admin_click_nomor_page_2() {
    	tambahDivisi.clickNomorPage();
        extentTest.log(LogStatus.PASS, "admin click nomor page 2");
        Hooks.delay(1);
    }
    
    // TCC.TMS.009
    @When("admin click previous")
    public void admin_click_previous() {
    	tambahDivisi.clickNomorPage();
    	tambahDivisi.clickPrevious();
        extentTest.log(LogStatus.PASS, "admin click previous");
        Hooks.delay(1);
    }
    
    // TCC.TMS.0010
    @When("admin input nama divisi search ada")
    public void admin_input_nama_divisi_search_ada() {
    	tambahDivisi.cariDivisi("Sales");
        extentTest.log(LogStatus.PASS, "admin input nama divisi search ada");
        Hooks.delay(5);
    }
    
    // TCC.TMS.0011
    @When("admin input nama divisi search tidak ada")
    public void admin_input_nama_divisi_search_tidak_ada() {
    	tambahDivisi.cariDivisi("sambalado");
        extentTest.log(LogStatus.PASS, "admin input nama divisi search tidak ada");
        Hooks.delay(5);
    }
    
    // TCC.TMS.0012
    @When("admin click button pencil edit")
    public void admin_click_button_pencil_edit() {
    	tambahDivisi.editDivisi();
        extentTest.log(LogStatus.PASS, "admin click button pencil edit");
        Hooks.delay(1);
    }
    
    @And("admin edit nama divisi edit")
    public void admin_edit_nama_divisi_edit() {
    	tambahDivisi.inputnamaDivisi(" edited");
        extentTest.log(LogStatus.PASS, "admin edit nama divisi edit");
        Hooks.delay(1);
    }
    
    @And("admin click update edit")
    public void admin_click_update_edit() {
    	tambahDivisi.clickUpdate();
        extentTest.log(LogStatus.PASS, "admin click update edit");
        Hooks.delay(1);
    }
    
    @Then("data berhasil disimpan edit")
    public void data_berhasil_disimpan_edit() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        extentTest.log(LogStatus.PASS, "data berhasil disimpan edit");
        Hooks.delay(1);
    }
}