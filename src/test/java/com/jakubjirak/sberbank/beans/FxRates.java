package com.jakubjirak.sberbank.beans;

public class FxRates {
    private String name;
    private Double buyForeignCurrencies;
    private Double midMarketForeignCurrencies;
    private Double midEcbForeignCurrencies;
    private Double sellForeignCurrencies;
    private Double buyValues;
    private Double midMarketValues;
    private Double sellValues;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBuyForeignCurrencies() {
        return buyForeignCurrencies;
    }

    public void setBuyForeignCurrencies(Double buyForeignCurrencies) {
        this.buyForeignCurrencies = buyForeignCurrencies;
    }

    public Double getMidMarketForeignCurrencies() {
        return midMarketForeignCurrencies;
    }

    public void setMidMarketForeignCurrencies(Double midMarketForeignCurrencies) {
        this.midMarketForeignCurrencies = midMarketForeignCurrencies;
    }

    public Double getMidEcbForeignCurrencies() {
        return midEcbForeignCurrencies;
    }

    public void setMidEcbForeignCurrencies(Double midEcbForeignCurrencies) {
        this.midEcbForeignCurrencies = midEcbForeignCurrencies;
    }

    public Double getSellForeignCurrencies() {
        return sellForeignCurrencies;
    }

    public void setSellForeignCurrencies(Double sellForeignCurrencies) {
        this.sellForeignCurrencies = sellForeignCurrencies;
    }

    public Double getBuyValues() {
        return buyValues;
    }

    public void setBuyValues(Double buyValues) {
        this.buyValues = buyValues;
    }

    public Double getMidMarketValues() {
        return midMarketValues;
    }

    public void setMidMarketValues(Double midMarketValues) {
        this.midMarketValues = midMarketValues;
    }

    public Double getSellValues() {
        return sellValues;
    }

    public void setSellValues(Double sellValues) {
        this.sellValues = sellValues;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FxRates{" );
        if(name != null){
            stringBuilder.append("name='" + name + "', ");
        }
        if(buyForeignCurrencies != null){
            stringBuilder.append("buyForeignCurrencies='" + buyForeignCurrencies + "', ");
        }
        if(midMarketForeignCurrencies != null){
            stringBuilder.append("midMarketForeignCurrencies='" + midMarketForeignCurrencies + "', ");
        }
        if(midEcbForeignCurrencies != null){
            stringBuilder.append("midEcbForeignCurrencies='" + midEcbForeignCurrencies + "', ");
        }
        if(sellForeignCurrencies != null){
            stringBuilder.append("sellForeignCurrencies='" + sellForeignCurrencies);
        }
        if(buyValues != null){
            stringBuilder.append("', buyValues='" + buyValues + "' ,");
        }
        if(midMarketValues != null){
            stringBuilder.append("midMarketValues='" + midMarketValues + "', ");
        }
        if(sellValues != null){
            stringBuilder.append("sellValues='" + sellValues + '\'');
        }
        stringBuilder.append('}');

        return stringBuilder.toString();
    }

    //VALID (RFC 8259)
    public String toJson() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{" );
        if(name != null){
            stringBuilder.append("\"name\": \"" + name + "\", ");
        }
        if(buyForeignCurrencies != null){
            stringBuilder.append("\"buyForeignCurrencies\": " + buyForeignCurrencies + ", ");
        }
        if(midMarketForeignCurrencies != null){
            stringBuilder.append("\"midMarketForeignCurrencies\": " + midMarketForeignCurrencies + ", ");
        }
        if(midEcbForeignCurrencies != null){
            stringBuilder.append("\"midEcbForeignCurrencies\": " + midEcbForeignCurrencies + ", ");
        }
        if(sellForeignCurrencies != null){
            stringBuilder.append("\"sellForeignCurrencies\": " + sellForeignCurrencies);
        }
        if(buyValues != null){
            stringBuilder.append(", \"buyValues\": " + buyValues + ", ");
        }
        if(midMarketValues != null){
            stringBuilder.append("\"midMarketValues\": " + midMarketValues + ", ");
        }
        if(sellValues != null){
            stringBuilder.append("\"sellValues\": " + sellValues);
        }
        stringBuilder.append('}');

        return stringBuilder.toString();
    }

    public String toCsv(final String delimiter) {
        StringBuilder stringBuilder = new StringBuilder();
        if(name != null){
            stringBuilder.append(name).append(delimiter);
        }
        if(buyForeignCurrencies != null){
            stringBuilder.append(buyForeignCurrencies).append(delimiter);
        }
        if(midMarketForeignCurrencies != null){
            stringBuilder.append(midMarketForeignCurrencies).append(delimiter);
        }
        if(midEcbForeignCurrencies != null){
            stringBuilder.append(midEcbForeignCurrencies).append(delimiter);
        }
        if(sellForeignCurrencies != null){
            stringBuilder.append(sellForeignCurrencies);
        }
        if(buyValues != null){
            stringBuilder.append(delimiter).append(buyValues).append(delimiter);
        }
        if(midMarketValues != null){
            stringBuilder.append(midMarketValues).append(delimiter);
        }
        if(sellValues != null){
            stringBuilder.append(sellValues);
        }

        return stringBuilder.toString();
    }
}
