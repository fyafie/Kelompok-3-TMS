package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParameterShiftingPage {
	private WebDriver driver;
	
	public ParameterShiftingPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h1/a")
	WebElement addButton;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//form/div/div[1]/div[1]/small")
	WebElement nullAlert;
	
	@FindBy(xpath = "//div[@class='filter-option']")
	WebElement unit1;
	
	@FindBy(xpath = "//div[@class=\"inner show\"]/ul/li[2]")
	WebElement unit2;
	
	@FindBy(xpath = "//input[@id='shift_name']")
	WebElement namaShift;
	
	@FindBy(xpath = "//input[@id='jam_mulai']")
	WebElement jamMulai;
	
	@FindBy(xpath = "//input[@id='jam_selesai']")
	WebElement jamSelesai;
	
	@FindBy(xpath = "//strong")
	WebElement successAlert;
	
	@FindBy(xpath = "//a[@class='btn btn-danger']")
	WebElement backButton;
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement gridButton;
	
	@FindBy(xpath = "//span[@class='dtr-data']//a[@title='Edit Data']")
	WebElement editButton;
	
	@FindBy(xpath = "//span[@class='dtr-data']//a[@title=\"Delete Data\"]")
	WebElement deleteButton;
	
	@FindBy(xpath = "//select[@name='data-table-default_length']//option[1]")
	WebElement option10;
	
	@FindBy(xpath = "//td[normalize-space()='1']")
	WebElement data10;
	
	@FindBy(xpath = "//select[@name='data-table-default_length']//option[2]")
	WebElement option25;
	
	@FindBy(xpath = "//td[normalize-space()='11']")
	WebElement data25;
	
	@FindBy(xpath = "//select[@name='data-table-default_length']//option[3]")
	WebElement option50;
	
	@FindBy(xpath = "//td[normalize-space()='26']")
	WebElement data50;
	
	@FindBy(xpath = "//select[@name='data-table-default_length']//option[4]")
	WebElement option100;
	
	@FindBy(xpath = "//td[normalize-space()='51']")
	WebElement data100;
	
	@FindBy(xpath = "//input[@type='search']")
	WebElement search;
	
	@FindBy(xpath = "//td[normalize-space()='search']")
	WebElement searchdata;
	
	@FindBy(xpath = "//h1[@class='page-header']")
	WebElement editNullAlert; 
	
	public void clickAddButton() {
		addButton.click();
	}
	public void clickSubmitButton() {
		submitButton.click();
	}
	public String getNullAlert() {
		return nullAlert.getText();
	}
	public void clickBackButton() {
		backButton.click();
	}
	public void selectUnit() {
		unit1.click();
		unit2.click();
	}
	public void EnterNamaShift(String namaShift) {
		this.namaShift.sendKeys(namaShift);
	}
	public void EnterJamMulai(String jamMulai) {
		this.jamMulai.sendKeys(jamMulai);
	}
	public void EnterJamSelesai(String jamSelesai) {
		this.jamSelesai.sendKeys(jamSelesai);
	}
	public String getSuccessAlert() {
		return successAlert.getText();
	}
	public void clickGridButton() {
		gridButton.click();
	}
	public void clickEditButton() {
		editButton.click();
	}
	public void deleteField() {
		namaShift.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
		jamMulai.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
		jamSelesai.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
	}
	public String getEditNullAlert() {
		return editNullAlert.getText();
	}
	public void clickDeleteButton() {
		deleteButton.click();
	}
	public void clickOption10() {
		option10.click();
	}
	public String getData10() {
		return data10.getText();
	}
	public void clickOption25() {
		option25.click();
	}
	public String getData25() {
		return data25.getText();
	}
	public void clickOption50() {
		option50.click();
	}
	public String getData50() {
		return data50.getText();
	}
	public void clickOption100() {
		option100.click();
	}
	public String getData100() {
		return data100.getText();
	}
	public void enterSearch(String search) {
		this.search.sendKeys(search);
		this.search.sendKeys(Keys.ENTER);
	}
	public String getSearchdata() {
		return searchdata.getText();
	}
}
