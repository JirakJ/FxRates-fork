package com.jakubjirak.sberbank.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {

    private WebDriver driver;
    private ChromeOptions chromeOptions;

    public Browser(){
        System.out.println("Using chrome browser");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        driver = new ChromeDriver(chromeOptions);
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void navigate(final String url){
        System.out.println(String.format("Navigating to %s%n",url));
        driver.get(url);
    }

    public void click(final WebElement element){
        System.out.println(String.format("Clicking on %s%n",element.toString()));
        element.click();
    }

    public WebElement findElement(final By locator){
        System.out.println(String.format("Looking for element %s%n",locator.toString()));
        return driver.findElement(locator);
    }

    public void teardown(){
        System.out.println("Performing browser teardown");
        driver.close();
        driver.quit();
    }
}
