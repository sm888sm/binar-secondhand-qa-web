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
Feature: User Edit Profile Scenarios

	Scenario Outline: User Edit Profile Negative - Empty City
		Given the user logs in with previously created account
		And the user navigates to "Edit Profile" page
		When the user uploads a profile picture, enters a name <fullName>, enters an address <address>, enters a phone number <phoneNumber> and leaves the city field empty
		And the user clicks on "Save Changes"
		Then the user remains on the profile edit page
		
		Examples:
		| fullName						| address   				| phoneNumber     |
    | John Doe						| Jl. Budi Mulia 01	| 080989999		 		|
		
	Scenario Outline: User Edit Profile Negative - Empty Name
		When the user uploads a profile picture, selects a city <city>, enters an address <address>, enters a phone number <phoneNumber> and leaves the name field empty
		And the user clicks on "Save Changes"
		Then the user remains on the profile edit page
		
		Examples:
		| address   				| phoneNumber     | city		|
    | Jl. Budi Mulia 01	| 080989999		 		| 3				|

	
	Scenario Outline: User Edit Profile Negative - Empty Address
		When the user uploads a profile picture, enters a name <fullName>, selects a city <city>, enters a phone number <phoneNumber> and leaves the address field empty
		And the user clicks on "Save Changes"
		Then the user remains on the profile edit page
		
		Examples:
		| fullName						| phoneNumber     | city		|
    | John Doe						| 080989999		 		| 3				|
	
	Scenario Outline: User Edit Profile Negative - Empty Phone Number
		When the user uploads a profile picture, enters a name <fullName>, selects a city <city>, enters an address <address> and leaves the phone number field empty
		And the user clicks on "Save Changes"
		Then the user remains on the profile edit page
		
		Examples:
		| fullName						| address   				| city		|
    | John Doe						| Jl. Budi Mulia 01	| 3				|
	
	Scenario Outline: User Edit Profile Positive
		When the user uploads a profile picture, enters a name <fullName>, selects a city <city>, enters an address <address> and enters a phone number <phoneNumber>
		And the user clicks on "Save Changes"
		Then the user is redirected to the homepage
		And the user clicks on "Profil Saya"
		And the user's name <firstName> and city <cityName> are displayed
#		And the user closes the browser

		Examples:
		| fullName						| address   				| city		| phoneNumber     | cityName		| firstName				|
    | John Doe						| Jl. Budi Mulia 01	| 3				| 080989999		 		| Jakarta			| John						|