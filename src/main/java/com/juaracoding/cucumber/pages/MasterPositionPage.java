package com.juaracoding.cucumber.pages;

import com.juaracoding.cucumber.drivers.DriverSingleton;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPositionPage {
	private WebDriver driver;
	
	public MasterPositionPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='simpan']")
	WebElement addButton;
	
	@FindBy(xpath = "//input[@id='Type_Of_Work']")
	WebElement jenisPekerjaan;
	
	@FindBy(xpath = "//input[@id='Position']")
	WebElement posisi;
	
	@FindBy(xpath = "//input[@id='Standar_Wage']")
	WebElement upah;
	
	@FindBy(xpath = "//div[@class='filter-option']")
	WebElement status1;
	
	@FindBy(xpath = "//span[normalize-space()='ACTIVE']")
	WebElement status2;

	@FindBy(xpath = "//tbody/tr[1]/td[1]")
	WebElement gridButton;
	
	@FindBy(xpath = "//span[@class='dtr-data']//a[@class='btn btn-circle btn-warning']")
	WebElement editButton;

	@FindBy(xpath = "//input[@name='update']")
	WebElement updateButton;

	@FindBy(xpath = "//a[@class='btn btn-block btn-danger']")
	WebElement cancelButton;
	
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
	
	public void clickAddButton() {
		addButton.click();
	}
	public String getNullAlert() {
		return jenisPekerjaan.getText();
	}
	public void enterJenisPekerjaan(String jenisPekerjaan) {
		this.jenisPekerjaan.sendKeys(jenisPekerjaan);
	}
	public void enterPosisi(String posisi) {
		this.posisi.sendKeys(posisi);
	}
	public void enterUpah(String upah) {
		this.upah.sendKeys(upah);
	}
	public void selectStatus() {
		status1.click();
		status2.click();
	}
	public void clickGridButton() {
		gridButton.click();
	}
	public void clickEditButton() {
		editButton.click();
	}
	public void deleteField() {
		jenisPekerjaan.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
		posisi.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
		upah.sendKeys(Keys.CONTROL + "A",Keys.DELETE);
	}
	public void clickUpdateButton() {
		updateButton.click();
	}
	public void clickCancelButton() {
		cancelButton.click();
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
