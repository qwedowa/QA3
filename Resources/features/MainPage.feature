Feature: As a user I want to have possibility to sign up, sign in, use searchbar

  Scenario: Check error pop-up if user send empty sign up form
    Given I open Automationpractice Website
    When I click on SignIn button
    And I click on CreateAnAccount button
    Then I will see error popup