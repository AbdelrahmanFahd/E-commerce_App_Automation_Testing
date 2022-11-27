Feature: Switch Currency

  Scenario: User could switch currencies

    Given Look for products currency
    When User Change Currency

    Then User could find the selected currency