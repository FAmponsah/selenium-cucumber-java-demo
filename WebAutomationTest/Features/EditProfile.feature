@usereditprofile
Feature: EditProfileFeature
  As a user of the Automation Practise website
  I want to be able to log in
  So that I can update my profle

  @updatefirstname
  Scenario: As a logged in user I should be able to update my frist name
    Given I am on the website with url 'http://automationpractice.com'
    And I click on the Sign in button
    And I log in as with username as 'SeleniumTesting@gmail.com' and password as 'Selenium123'
    And I click on the User Header Info button
    And I click on the My Personal Information button
    And I change my first name to be 'Frederick'
    And I enter my current password as 'Selenium123'
    When I click on the Save button
    Then I should see a success message saying 'Your personal information has been successfully updated.'
