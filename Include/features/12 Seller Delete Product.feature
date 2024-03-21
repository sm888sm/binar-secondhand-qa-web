#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Seller Delete Product
  I want to use this template for my feature file

  @tag1
  Scenario Outline: The seller deletes a product
    Given the seller is logged in <email> <password>
    And the user navigates to the to-be-deleted product page
    When the seller clicks "Delete" button
    Then the page redirects to "Daftar Jual Saya" page
    And the deleted product doesn't exist in the product list

    Examples:
		| email													| password									|
    | QAE10_GR03_seller@binar.com		| 4IKJKomARpjPH7aiyRZ0CQ== 	|