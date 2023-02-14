Feature: Amazon Search

  Scenario: Search Product
    Given I have search field on amazon page
    When I search for a product with name "Apple Macbook pro" and price 1000
    Then Product with name "Apple Macbook pro" should be displayed
