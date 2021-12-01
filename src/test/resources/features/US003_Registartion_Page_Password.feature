@password_requirements
@user_registration
Feature: Registration Page Password Restrictions
  Background: User enters registration page
    Given user is on the gmi bank application page
    And user clicks register button

  Scenario Outline: User Enters Invalid Password
    When user enters ssn "ssn"
    And user enters first name "first_name"
    And user enters last name "last_name"
    And user enters address "address"
    And user enters phone number "phone number"
    And user enters username "username"
    And user enters email "email"
    And user enters invalid password "<invalid_password>" and confirms it
    And user clicks on register button
    Then verify password error message
    And close the application
    Examples: Test Data
      |invalid_password|
      |TECHPROED123!   |
      |techproed123!   |
      |Techproed@      |
      |Techproed1      |
      |Tech@1          |