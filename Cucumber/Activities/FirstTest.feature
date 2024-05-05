Feature: Basic Syntax

  @scenario1
  Scenario: Open the TS homepage
    Given the user is om the TS homepage
    When they click on the About Us link
    Then the user is redirected to the About Page
    Then close the browser

