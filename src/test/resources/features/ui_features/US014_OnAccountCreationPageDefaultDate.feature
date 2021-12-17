#User should sign in as an employee for these test cases
 @check_edit_button
  Feature: Edit button should be clickable
  Background:
    Given user is on the gmi bank application page
    And user clicks sign in button
    When user sign in as an employee
    And user clicks My operations
    And user clicks Manage Account

  Scenario: us014_tc001_descriptionBox_BalanceBox_cannot_blank
    Then check edit button clickable
    Then user clicks signout button
    And close the application

  @SmokeTest
  @click_edit_button
  Scenario: us14_tc002_employee_can_go_to_account_edit_page
    When click edit button
    And user should be able to see Create or edit a Account page
    Then user clicks signout button
    And close the application

  @SmokeTest
  @check_date_format
  Scenario: us14_tc003_date_should_be_m_d_y_h_m
    And user clicks create an account
    Then check the date format
    Then user clicks signout button


  @SmokeTest
  @check_the_current_date
  Scenario: us14_tc004_default_date_should_be_the_same_current_date
    When user clicks create an account
    Then check the date is current date
    Then user clicks signout button

  @creation_an_account_with_future_time
  Scenario: us14_tc005_date_should_not_be_future_date
    When user clicks create an account
    And user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User selects future time for create date
    And User clicks save button
    Then user should get an error message
    Then user clicks signout button
    And close the application

  @creation_an_account_with_past_time
  Scenario: us14_tc006_date_should_not_be_past_date
    When user clicks create an account
    And user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User selects past time for create date
    And User clicks save button
    Then user should get an error message
    Then user clicks signout button
    And close the application

  @hour_and_minute_in_date_box
  Scenario: us14_tc007_date_should_have_hour_minute
    When user clicks create an account
    And user should be able to see Create or edit a Account page
    Then date box has hour and minute
    Then user clicks signout button

  @month_day_and_year_in_date_box
  Scenario: us14_tc008_date_should_have_month_day_year
    When user clicks create an account
    And user should be able to see Create or edit a Account page
    Then date box has month day and minute
    Then user clicks signout button
    And close the application

  @the_Employee_not_blank
  Scenario: us14_tc009_employee_box_should_not_be_blank
    When user clicks create an account
    And user should be able to see Create or edit a Account page
    Then employee box should have elements
    Then user clicks signout button
    And close the application

