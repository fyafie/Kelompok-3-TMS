package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AbsenMasukPage {
	private WebDriver driver;

    public AbsenMasukPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }   
    @FindBy(xpath = "//input[@name='foto'])")
    WebElement uploadfoto;

    @FindBy(xpath = "//select[@name='divisi']/option[2]")
    WebElement divisi;

    @FindBy(xpath = "//select[@name='type_shift']")
    WebElement typeshift;
    
    @FindBy(xpath = "//select[@name='type_shift']/option[2]")
    WebElement typeshift1;
    
    @FindBy(xpath = "//*[@id='uploadimage']/div[4]/div/button/div/div")
    WebElement namashift;
    
    @FindBy(xpath = "//*[@id='uploadimage']/div[4]/div/div/div[2]/ul/li[3]/a")
    WebElement namashift1;
    
    @FindBy(xpath = "//select[@name='absen_type']/option[3]")
    WebElement typeabsen;
    
    @FindBy(xpath = "//textarea[@name='keterangan']")
    WebElement keterangan;
    
    @FindBy(xpath = "//input[@type='submit']")
    WebElement btnSubmit;

    public void uploadfoto(){
        uploadfoto.sendKeys("D:Test2.jpg");
    }
    public void clickdivisi(){
        divisi.click();
    }
    public void clicktypeshift(){
        typeshift.click();
    }
    public void clicktypeshift1(){
        typeshift1.click();
    }
    public void clicknamashift(){
        namashift.click();
    }
    public void clicknamashift1(){
        namashift1.click();
    }
    public void clicktipeabsen(){
        typeabsen.click();
    }
    public void isiketerangan(){
        keterangan.sendKeys("Masuk nih!");
    }
    public void clickBtnSubmit(){
        btnSubmit.click();
    }
}
