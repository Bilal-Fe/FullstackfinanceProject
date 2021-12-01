@customer_ssn
Feature: US00009_User_can_search_for_a_new_applicant_by_their_SSN_and_see_all_their_registration_info_populated

  Background: Navigate_to_Create_a_customer_page
    Given user is on the application page
    And user clicks sign in button
    And user enters username of customer
    And user enters password of customer
    And user clicks sign in button in page
    And user clicks my operations button
    And user clicks manage customers button
    And user clicks create A New Customer button

  Scenario: TC01_User can search by SSN and see all registration info


    And user enters ssn number
    And user clicks on the search button
    Then verify the "green text" is displayed
    And take the screenshot
    Then close the application

