Feature: Google Page

  Scenario: Verify Google Page
    Given User opens <browser> test
    Then verify page
    
    Examples:
    | browser |
    | chrome  |