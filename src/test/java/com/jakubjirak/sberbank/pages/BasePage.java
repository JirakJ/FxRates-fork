package com.jakubjirak.sberbank.pages;

import com.jakubjirak.sberbank.common.Browser;

public abstract class BasePage {
    protected Browser browser;

    public BasePage(Browser browser){
        if(browser == null){
            this.browser = new Browser();
        }
        this.browser = browser;
    }
}
