package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportPage {
    private WebDriver driver;
    public ReportPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath =  "//span[normalize-space()='Report Absen']")
    WebElement menuReportAbsen;

    @FindBy(xpath = "//a[normalize-space()='Absen Masuk']")
    WebElement absenMasuk;

    @FindBy(xpath = "//div[contains(text(),'-- Position --')]")
    WebElement position;

    @FindBy(xpath = "//div[contains(text(),'-- Branch --')]")
    WebElement branch;

    @FindBy(xpath = "//button[@title='-- Unit --']//div[@class='filter-option']")
    WebElement unit;

    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement startDate;

    @FindBy(xpath = "//input[@id='datepicker2']")
    WebElement endDate;

    public void menuReportAbsen(){
        menuReportAbsen.click();
    }

    public void absenMasuk(){
        absenMasuk.click();
    }

    public void position(){
        position.click();
    }

    public void branch(){
        branch.click();
    }

    public void unit(){
        unit.click();
    }

    public void startDate(){
        startDate.click();
    }

    public void endDate(){
        endDate.click();
    }

}
