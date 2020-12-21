package com.jakubjirak.sberbank;

import com.jakubjirak.sberbank.pages.SberbankHomePage;
import com.jakubjirak.sberbank.common.Browser;
import org.junit.After;
import org.junit.Before;

public abstract class BaseE2ETest {
    protected Browser browser;
    protected SberbankHomePage sberbankHomePage;

    @Before
    public void SetUp() {
        browser = new Browser();
        sberbankHomePage = new SberbankHomePage(browser);
    }

    @After
    public void CleanUp() {
        browser.teardown();
    }
}
