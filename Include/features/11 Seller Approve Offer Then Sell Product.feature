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
Feature: Seller Approve Then Sell Product

  Scenario Outline: The notification list on the navbar displays the product
    Given the buyer negotiates for a product
    And the seller is logged in <email> <password>
    When clicks on the "Notifikasi" button
    Then the notification on the navbar displays the product name, price <priceFormatted> and offer amount <offerFormatted>
    
    Examples:
		| email													| password									| priceFormatted	|	offerFormatted				| 
    | QAE10_GR03_seller@binar.com		| 4IKJKomARpjPH7aiyRZ0CQ== 	| Rp 5.000.000		| Rp 3.000.000					|
    
  Scenario Outline: The notification list page displays the product
   	When the seller clicks on the "Penawaran produk" notification
    Then the notification list displays the product name, price <priceFormatted> and offer amount <offerFormatted>
    
    Examples:
		| priceFormatted	|	offerFormatted				| 
    | Rp 5.000.000		| Rp 3.000.000					| 
    
  Scenario: The seller accepts a product offer
  	When the seller clicks on the "Terima" button
    Then the the negotiated product item displays "Penawaran produk diterima" text
    And the the negotiated product item displays "Status" and "Hubungi di" button
    
  Scenario: The seller marks a product as sold
  	When the seller clicks "Status" button
  	And the seller clicks "Berhasil terjual" button and clicks "Kirim"
  	Then the the negotiated product item displays "Berhasil terjual" text