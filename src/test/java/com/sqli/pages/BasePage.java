package com.sqli.pages;

import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
