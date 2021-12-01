Feature: Google Search

  Background: 
    Given Open Browser
    And enter Url

  @Smoke
  Scenario: Google Search Valid
    When user give valid input
    Then Field should accept

  @FT
  Scenario: Google Search InValid
    When user give invalid input
    Then Field Should not accept

