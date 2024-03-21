#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario Outline: Business rule through list of steps with arguments.
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
Feature: Seller Add New Product

  Scenario Outline: Seller adds a new product with an empty product category
  	Given the seller is logged in <email> <password>
  	And the seller navigates to the "Add New Product" page
    When the seller leaves the product category field empty and fills valid product name <productName>, price <price>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product category should be displayed
    And the seller remains on the "Add New Product" page
    
    Examples:
		| email													| password									| productName		| price			| category		| description		    | image											|
    | QAE10_GR03_seller@binar.com		| 4IKJKomARpjPH7aiyRZ0CQ== 	|	Laptop				| 5000000		| 4						| Used laptop				| C://Uploads//laptop-1.jpg	|

  Scenario Outline: Seller adds a new product with an empty product name
    When the seller enters an empty product name and fills valid product price <price>, category <category>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product name should be displayed
    And the seller remains on the "Add New Product" page
    
    Examples:
		| price			| category		| description		    | image											|
    | 5000000		|	4						| Used laptop				| C://Uploads//laptop-1.jpg	|

  Scenario Outline: Seller adds a new product with an empty product price
    When the seller leaves the product price field empty and fills valid product name <productName>, category <category>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product price should be displayed
    And the seller remains on the "Add New Product" page
    
    Examples:
		| productName					| category		| description				| image											|
    | Laptop							| 4						| Used laptop				| C://Uploads//laptop-1.jpg	|

  Scenario Outline: Seller adds a new product with an empty product description
    When the seller leaves the product description field empty and fills valid product name <productName>, price <price>, category <category> and image <image>
    And clicks on the "Terbitkan" button
    Then an error message for the empty product description should be displayed
    And the seller remains on the "Add New Product" page
    
    Examples:
		| productName					| price			| category		| image											|
    | Laptop							| 5000000		| 4						| C://Uploads//laptop-1.jpg	|

  Scenario Outline: Seller adds a new product with all valid details
    When the seller fills valid product name <productName>, price <price>, category <category>, description <description> and image <image>
    And clicks on the "Terbitkan" button
    Then the product is submitted with valid information <categoryName>, <priceFormatted>, <description>, <sellerName>, <sellerCity>
    
    Examples:
		| productName					| price			| category		| description	      | image											| priceFormatted	|	categoryName	| sellerName									| sellerCity	|
    | Laptop							| 5000000		| 4						| Used laptop				| C://Uploads//laptop-1.jpg	| Rp 5.000.000		| Elektronik		| Seller QA Group 03 Wave 10	| Jakarta			|
    
    
	Scenario Outline: Seller adds a new product with empty profile
    Given the user navigates to the home page
    And the user clicks on "Profil Saya"
    And the user clicks on "Keluar"
    And the seller is logged in <email> <password>
    When the seller navigates to the "Add New Product" page
    Then the seller is redirected to the edit profile page
    
    Examples:
		| email																	| password												|
    | qae_gr03_seller_empty_02@binar.com		| 4IKJKomARpjPH7aiyRZ0CQ==				|