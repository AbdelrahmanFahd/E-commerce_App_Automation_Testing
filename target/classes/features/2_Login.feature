Feature: Login

  Scenario:User login with valid data
    Given Click on Login Tab
#
    When User Enter "Test1@Test.com" and "123456789"
    And Click on login Button
#
    Then User could login Successfully

