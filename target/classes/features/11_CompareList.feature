Feature: Add products to Compare List

  Scenario: user could add different products to compare list
    Given Scroll down and choose Apple MacBook and HTC One M8
    When Click on ADD TO Compare list
    Then The product is added to the user's Compare list successfully
    And Go to Compare products list