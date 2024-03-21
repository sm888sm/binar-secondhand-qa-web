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
Feature: Seller Edit Product

  Scenario Outline: Seller edits a product with an empty product category
  	Given the seller is logged in <email> <password>
  	And the seller navigates to the "Product Saya" page
  	And the seller clicks on the product
  	And the seller clicks on the "Edit" button
    When the seller leaves the to-be-edited product category field empty and fills valid product name <productName>, price <price>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product category should be displayed
    And the seller remains on the "Edit Product" page
    
    Examples:
		| email													| password									| productName			| price			| category		| description		    	| image																									|
    | QAE10_GR03_seller@binar.com		| 4IKJKomARpjPH7aiyRZ0CQ== 	|	Notebook				| 8000000		| 1						| Used notebook				| C://Uploads//laptop-2.jpeg	|

  Scenario Outline: Seller edits a product with an empty product name
    When the seller enters an empty the to-be-edited product name and fills valid product price <price>, category <category>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product name should be displayed
    And the seller remains on the "Edit Product" page
    
    Examples:
		| price			| category		| description		    	| image												|
    | 8000000		|	1						| Used notebook				| C://Uploads//laptop-2.jpeg	|

  Scenario Outline: Seller edits a product with an empty product price
    When the seller leaves the to-be-edited product price field empty and fills valid product name <productName>, category <category>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product price should be displayed
    And the seller remains on the "Edit Product" page
    
    Examples:
		| productName						| category		| description					| image																									|
    | Notebook							| 1						| Used notebook				| C://Uploads//laptop-2.jpeg	|

  Scenario Outline: Seller edits a product with an empty product description
    When the seller leaves the to-be-edited product description field empty and fills valid product name <productName>, price <price>, category <category> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product description should be displayed
    And the seller remains on the "Edit Product" page
    
    Examples:
		| productName						| price			| category		| image												|
    | Notebook							| 8000000		| 1						| C://Uploads//laptop-2.jpeg	|

  Scenario Outline: Seller edits a product with all valid details
    When the seller fills valid to-be-edited product name <productName>, price <price>, category <category>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then the edited product is submitted with valid information <categoryName>, <priceFormatted>, <description>, <sellerName>, <sellerCity>
    
    Examples:
		| productName						| price			| category		| description	      	| image												| priceFormatted	|	categoryName	| sellerName									| sellerCity	|
    | Notebook							| 8000000		| 1						| Used notebook				| C://Uploads//laptop-2.jpeg	| Rp 8.000.000		| Hobi					| Seller QA Group 03 Wave 10	| Jakarta			|