@customer_ssn
Feature: As_an_employee_create_a_new_customer

  Background: Navigate_to_Create_a_customer_page
    Given user is on the application page
    And user clicks sign in button
    And user enters username of customer
    And user enters password of customer
    And user clicks sign in button in page
    And user clicks my operations button
    And user clicks manage customers button
    And user clicks create A New Customer button

  @EndtoEndTest
  @SmokeTest
  Scenario: TC01_User can search for a customer by using SSN


    And user enters ssn number
    And user clicks on the search button
    Then verify the "green text" is displayed for SSN
    And take the screenshot
    Then close the application

  Scenario: TC02_User can verify all registration info populated for the customer

    And user enters ssn number
    And user clicks on the search button
    Then user verifies the first name of the customer
    And user verifies the last name of the customer
    And user verifies middle initial of the customer
    When user verifies the email of the customer
    And user verifies the mobile phone number of the customer
    And user verifies the phone number of the customer
    And user verifies the Zip Code of the customer
    And user verifies the address of the customer
    And user verifies the city of the customer
    And user verifies the Ssn of the customer
    Then User verifies the Create Date of the customer
    And user verifies the Country of the customer
    And user verifies the State of the customer

