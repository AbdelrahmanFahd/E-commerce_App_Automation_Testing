@Smoke
Feature: Select Tags

  Background: User Login to WebSite
    Given User Login with "Test5@Test.com" and "123456789"

  Scenario: User select different tags

    Given Type "shoes" on search text box

    When Click on Search button
    And User Click on tage

    Then User Successfully search for product's tage
