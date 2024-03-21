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
Feature: Buyer Negoiate Product Positive

  Scenario Outline: Buyer negotiates the price for a product
    Given the buyer is logged in <email> <password>
    And the user navigates to the product page
    When the buyer clicks on the "Saya tertarik dan ingin nego" button
    And enters a negotiated offer price <price>
    And clicks the "Kirim" button
    Then the button becomes disabled and the button text becomes "Menunggu respon penjual"
#    And the user closes the browser

		Examples:
		| email													| password			| price			|
    | QAE10_GR03_buyer@binar.com		| QJblfja5Cso= 	| 3000000		|
