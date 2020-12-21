package com.jakubjirak.sberbank.pages;

import com.jakubjirak.sberbank.common.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SberbankHomePage extends BasePage {
    private static final String URL = "https://www.sberbank.cz/cs-cz/";

    private static final String BTN_FXRATES = "//a[contains(@class, 'footer__title')]";
    @FindBy(xpath = BTN_FXRATES)
    private WebElement btn_fxRates;

    public SberbankHomePage(Browser browser) {
        super(browser);
    }

    public FxRatesPage openFxRates(){
        browser.navigate(URL);
        PageFactory.initElements(browser.getDriver(), this);
        browser.click(btn_fxRates);
        return new FxRatesPage(browser);
    }
}
