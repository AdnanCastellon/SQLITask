package com.sqli.stepDefinitions;

import com.sqli.pages.GoogleSearchPage;
import com.sqli.pages.WikiPage;
import com.sqli.utilities.ConfigurationReader;
import com.sqli.utilities.Driver;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;

import static org.junit.Assert.*;

public class Automation {

        GoogleSearchPage googleSearchPage = new GoogleSearchPage();
        WikiPage wikiPage = new WikiPage();

        @Given("the user navigates to the URL")
        public void the_user_navigates_to_the_url() throws InterruptedException {
            Driver.getDriver().get(ConfigurationReader.getProperty("URL"));

//            Thread.sleep(3000);

            googleSearchPage.btnRejectAll.click();

            assertEquals("Google", Driver.getDriver().getTitle());
//            System.out.println(Driver.getDriver().getTitle());
        }
        @When("the user inputs automation")
        public void the_user_inputs_automation () {
            googleSearchPage.googleSearchBar.sendKeys("automation"+ Keys.ENTER);
        }
        @When("the user clicks the submit button")
        public void the_user_clicks_the_submit_button () throws InterruptedException {
            Thread.sleep(2000);
        }
        @Then("the search results for the automation are displayed")
        public void the_search_results_for_the_automation_are_displayed () {
            assertEquals("automation - Google Search", Driver.getDriver().getTitle());
        }

    @When("the user clicks the Wiki link for automation")
    public void the_user_clicks_the_wiki_link_for_automation() {
            wikiPage.automationSearchResultWiki.click();

    }
    @Then("the user is navigated to the wiki automation page")
    public void the_user_is_navigated_to_the_wiki_automation_page() {
        String title = Driver.getDriver().getTitle();
        assertEquals("Automation - Wikipedia", Driver.getDriver().getTitle());
    }
    @Then("the earliest known date for the automation process is displayed")
    public void the_earliest_known_date_for_the_automation_process_is_displayed() {
        String paragraph = wikiPage.paragraphEarliestAutomation.getText();
        String[] words = paragraph.split(" ");
        for (String word: words) {
            if (word.contentEquals("270")) {
                System.out.println("Earliest known date for automation is circa BC " + word);
            }
        }
    }

}

