package com.sqli.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiPage extends BasePage {
    @FindBy(xpath = "//span[text()='Wikipedia']")
    public WebElement automationSearchResultWiki;

    @FindBy(xpath = "//div[@id='bodyContent']/div[3]/div/p[6]")
    public WebElement paragraphEarliestAutomation;
}
