package com.jakubjirak.sberbank;

import com.jakubjirak.sberbank.beans.FxRates;
import com.jakubjirak.sberbank.enums.CurrencyEnum;
import com.jakubjirak.sberbank.pages.FxRatesPage;
import org.junit.Test;

import java.util.List;

public class ExchangeRateFinderTests extends BaseE2ETest {

    @Test
    public void FindEuroRate() {
        sberbankHomePage.openFxRates().getCurrencyRate(CurrencyEnum.EUR);
    }

    @Test
    public void FindCurrencies() {
        sberbankHomePage.openFxRates().getCurrencies();
    }

    @Test()
    public void FindAllKnownExchangeRates() {
        FxRatesPage fxRatesPage = sberbankHomePage.openFxRates();
        List<FxRates> fxRatesList = fxRatesPage.getCurrencies();

        //To custom string
        for (FxRates fxRates:
             fxRatesList) {
            System.out.println(fxRates.toString());
        }

        //To csv with setup able delimiter
        for (FxRates fxRates:
             fxRatesList) {
            System.out.println(fxRates.toCsv(";"));
        }

        //To JSON
        for (FxRates fxRates:
             fxRatesList) {
            System.out.println(fxRates.toJson());
        }
    }
}
