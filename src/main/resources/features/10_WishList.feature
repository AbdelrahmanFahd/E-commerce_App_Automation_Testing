@Smoke
Feature: Add products to Wishlist

  Background: User Login to WebSite
    Given User Login with "Test5@Test.com" and "123456789"

  Scenario: user add different products to Wishlist
    Given Scroll down and choose a random product
    And Click on product
    When Click on ADD TO Wishlist
    Then The product is added to the user's Wishlist successfully