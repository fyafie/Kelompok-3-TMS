package com.juaracoding.cucumber.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "D:\\Aplikasi\\Chrome Driver\\chromedriver.exe"); //WebDriversManagers.chrome.setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1366x768");
        return new ChromeDriver(options);
    }
}
