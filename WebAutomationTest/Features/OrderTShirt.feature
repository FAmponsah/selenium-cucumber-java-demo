@placeorders
Feature: OrderTShirtFeature
  As a user of the Automation Practise website
  I want to be able to log in
  So that I can place an order for a t-shirt

  @ordertshirt
  Scenario: As a logged in user I should be able to order a t-shirt
    Given I am on the website with url 'http://automationpractice.com'
    And I click on the Sign in button
    And I log in as with username as 'SeleniumTesting@gmail.com' and password as 'Selenium123'
    And I click on the T-SHIRTS tab
    And I click on the Add to cart button
    And I click on the Proceed to checkout button
    And I click on the Proceed to checkout button on the shopping cart summary page
    And I select the I agree to terms of service checkbox
    When I click on the 'Pay by bank wire' button
    Then I can confirm my order has been placed
