@Smoke
Feature: Switch Currency

  Background: User Login to WebSite
    Given User Login with "Test10@Test.com" and "123456789"

  Scenario: User could switch currencies

    Given Look for products currency
    When User Change Currency

    Then User could find the selected currency