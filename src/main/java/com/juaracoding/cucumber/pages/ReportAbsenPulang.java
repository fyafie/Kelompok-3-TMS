package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportAbsenPulang {
    private WebDriver driver;
    public ReportAbsenPulang(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =  "//span[normalize-space()='Report Absen']")
    WebElement menuReportAbsenPulang;

    @FindBy(xpath = "//a[normalize-space()='Absen Pulang']")
    WebElement absenPulang;

    @FindBy(xpath = "//div[contains(text(),'-- Position --')]")
    WebElement position;

    @FindBy(xpath = "//span[normalize-space()='ALL']")
    WebElement positionAll;

    @FindBy(xpath = "//div[contains(text(),'-- Branch --')]")
    WebElement branch;

    @FindBy(xpath = "//div[@aria-expanded='true']//span[@class='text'][normalize-space()='ALL']")
    WebElement branchAll;

    @FindBy(xpath = "//button[@title='-- Unit --']//div[@class='filter-option']")
    WebElement unit;

    @FindBy(xpath = "//div[@aria-expanded='true']//span[@class='text'][normalize-space()='ALL']")
    WebElement unitAll;

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement startDate;

    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement endDate;

    @FindBy(xpath = "//input[@name='submit']")
    WebElement submit;

    public void menuReportAbsen(){
        menuReportAbsenPulang.click();
    }

    public void absenPulang(){
        absenPulang.click();
    }

    public void position(){
        position.click();
    }

    public void positionAll(){
        positionAll.click();
    }

    public void branch(){
        branch.click();
    }

    public void branchAll(){
        branchAll.click();
    }

    public void unit(){
        unit.click();
    }
    public void unitAll(){
        unitAll.click();
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
