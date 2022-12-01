@Smoke
Feature: Select Categories

  Background: User Login to WebSite
    Given User Login with "Test10@Test.com" and "123456789"

  Scenario: Hover the header menu and select random category then hover and open sub-category if found

    Given Hover the header menu and select random category then hover it
    When Click on random sub-category if found

    Then User could open sub-category page