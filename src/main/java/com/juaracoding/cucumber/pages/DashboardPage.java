package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    private WebDriver driver;

    public DashboardPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[normalize-space()='Dashboard']")
    WebElement menuDashboard;

    @FindBy(xpath = "//h4[@class='oxd-text oxd-text--h4 orangehrm-module-under-development-heading']")
    WebElement txtDashboard;
    
    public void menuDashboard(){
        menuDashboard.click();
    }
    
    public String getTxtDashboard(){
        return txtDashboard.getText();
    }
    
}
