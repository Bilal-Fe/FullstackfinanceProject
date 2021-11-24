@customer_ssn
Feature: US09_User_can_search_for_a_new_applicant_by_their_SSN_and_see_all_their_registration_info_populated
  Scenario: TC01_User_can_search_by_SSN_and_see_all_registration_info

    Given user is on the application page
    And user enters ssn number
    When user clicks on the search button
    Then verify the "green text" is displayed
    Then take the screenshot