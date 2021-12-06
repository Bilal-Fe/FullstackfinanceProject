@date_edit

Feature: US00011_the_date_should_be_typed_at_the_time_of_creation_a_customer

  Background: Navigating_to_the_page

    Given user is on the application page
    And user clicks sign in button
    And user enters username of customer
    And user enters password of customer
    And user clicks sign in button in page
    And user clicks my operations button
    And user clicks manage customers button
    And user clicks create A New Customer button
    And user enters ssn number
    And user clicks on the search button
    And user enters name of customer
    And user enters last name of customer
    And user enters middle initial of customer
    And user enters Mobile Phone Number of customer
    And user enters phone number of customer
    And user enters Zip Code of customer
    And user enters Address of customer
    And user enters City of customer
    And user enters Ssn of customer

  @smoke
  Scenario: TC01_date_of_account_of_customer_can_be_created

    And user enters Ssn of customer
    Then verify the green text is displayed
    Then close the application


  Scenario: TC02_customer_account_date_can_be_edited

    And user edits date of customer account
    When user clicks on the save button button
    Then verify the green text is displayed
    Then take the screenshot
    Then close the application

  Scenario: TC03_Country_of_customer_can_be_created

    And user edits Country_of_customer
    When user clicks on the save button button
    Then verify the green text is displayed
    Then take the screenshot
    Then close the application


  Scenario: TC04_State_of_customer_can_be_created

    And user edits State_of_customer
    And user edits Country_of_customer
    When user clicks on the save button button
    Then verify the green text is displayed
    Then take the screenshot
    Then close the application


  Scenario: TC05_User_name_of_customer_can_be_created

    And user edits User_name_of_customer
    And user edits Country_of_customer
    And user edits State_of_customer
    When user clicks on the save button button
    Then verify the green text is displayed
    Then take the screenshot
    Then close the application


  Scenario: TC06_Account_of_customer_can_be_created

    And user edits Account_of_customer
    And user edits Country_of_customer
    And user edits State_of_customer
    When user clicks on the save button button
    Then verify the green text is displayed
    Then take the screenshot
    Then close the application

  Scenario: TC07_Zelle_can_be_created

    And user edits Zelle_of_customer
    And user edits Account_of_customer
    And user edits Country_of_customer
    And user edits State_of_customer
    When user clicks on the save button button
    Then verify the green text is displayed
    Then take the screenshot
    Then close the application

  Scenario: TC08_customer_account_date_should_be_completed

    And user enters incomplete of customer's account date
    When user clicks on the save button button
    Then verify the Create Date is displayed
    Then take the screenshot
    Then close the application


  Scenario: TC09_user_should_be entered the snn

    And user enters incomplete of customer's snn
    When user clicks on the save button button
    Then verify the snn error message is displayed
    Then take the screenshot
    Then close the application


  Scenario: TC10_user_should_be entered the city

    And user enters incomplete of city
    When user clicks on the save button button
    Then verify the city error message is displayed
    Then take the screenshot
    Then close the application


