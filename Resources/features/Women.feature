Feature: As a user I want to have possibility to write review, use filters, compare products, watch photos, add a few products to cart

  Scenario: Check error pop-up if user send review form with Title and empty Comment
    Given I open automationpractice website, sign in
    When I open Women category
    And I choose any product
    And I click on Be the first to write your review! button
    And I write Title and leave empty Comment
    And I click on SendButton
    Then I will see error popup

  Scenario: Check error pop-up if user send review form with Comment and empty Title
    Given I open automationpractice website, sign in
    When I open Women category
    And I choose any product
    And I click on Be the first to write your review! button
    And I write Comment and leave empty Title
    And I click on SendButton
    Then I will see error popup

  Scenario: Check error pop-up if user send review form using Send button
    Given I open automationpractice website
    When I open Women category
    And I choose any product
    And I click on Be the first to write your review! button
    And I write Comment and Title
    And I click on SendButton
    Then I will add an review

  Scenario: Check error pop-up if user send review form using Enter key
    Given I open automationpractice website
    When I open Women category
    And I choose any product
    And I click on Be the first to write your review! button
    And I write Comment and Title
    And I click on Enter key
    Then Nothing happen

  Scenario: Check if user can add to Cart two different products
    Given I open automationpractice website
    When I open Women category
    And I choose two different products
    And I click on Add to Cart button
    And I click on Cart button
    Then I will see all products in Cart

  Scenario: Check if user can use any filters (except Availability)
    Given I open automationpractice website
    When I open Women category
    And I choose any filter in Catalog, except Availability
    Then I will see products with correct filter

  Scenario: Check if user can see results by using Availability filter
    Given I open automationpractice website
    When I open Women category
    And I choose Availability filter in Catalog
    Then I will see less number of products then filter shows

  Scenario: Check if user can compare one product
    Given I open automationpractice website
    When I open Women category
    And I choose any product
    And I click Add to Compare button
    And I click Compare button
    Then I can see compared one product

  Scenario: Check if user can compare three products
    Given I open automationpractice website
    When I open Women category
    And I choose any three products
    And I click Add to Compare button
    And I click Compare button
    Then I can see compared three products

  Scenario: Check if user can zoom photo by using View larger button
    Given I open automationpractice website
    When I open Women category
    And I click on More button of any product
    And I click View larger button
    Then I can see larger photo, but I can't zoom it enough

  Scenario: Check if user can switch between photos by using <; > keys
    Given I open automationpractice website
    When I open Women category
    And I click on More button of any product
    And I click <; > keys
    Then I can't switch between photos

  Scenario: Check if user can switch between photos by using <; > buttons
    Given I open automationpractice website
    When I open Women category
    And I click on More button of any product
    And I click <; > buttons
    Then I can't switch between photos
