Feature: Add products to Shopping cart

  Scenario: user add different products to Shopping cart
    Given Scroll down and choose a random product
    And Click on product
    When Click on ADD TO CART button
    Then The product is added to the user's shopping cart successfully