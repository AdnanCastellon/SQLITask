Feature: Automation

  @wip
  Scenario:Wiki automation page
    Given the user navigates to the URL
    And the user inputs automation
    And the user clicks the submit button
    And the search results for the automation are displayed
    When the user clicks the Wiki link for automation
    Then the user is navigated to the wiki automation page
    And the earliest known date for the automation process is displayed
