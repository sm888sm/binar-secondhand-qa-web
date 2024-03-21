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
Feature: User Login and Logout Scenarios

	Scenario Outline: User Login Negative - Invalid E-mail
		Given the user clicks on "Masuk"
		When the user enters an invalid email address <emailAddress> and a valid password <password>
		And the user clicks on "Login"
		Then the user is still on the login page
		
		Examples:
		| emailAddress   			| password     |
    | johnsmithbinar.com	| QJblfja5Cso= |
	
	Scenario Outline: User Login Negative - Invalid Password
		When the user enters a valid email address <emailAddress> and an invalid password <password>
		And the user clicks on "Login"
		Then the user sees an "Invalid Email or password" message
		
		Examples:
		| emailAddress   							| password     |
    | QAE10_GR03_seller@binar.com	| P11S1FO2cCA= |
	
	Scenario Outline: User Login Negative - Empty Password
		When the user enters a valid email address <emailAddress> and an empty password
		And the user clicks on "Login"
		Then the user is still on the login page
		
		Examples:
		| emailAddress   							|
    | QAE10_GR03_buyer@binar.com	|
	
	Scenario Outline: User Login Positive
		When the user enters a valid email address <emailAddress> a valid password <password>
		And the user clicks on "Login"
		Then the user is redirected to the homepage
		And the user clicks on "Profil Saya"
		And the user's name <firstName> is displayed
		
		Examples:
		| emailAddress   							| password     | firstName	|
    | QAE10_GR03_buyer@binar.com	| QJblfja5Cso= | John				|
	
	Scenario: User Logout Positive
		Given the user navigates to the home page
		When the user clicks on "Profil Saya"
		And the user clicks on "Keluar"
		Then the user is logged out and sees the "Masuk" link
#		And the user closes the browser