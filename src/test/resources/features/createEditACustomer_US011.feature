@date_info

Feature: US011_the_date_should_be_typed_at_the_time_of_creation_a_customer

  Scenario: TC01_date_of_account_of_customer_can_be_created

    Given user is on the application page
    And user enters date of account of_customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot


  Scenario: TC02_Country_of_customer_can_be_created

    Given user is on the application page
    And user enters Country of_customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC03_State_of_customer_can_be_created

    Given user is on the application page
    And user enters State of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC04_User_name_of_customer_can_be_created

    Given user is on the application page
    And user enters User name of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC05_Account_of_customer_can_be_created

    Given user is on the application page
    And user enters Account of customer
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC06_Zelle_Enrolled_can_be_created

    Given user is on the application page
    And user enters Zelle Enrolled
    When user clicks on the enter button
    Then verify the "This field is required." is not displayed
    Then take the screenshot

  Scenario: TC06_save_button_can_be_clicked

    Given user is on the application page
    When user clicks on the save button
    Then verify the "This field is required." is not displayed
    Then take the screenshot