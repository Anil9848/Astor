Feature: Login Feature

  Scenario Outline: Verify Actitime Valid Login
    Given User Opens Browser
    And enters actitime url
    When user enter <username>
    And user enters <password>
    And user clicks on Login Button
    Then Home Page Should be Displayed

    Examples: 
      | username | password |
      | admin    | manager  |
