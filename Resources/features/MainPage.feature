Feature: As a user I want to have possibility to sign up, sign in, use searchbar

  Scenario: Check error pop-up if user send empty sign up form
    Given I open Automationpractice Website
    When I click on SignIn button
    And I click on CreateAnAccount button
    Then I will see error popup

  Scenario: Check error pop-up if user send incorrect data in sign up form
    Given I open Automationpractice Website
    When I click on SignIn button
    And I write "123abc" and click on CreateAnAccount button
    Then I will see error popup

  Scenario: Check error pop-up if user send correct data in sign up form
    Given I open Automationpractice Website
    When I click on SignIn button
    And I write "123abc@gmail.com" and click on CreateAnAccount button
    Then I will able to create an account

  Scenario: Check error pop-up if user sign in with correct data
    Given I open Automationpractice Website
    When I click on SignIn button
    And I write correct data and click on SignIn button
    Then I will sign in

  Scenario: Check error pop-up if user sign in with correct e-mail address and incorrect password
    Given I open Automationpractice Website
    When I click on SignIn button
    And I write correct e-mail address and incorrect password
    Then I will see error popup

  Scenario: Check error pop-up if user sign in with incorrect e-mail address and correct password
    Given I open Automationpractice Website
    When I click on SignIn button
    And I write incorrect e-mail address and correct password
    Then I will see error popup

  Scenario: Check error pop-up if user send empty search form
    Given I open automationpractice website
    When I click on Search button
    Then I will see error popup

  Scenario: Check error pop-up if user send search form with phrase "Dress"
     Given I open automationpractice website
    When I click on Search button
    And I search with phrase "Dress"
    Then I will see 7 results

