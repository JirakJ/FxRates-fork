package com.jakubjirak.sberbank.enums;

public enum CurrencyEnum {

    AUD(2),
    CAD(3),
    DKK(4),
    EUR(5),
    GBP(6),
    HRK(7),
    HUF(8),
    CHF(9),
    JPY(10),
    NOK(11),
    PLN(12),
    RON(13),
    RUB(14),
    SEK(15),
    TRY(16),
    USD(17);

    private int value;
    CurrencyEnum(int i) {
        this.value = i;
    }

    public String getXpath(){
        String xpath = String.format("//tr[%d]/td[1]/span", value);
        return xpath;
    }
}