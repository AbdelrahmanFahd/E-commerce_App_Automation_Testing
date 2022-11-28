@Smoke
Feature: Filter With Color

  Background: User Login to WebSite
    Given User Login with "Test5@Test.com" and "123456789"

  Scenario: User Select Shoes and filter with color
    Given Click on Apparel Menu then on Shoes

    When User choose Filter with red

    Then User successfully filter results