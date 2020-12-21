package com.jakubjirak.sberbank.pages;

import com.jakubjirak.sberbank.beans.FxRates;
import com.jakubjirak.sberbank.enums.CurrencyEnum;
import com.jakubjirak.sberbank.common.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FxRatesPage extends BasePage{
    private static final String ROWS = "//div/div[3]/table/tbody/tr";
    private static final String NAME = "//div/div[3]/table/tbody/tr[%d]//th/p";
    private static final String CELL = "//div/div[3]/table/tbody/tr[%d]//td[%d]";
    private static final String MID_MARKET_RATE = "//div/div[3]/table/tbody/tr[%d]//td[%d]//span[contains(@class, 'b-table__value')]";

    private String clearText(final String input){
        return input.replace(",",".").split("\n/\n100")[0];
    }

    public FxRatesPage(Browser browser) {
        super(browser);
    }

    public List<FxRates> getCurrencies() {
        List<FxRates> fxRatesList = new ArrayList<>();
        List<WebElement> rows = browser.getDriver().findElements(By.xpath(ROWS));
        for (int i = 2; i < rows.size(); i++) {
            FxRates fxRates = new FxRates();
            fxRates.setName(rows.get(i).findElement(By.xpath(String.format(NAME,i))).getText());

            //Foreign currencies
            fxRates.setBuyForeignCurrencies(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 1))).getText())));
            fxRates.setMidMarketForeignCurrencies(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(MID_MARKET_RATE, i, 2))).getText())));
            fxRates.setMidEcbForeignCurrencies(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 3))).getText())));
            fxRates.setSellForeignCurrencies(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 4))).getText())));

            //Values
            if(!clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 5))).getText()).equals("-")){
                fxRates.setBuyValues(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 5))).getText())));
            }
            if(!clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 6))).getText()).equals("-")){
                fxRates.setMidMarketValues(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 6))).getText())));
            }
            if(!clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 7))).getText()).equals("-")){
                fxRates.setSellValues(Double.valueOf(clearText(rows.get(i).findElement(By.xpath(String.format(CELL, i, 7))).getText())));
            }

            fxRatesList.add(fxRates);
        }

        return fxRatesList;
    }

    public void getCurrencyRate(CurrencyEnum currencyEnum) {
        WebElement rate = browser.findElement(By.xpath(currencyEnum.getXpath()));
        String value = clearText(rate.getText());
        System.out.println(String.format("%s BUY Rate is %s", currencyEnum.name(),value));
    }
}

