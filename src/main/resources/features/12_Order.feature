Feature: Create Order

  Scenario: User create successful Order

    Given User Login with "Test1@Test.com" and "123456789"
    When User search for "Glass" , "HTC One M8 Android L 5.0 Lollipop" and add them to CART
    And User Click on Shopping cart
    And User Accept terms and Click on CheckOut Button
    And User Click Fill Address and Click Continue
    And User Click Continue Button on Shipping method
    And User Click Continue Button on payment method
    And User Click Continue Button on payment information
    And User Click Confirm Button

    Then User could ordered successfully





