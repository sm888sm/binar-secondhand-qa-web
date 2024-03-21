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
Feature: User Sign Up

#  Background: 
#    Given the user opens the website "https://https://secondhand.binaracademy.org"

  Scenario Outline: User Sign Up Negative - Invalid Name
    Given the user clicks on "Masuk"
    When the user clicks on "Daftar di sini"
    And the user enters their full name empty, email address and password <password>
    And the user clicks on "Daftar"
    Then the user is still on the sign-up page

    Examples: 
      | password     |
      | QJblfja5Cso= |
#      | QJblfja5Cso= |

  Scenario Outline: User Sign Up Negative - Invalid E-mail
#    When the user clicks on "Masuk"
#    And the user clicks on "Daftar di sini"
    When the user enters their full name <fullName>, invalid email address and password <password>
    And the user clicks on "Daftar"
    Then the user is still on the sign-up page

    Examples: 
      | fullName   | password     |
      | John Smith | QJblfja5Cso= |
#      | Jean Doe   | QJblfja5Cso= |

  Scenario Outline: User Sign Up Negative - Invalid Password
    #When the user clicks on "Masuk"
    #And the user clicks on "Daftar di sini"
    When the user enters their full name <fullName>, email address and empty password
    And the user clicks on "Daftar"
    Then the user is still on the sign-up page

    Examples: 
      | fullName   |
      | John Smith |
#      | Jean Doe   |
      
  Scenario Outline: User Sign Up Negative - Already Registered E-mail
#    When the user clicks on "Masuk"
#    And the user clicks on "Daftar di sini"
    When the user enters their full name <fullName>, already registered email address <emailAddress> and password <password>
    And the user clicks on "Daftar"
    Then the error message "Email has already been taken" is displayed
    And the user is still on the sign-up page
    
  Examples: 
      | fullName   | emailAddress     							| password     |
      | John Smith | QAE10_GR03_buyer@binar.com			| QJblfja5Cso= |
#      | Jean Doe   | QAE10_GR03_seller@binar.com		| QJblfja5Cso= |

  Scenario Outline: User Sign Up Positive
#    When the user clicks on "Masuk"
#    And the user clicks on "Daftar di sini"
    When the user enters their full name <fullName>, unique email address and password <password>
    And the user clicks on "Daftar"
    Then the user is redirected to the homepage
    And the user clicks on "Profil Saya"
    Then the user's name <firstName> is displayed
#    And the user closes the browser

    Examples: 
      | fullName   | password     | firstName |
      | John Smith | QJblfja5Cso= | John      |
#      | Jean Doe   | QJblfja5Cso=	| Jane      |
