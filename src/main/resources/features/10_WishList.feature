Feature: Add products to Wishlist

  Scenario: user add different products to Wishlist
    Given Scroll down and choose a random product
    And Click on product
    When Click on ADD TO Wishlist
    Then The product is added to the user's Wishlist successfully