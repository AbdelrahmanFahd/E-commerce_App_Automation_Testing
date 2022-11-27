Feature: Select Tags

  Scenario: User select different tags

    Given Type "shoes" on search text box

    When Click on Search button
    And User Click on tage

    Then User Successfully search for product's tage
