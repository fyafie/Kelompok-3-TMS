package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnLogin;
    
    @FindBy(xpath = "//h1[@class='page-header']")
    WebElement dashboardTxt;
    
    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissable']/button")
    WebElement invalidAlert;
    
    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    public void clickBtnLogin(){
        btnLogin.click();
    }
    
    public String getDashboardTxt() {
    	return dashboardTxt.getText();
    }
    
    public String getInvalidAlert() {
		return invalidAlert.getText();
	}
    public String getNullAlert() {
    	return password.getText();
    }
}
