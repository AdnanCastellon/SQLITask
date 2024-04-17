package com.sqli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage {

    @FindBy(id = "APjFqb")
    public WebElement googleSearchBar;

    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']/center/input[@value=\"Google Search\"]")
    public WebElement btnSearchSubmit;

    @FindBy(xpath = "//div[.='Accept all']")
    public WebElement btnRejectAll;



}
