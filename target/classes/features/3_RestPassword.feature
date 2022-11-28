@Smoke
Feature: ResetPassword

  Scenario: User could restPassword with valid email
    Given Click on Login Tab and ForgetPassword button

    When User Enter: "Test5@Test.com"
    And Click on RECOVER Button

    Then User receive Message to his email Successfully


