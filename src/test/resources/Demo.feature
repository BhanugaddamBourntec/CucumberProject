Feature: login functionality of an E-commerce Application

  Background: login action  ---- common for all Scenarios

    Given user opens the E-commerce website
    And  user enters username and password
    And  Submit login button
    Then Login successfully

    @Smoke
  Scenario: This tests the search product action

    When user searches for an item
    When user found the item
    Then Then click on it
    And  ADD to cart

  Scenario: This tests the payment option

    When user selects a product
    And  click on payment Tab
    Then Payment options should display
    And  confirm the payment
    Then Order Placed