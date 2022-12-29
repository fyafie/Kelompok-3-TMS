package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportAbsenSakit {
    private WebDriver driver;
    public ReportAbsenSakit(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =  "//span[normalize-space()='Report Absen']")
    WebElement menuReportAbsenSakit;

    @FindBy(xpath = "//a[normalize-space()='Absen Sakit']")
    WebElement absenSakit;

    @FindBy(xpath = "//div[contains(text(),'-- Position --')]")
    WebElement position;
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement positionAll;

    @FindBy(xpath = "//div[contains(text(),'-- Branch --')]")
    WebElement branch;

//    @FindBy(xpath = "//div[@aria-expanded='true']//span[@class='text'][normalize-space()='ALL']")
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement branchAll;

    @FindBy(xpath = "//div[contains(text(),'-- Unit --')]")
    WebElement unit;

//    @FindBy(xpath = "//a[@class='dropdown-item selected active']//span[@class='text'][normalize-space()='ALL']")
//    @FindBy(xpath = "//div[@aria-expanded='true']//span[@class='text'][normalize-space()='ALL']")
    @FindBy(xpath = "//div[@class='dropdown-menu show']//input[@aria-label='Search']")
    WebElement unitAll;

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement startDate;

    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement endDate;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submit;

    public void menuReportAbsen(){
        menuReportAbsenSakit.click();
    }

    public void absenSakit(){
        absenSakit.click();
    }

    public void position(){
        position.click();
    }

    public void positionAll (String positionAll){
        this.positionAll.sendKeys(positionAll);
        this.positionAll.sendKeys(Keys.ENTER);
    }

    public void branch(){
        branch.click();
    }

    public void branchAll(String branchAll){
        this.branchAll.sendKeys(branchAll);
        this.branchAll.sendKeys(Keys.ENTER);
    }

    public void unit(){
        unit.click();
    }
    public void unitAll(String unitAll){
        this.unitAll.sendKeys(unitAll);
        this.unitAll.sendKeys(Keys.ENTER);
    }

    public void startDate (String startDate){
        this.startDate.sendKeys(startDate);
    }

    public void endDate (String endDate){
        this.endDate.sendKeys(endDate);
    }

    public void submit(){
        submit.click();
    }


}
