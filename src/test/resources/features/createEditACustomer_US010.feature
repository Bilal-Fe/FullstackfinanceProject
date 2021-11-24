@customer_info
Feature: US010_Info_of_customer_can_be_created

  Scenario: TC01_name_of_customer_can_be_created

    Given user is on the application page
    And user enters name of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot


  Scenario: TC02_last_name_of_customer_can_be_created

    Given user is on the application page
    And user enters last name of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot


  Scenario: TC03_Middle_Initial_of_customer_can_be_created

    Given user is on the application page
    And user enters Middle Initial of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC04_Email_of_customer_can_be_created

    Given user is on the application page
    And user enters Email of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC05_Mobile_Phone_Number_of_customer_can_be_created

    Given user is on the application page
    And user enters Mobile Phone Number of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC06_Phone_Number_of_customer_can_be_created

    Given user is on the application page
    And user enters Phone Number of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC07_Zip_Code_of_customer_can_be_created

    Given user is on the application page
    And user enters Zip Code of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot


  Scenario: TC08_Address_of_customer_can_be_created

    Given user is on the application page
    And user enters Address of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot


  Scenario: TC09_City_of_customer_can_be_created

    Given user is on the application page
    And user enters City of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC10_Ssn_of_customer_can_be_created

    Given user is on the application page
    And user enters Ssn of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot
