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
Feature: Use Search Product

  Scenario Outline: User searches and views a product
    When the user enters the product name in the search field
    And presses the Enter key
    Then the search results should display the product name, category <categoryName> and price <priceFormatted>
    
    Examples:
		| description	      	| priceFormatted	|	categoryName				|
    | Used laptop					| Rp 5.000.000		| Elektronik					|
    
  Scenario Outline: User clicks the product to open the product page
  	When the user clicks on the desired product from the search results
    Then the user is redirected to the product details page
    And the product is submitted with valid information <categoryName>, <priceFormatted>, <description>, <sellerName>, <sellerCity>
    
    Examples:
		| description	      | priceFormatted	|	categoryName				| sellerName									| sellerCity	|
    | Used laptop				| Rp 5.000.000		| Elektronik					| Seller QA Group 03 Wave 10	| Jakarta			|