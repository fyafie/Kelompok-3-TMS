package com.juaracoding.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class AbsenSakitPage {
	private WebDriver driver;

    public AbsenSakitPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//*[@id=\"sidebar\"]/div/div[1]/ul/li[3]/ul/li[1]/a")
    WebElement laporankegiatan;
    
    @FindBy(xpath = "//input[@name='foto']")
    WebElement uploadfoto;

    @FindBy(xpath = "//select[@name=\"divisi\"]/option[3]")
    WebElement divisi;

    @FindBy(xpath = "//select[@name=\"type_shift\"]")
    WebElement typeshift;
    
    @FindBy(xpath = "//select[@name=\"type_shift\"]/option[2]")
    WebElement typeshift1;
    
    @FindBy(xpath = "//input[@type=\"text\"]")
    WebElement namashift;
    
    @FindBy(xpath = "//*[@id=\"uploadimage\"]/div[4]/div/div/div[2]/ul/li[3]/a")
    WebElement namashift1;
    
    @FindBy(xpath = "//select[@id=\"absen_type\"]/option[3]")
    WebElement typeabsen;
    
    @FindBy(xpath = "//textarea[@name=\"keterangan\"]")
    WebElement keterangan;
    
    @FindBy(xpath = "//input[@type=\"submit\"]")
    WebElement btnSubmit;

    public void clicklaporankegiatan(){
        laporankegiatan.click();
    }
    public void uploadfoto(){
        uploadfoto.sendKeys("D:\\Test\\2.jpg");
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
        keterangan.sendKeys("Masuk");
    }
    public void clickBtnSubmit(){
        btnSubmit.click();
    }
}
