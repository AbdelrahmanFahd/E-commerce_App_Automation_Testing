@Registration
Feature: Registration

  Scenario:User register with valid data
    Given Click on Register Button

    #Your Personal Details
    When User Choose any Gender
    And User enter First name and Last name
    And User Select Date of Birth: Select [Day, Month, Year]
    And User enter email: "Test5@Test.com"
    #Company Details
    And User enter Company name
    #Your Password
    And User Enter Password and Confirm: "123456789"
    And Click on REGISTER Button

    Then User could register successfully
    And Click on Continue Button