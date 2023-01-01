package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TambahDivisi {
    private WebDriver driver;

    public TambahDivisi() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Master']")
    WebElement navMaster;

    @FindBy(xpath = "//a[normalize-space()='Tambah Divisi']")
    WebElement tambahDivisi1;
    
    @FindBy(xpath = "//input[@id='Privilege_Name']")
    WebElement namaDivisi;
    
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
    
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[4]/form[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/a[1]")
    WebElement editDivisi;
    
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
    
    public void inputnamaDivisi(String namaDivisi){
        this.namaDivisi.sendKeys(namaDivisi);
    }
    
    public void clicksimpanDivisi(){
        simpanDivisi.click();
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
