package com.juaracoding.cucumber.step_definitions;

import org.testng.AssertJUnit;
import com.juaracoding.cucumber.pages.LoginPage;
import com.juaracoding.cucumber.pages.ManagemenDivisi;
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

public class TestManagemenDivisi {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private ManagemenDivisi managemenDivisi = new ManagemenDivisi();

    public TestManagemenDivisi() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constants.URLmanagemenDivisi);
    }

    // TCC.TMS.013
    @When("admin click nama divisi")
    public void admin_click_nama_divisi() {
    	managemenDivisi.dropDivisi();
        extentTest.log(LogStatus.PASS, "admin click nama divisi");
        Hooks.delay(1);
    }
    
    @And("admin choose divisi")
    public void admin_choose_divisi() {
    	managemenDivisi.pilihDivisi();
        extentTest.log(LogStatus.PASS, "admin choose divisi");
        Hooks.delay(1);
    }
    
    @And("admin input nik team leader")
    public void admin_input_nik_team_leader() {
    	managemenDivisi.nikTeamLeader("D8190209");
        extentTest.log(LogStatus.PASS, "admin input nik team leader");
        Hooks.delay(1);
    }
    
    @And("admin input nama supervisor")
    public void admin_input_nama_supervisor() {
    	managemenDivisi.namaSupervisor("UDIN");
        extentTest.log(LogStatus.PASS, "admin input nama supervisor");
        Hooks.delay(1);
    }
    
    @And("admin input nama staff backup")
    public void admin_input_nama_staff_backup() {
    	managemenDivisi.namaBackupStaff("GAMBUT");
        extentTest.log(LogStatus.PASS, "admin input nama staff backup");
        Hooks.delay(1);
    }
    
    @And("admin click simpan")
    public void admin_click_simpan() {
    	managemenDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "admin click simpan");
        Hooks.delay(1);
    }    
    
    @Then("data berhasil disimpan")
    public void data_berhasil_disimpan() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        Hooks.delay(1);
    }
    
    // TCC.TMS.014
    @When("admin click nama divisi dup")
    public void admin_click_nama_divisi_dup() {
    	managemenDivisi.dropDivisi();
        extentTest.log(LogStatus.PASS, "admin click nama divisi dup");
        Hooks.delay(1);
    }
    
    @And("admin choose divisi dup")
    public void admin_choose_divisi_dup() {
    	managemenDivisi.pilihDivisi();
        extentTest.log(LogStatus.PASS, "admin choose divisi dup");
        Hooks.delay(1);
    }
    
    @And("admin input nik team leader dup")
    public void admin_input_nik_team_leader_dup() {
    	managemenDivisi.nikTeamLeader("D8190209");
        extentTest.log(LogStatus.PASS, "admin input nik team leader dup");
        Hooks.delay(1);
    }
    
    @And("admin input nama supervisor dup")
    public void admin_input_nama_supervisor_dup() {
    	managemenDivisi.namaSupervisor("UDIN");
        extentTest.log(LogStatus.PASS, "admin input nama supervisor dup");
        Hooks.delay(1);
    }
    
    @And("admin input nama staff backup dup")
    public void admin_input_nama_staff_backup_dup() {
    	managemenDivisi.namaBackupStaff("GAMBUT");
        extentTest.log(LogStatus.PASS, "admin input nama staff backup dup");
        Hooks.delay(1);
    }
    
    @And("admin click simpan dup")
    public void admin_click_simpan_dup() {
    	managemenDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "admin click simpan dup");
        Hooks.delay(1);
    }    
    
    @Then("data berhasil disimpan dup")
    public void data_berhasil_disimpan_dup() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        extentTest.log(LogStatus.FAIL, "data berhasil disimpan dup");
        Hooks.delay(1);
    }
    
    // TCC.TMS.015
    @When("admin input nik team leader nodiv")
    public void admin_input_nik_team_leader_nodiv() {
    	managemenDivisi.nikTeamLeader("D8190209");
        extentTest.log(LogStatus.PASS, "admin input nik team leader nodiv");
        Hooks.delay(1);
    }
    
    @And("admin input nama supervisor nodiv")
    public void admin_input_nama_supervisor_nodiv() {
    	managemenDivisi.namaSupervisor("SIGIT");
        extentTest.log(LogStatus.PASS, "admin input nama supervisor nodiv");
        Hooks.delay(1);
    }
    
    @And("admin input nama staff backup nodiv")
    public void admin_input_nama_staff_backup_nodiv() {
    	managemenDivisi.namaBackupStaff("RENDANG");
        extentTest.log(LogStatus.PASS, "admin input nama staff backup nodiv");
        Hooks.delay(1);
    }
    
    @And("admin click simpan nodiv")
    public void admin_click_simpan_nodiv() {
    	managemenDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "admin click simpan nodiv");
        Hooks.delay(1);
    }    
    
    @Then("data berhasil disimpan nodiv")
    public void data_berhasil_disimpan_nodiv() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        alert.accept();
        extentTest.log(LogStatus.FAIL, "data berhasil disimpan dup");
        Hooks.delay(1);
    }
    
    // TCC.TMS.016
    @When("admin click nama divisi nonik")
    public void admin_click_nama_divisi_nonik() {
    	managemenDivisi.dropDivisi();
        extentTest.log(LogStatus.PASS, "admin click nama divisi nonik");
        Hooks.delay(1);
    }
    
    @And("admin choose divisi nonik")
    public void admin_choose_divisi_nonik() {
    	managemenDivisi.pilihDivisi();
        extentTest.log(LogStatus.PASS, "admin choose divisi nonik");
        Hooks.delay(1);
    }
    
    @And("admin input nama supervisor nonik")
    public void admin_input_nama_supervisor_nonik() {
    	managemenDivisi.namaSupervisor("UDIN");
        extentTest.log(LogStatus.PASS, "admin input nama supervisor nonik");
        Hooks.delay(1);
    }
    
    @And("admin input nama staff backup nonik")
    public void admin_input_nama_staff_backup_nonik() {
    	managemenDivisi.namaBackupStaff("GAMBUT");
        extentTest.log(LogStatus.PASS, "admin input nama staff backup nonik");
        Hooks.delay(1);
    }
    
    @And("admin click simpan nonik")
    public void admin_click_simpan_nonik() {
    	managemenDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "admin click simpan nonik");
        Hooks.delay(1);
    }    
    
    @Then("input managemen divisi gagal nonik")
    public void input_managemen_divisi_gagal_nonik() {
    	extentTest.log(LogStatus.PASS, "input managemen divisi gagal nonik");
        Hooks.delay(1);
    }
    
    // TCC.TMS.017
    @When("admin click nama divisi nospv")
    public void admin_click_nama_divisi_nospv() {
    	managemenDivisi.dropDivisi();
        extentTest.log(LogStatus.PASS, "admin click nama divisi nospv");
        Hooks.delay(1);
    }
    
    @And("admin choose divisi nospv")
    public void admin_choose_divisi_nospv() {
    	managemenDivisi.pilihDivisi();
        extentTest.log(LogStatus.PASS, "admin choose divisi nospv");
        Hooks.delay(1);
    }
    
    @And("admin input nik team leader nospv")
    public void admin_input_nik_team_leader_nospv() {
    	managemenDivisi.nikTeamLeader("D8190209");
        extentTest.log(LogStatus.PASS, "admin input nik team nospv");
        Hooks.delay(1);
    }
    
    @And("admin input nama staff backup nospv")
    public void admin_input_nama_staff_backup_nospv() {
    	managemenDivisi.namaBackupStaff("GAMBUT");
        extentTest.log(LogStatus.PASS, "admin input nama staff backup nospv");
        Hooks.delay(1);
    }
    
    @And("admin click simpan nospv")
    public void admin_click_simpan_nospv() {
    	managemenDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "admin click simpan nospv");
        Hooks.delay(1);
    }    
    
    @Then("input managemen divisi gagal nospv")
    public void input_managemen_divisi_gagal_nospv() {
    	extentTest.log(LogStatus.PASS, "input managemen divisi gagal nospv");
        Hooks.delay(1);
    }    
    
    // TCC.TMS.018
    @When("admin choose show entries 10 md")
    public void admin_choose_show_entries_10_md() {
    	managemenDivisi.choose10();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 10 md");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.019
    @When("admin choose show entries 25 md")
    public void admin_choose_show_entries_25_md() {
    	managemenDivisi.choose25();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 25 md");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.020
    @When("admin choose show entries 50 md")
    public void admin_choose_show_entries_50_md() {
    	managemenDivisi.choose50();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 50 md");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.021
    @When("admin choose show entries 100 md")
    public void admin_choose_show_entries_100_md() {
    	managemenDivisi.choose100();
    	extentTest.log(LogStatus.PASS, "admin choose show entries 100 md");
    	Hooks.delay(1);
    }
    
    // TCC.TMS.022
    @When("admin click next md")
    public void admin_click_next_md() {
    	managemenDivisi.clickNext();
        extentTest.log(LogStatus.PASS, "admin click next md");
        Hooks.delay(1);
    }

    // TCC.TMS.023
    @When("admin click nomor page 2 md")
    public void admin_click_nomor_page_2_md() {
    	managemenDivisi.clickNomorPage();
        extentTest.log(LogStatus.PASS, "admin click nomor page 2 md");
        Hooks.delay(1);
    }
    
    // TCC.TMS.024
    @When("admin click previous md")
    public void admin_click_previous_md() {
    	managemenDivisi.clickNomorPage();
    	managemenDivisi.clickPrevious();
        extentTest.log(LogStatus.PASS, "admin click previous md");
        Hooks.delay(1);
    }
    
    // TCC.TMS.025
    @When("admin input nama divisi search ada md")
    public void admin_input_nama_divisi_search_ada_md() {
    	managemenDivisi.cariDivisi("UDIN");
        extentTest.log(LogStatus.PASS, "admin input nama divisi search ada md");
        Hooks.delay(5);
    }
    
    // TCC.TMS.026
    @When("admin input nama divisi search tidak ada md")
    public void admin_input_nama_divisi_search_tidak_ada_md() {
    	managemenDivisi.cariDivisi("sambalado");
        extentTest.log(LogStatus.PASS, "admin input nama divisi search tidak ada md");
        Hooks.delay(5);
    }
    
    // TCC.TMS.027
    @When("admin click button pencil edit md")
    public void admin_click_button_pencil_edit_md() {
    	managemenDivisi.editDivisi();
        extentTest.log(LogStatus.PASS, "admin click button pencil edit md");
        Hooks.delay(1);
    }
    
    @And("admin edit nama supervisor edit md")
    public void admin_edit_nama_supervisor_edit_md() {
    	managemenDivisi.namaSupervisor(" edited");
        extentTest.log(LogStatus.PASS, "admin edit nama supervisor edit md");
        Hooks.delay(1);
    }
    
    @And("admin click simpan edit md")
    public void admin_click_simpan_edit_md() {
    	managemenDivisi.clicksimpanDivisi();
        extentTest.log(LogStatus.PASS, "admin click simpan edit md");
        Hooks.delay(1);
    }
    
    @Then("data berhasil disimpan edit md")
    public void data_berhasil_disimpan_edit_md() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "Data Berhasil Diupdate!");
        alert.accept();
        extentTest.log(LogStatus.PASS, "data berhasil disimpan edit md");
        Hooks.delay(1);
    }
    
    // TCC.TMS.028
    @When("admin click button trash edit md")
    public void admin_click_button_trash_edit_md() {
    	managemenDivisi.hapusDivisi();
        extentTest.log(LogStatus.PASS, "admin click button trash edit md");
        Hooks.delay(1);
    }
    
    @And("are you sure edit md")
    public void are_you_sure_edit_md() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "Are You Sure?");
        alert.accept();
        extentTest.log(LogStatus.PASS, "are you sure edit md");
        Hooks.delay(1);
    }
    
    @And("data berhasil dihapus md")
    public void data_berhasil_dihapus_md() {
    	Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();
        Assert.assertEquals(alertMessage, "Data Berhasil Dihapus!");
        alert.accept();
        extentTest.log(LogStatus.PASS, "data berhasil dihapus md");
        Hooks.delay(1);
    }
}