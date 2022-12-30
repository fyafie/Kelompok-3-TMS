package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class ManagemenDivisi {
    private WebDriver driver;

    public ManagemenDivisi() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Master']")
    WebElement navMaster;

    @FindBy(xpath = "//a[normalize-space()='Tambah Divisi']")
    WebElement tambahDivisi1;
    
    @FindBy(xpath = "//div[@class='filter-option-inner-inner']")
    WebElement dropDivisi;
    
    @FindBy(xpath = "//span[normalize-space()='Unit Layanan Informasi']")
    WebElement pilihDivisi;

    @FindBy(xpath = "//input[@id='V1_NIK']")
    WebElement nikTeamLeader;
    
    @FindBy(xpath = "//input[@id='V2_Name']")
    WebElement namaSupervisor;

    @FindBy(xpath = "//textarea[@id='Backup_Staff']")
    WebElement namaBackupStaff;
    
    @FindBy(xpath = "//input[@name='simpan']")
    WebElement simpanDivisi;
    
    @FindBy(xpath = "//a[normalize-space()='Next']")
    WebElement clickNext;
    
    @FindBy(xpath = "//a[normalize-space()='Previous']")
    WebElement clickPrevious;
    
    @FindBy(xpath = "//a[normalize-space()='2']")
    WebElement clickNomorPage;
    
    @FindBy(xpath = "//input[@type='search']")
    WebElement cariDivisi;
    
    @FindBy(xpath = "//input[@name='update']")
    WebElement clickUpdate;
    
    @FindBy(xpath = "//tbody/tr[1]/td[3]/button[1]")
    WebElement editDivisi;
    
    @FindBy(xpath = "//tbody/tr[1]/td[3]/a[1]/i[1]")
    WebElement hapusDivisi;
    
    @FindBy(xpath = "//option[@value=\"10\"]")
    WebElement choose10;
    
    @FindBy(xpath = "//option[@value=\"25\"]")
    WebElement choose25;
    
    @FindBy(xpath = "//option[@value=\"50\"]")
    WebElement choose50;
    
    @FindBy(xpath = "//option[@value=\"100\"]")
    WebElement choose100;
    
    public void clicknavMaster(){
        navMaster.click();
    }
    
    public void clicktambahDivisi(){
        tambahDivisi1.click();
    }
    
    public void dropDivisi(){
    	dropDivisi.click();
    }
    
    public void pilihDivisi(){
    	pilihDivisi.click();
    }
    
    public void nikTeamLeader(String nikTeamLeader){
        this.nikTeamLeader.sendKeys(nikTeamLeader);
    }
    
    public void namaSupervisor(String namaSupervisor){
        this.namaSupervisor.sendKeys(namaSupervisor);
    }
    
    public void namaBackupStaff(String namaBackupStaff){
        this.namaBackupStaff.sendKeys(namaBackupStaff);
    }
    
    public void clicksimpanDivisi(){
        simpanDivisi.click();
    }
    
    public void hapusDivisi(){
    	hapusDivisi.click();
    }
    
    public void clickNext(){
        clickNext.click();
    }
    
    public void clickPrevious() {
    	clickPrevious.click();
    }
    
    public void clickNomorPage() {
    	clickNomorPage.click();
    }
    
    public void cariDivisi(String cariDivisi){
        this.cariDivisi.sendKeys(cariDivisi);
    }
    
    public void editDivisi() {
    	editDivisi.click();
    }
    
    public void clickUpdate() {
    	clickUpdate.click();
    }
    
    public void choose10() {
    	choose10.click();
    }
    
    public void choose25() {
    	choose25.click();
    }
    
    public void choose50() {
    	choose50.click();
    }
    
    public void choose100() {
    	choose100.click();
    }
}
