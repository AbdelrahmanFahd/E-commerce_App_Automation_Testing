@Smoke
Feature: Search Functionality

  Background: User Login to WebSite
    Given User Login with "Test5@Test.com" and "123456789"

  Scenario: user could search for product by name

    Given Type "Samsung Series 9" on search text box

    When Click on Search button

    Then User could find Samsung products


