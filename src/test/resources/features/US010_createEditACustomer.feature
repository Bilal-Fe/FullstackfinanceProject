@customer_edit
Feature: US00010_Info_of_customer_can_be_created

  Background: Navigate_to_Create_a_customer_page
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


  Scenario: TC01_name_of_customer_can_be_edited

    And user enters first name of customer
    And user enters last name of customer
    And user enters middle initial of customer
    And user enters Mobile Phone Number of customer
    And user enters phone number of customer
    And user enters Zip Code of customer
    And user enters Address of customer
    And user enters City of customer
    And user edits name of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the webpage

  Scenario: TC02_name_of_the_customer_should_be_updated
    And user edits last name of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application


  Scenario: TC03_Middle_Initial_of_customer_can_be_edited
    And user edits Middle Initial of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application

  Scenario: TC04_Email_of_customer_can_be_edited
    And user edits Email of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application

  Scenario: TC05_Mobile_Phone_Number_of_customer_can_be_edited
    And user edits Mobile Phone Number of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application

  Scenario: TC06_Phone_Number_of_customer_can_be_edited
    And user edits Phone Number of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application

  Scenario: TC07_Zip_Code_of_customer_can_be_edited
    And user edits Zip Code of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application


  Scenario: TC08_Address_of_customer_can_be_edited
    And user edits Address of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application

  Scenario: TC09_City_of_customer_can_be_edited
    And user edits City of customer
    When user clicks on the save button button
    Then take the screenshot
    Then close the application

  Scenario: TC10_Address_of_the_customer_cannot_be_left_as_blank
    And user leaves as blank the address
    When user clicks on the save button button
    Then verify the adress error message is displayed
    Then take the screenshot
    Then close the application

  Scenario: TC11_City_of_customer_cannot_be_left_as_blank
    And user leaves blank as blank the City
    When user clicks on the save button button
    Then verify the city error message is displayed
    Then take the screenshot
    Then close the application

  Scenario: TC12_Country_of_customer_cannot_be_left_as_blank
    And user enters first name of customer
    And user enters last name of customer
    And user enters middle initial of customer
    And user enters Mobile Phone Number of customer
    And user enters phone number of customer
    And user enters Zip Code of customer
    And user enters Address of customer
    And user enters City of customer
    And user enters State of customer
    When user clicks on the save button button
    Then verify the Country error message is not displayed
    Then take the screenshot
    Then close the application

  Scenario: TC13_State_of_customer_cannot_be_left_as_blank
    And user leaves as blank the State
    When user clicks on the save button button
    Then verify the State error message is not displayed
    Then take the screenshot
    Then close the application

