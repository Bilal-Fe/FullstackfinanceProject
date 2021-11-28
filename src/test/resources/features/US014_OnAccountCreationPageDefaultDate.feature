#User should sign in as an employee for these test cases
 @check_edit_button
  Feature: Edit button should be clickable
  Background:
    Given user is on the gmi bank application page
    And user clicks sign in button
    When user register as an employee
    And user clicks My operations
    And user clicks Manage Account


  Scenario: us014_tc001_descriptionBox_BalanceBox_cannot_blank
    Then check edit button clickable

  @click_edit_button
  Scenario: us14_tc002_employee_can_go_to_account_edit_page
    When click edit button
    Then check 'Create or Edit An account'

  @check_date_format
  Scenario: us14_tc003_date_should_be_m_d_y_h_m
    And user should be able to see Create or edit a Account page
    Then check the date format

  @check_the_current_date
  Scenario: us14_tc004_default_date_should_be_the_same_current_date
    And user should be able to see Create or edit a Account page
    Then check the date is current date

  @creation_an_account_with_feature_time
  Scenario: us14_tc005_date_should_not_be_future_date
    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User selects future time for create date
    And User selects closed date
    And User clicks save button
    Then user should get an error message

  @creation_an_account_with_past_time
  Scenario: us14_tc006_date_should_not_be_past_date
    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User selects past time for create date
    And User selects closed date
    And User clicks save button
    Then user should get an error message

  @hour_and_minute_in_date_box
  Scenario: us14_tc007_date_should_have_hour_minute
    And user should be able to see Create or edit a Account page
    Then date box has hour and minute

  @month_day_and_year_in_date_box
  Scenario: us14_tc008_date_should_have_month_day_year
    And user should be able to see Create or edit a Account page
    Then date box has month daand minute

  @the_Employee_not_blank
  Scenario: us14_tc009_employee_box_should_not_be_blank
    And user should be able to see Create or edit a Account page
    Then employee box should have elements



    Given user is on the gmi bank application page
    And user clicks sign in button
    When user signs in as an employee
    Then user clicks MyOperations
    And user clicks Manage Account
    And user clicks create an account
    And user should be able to see Create or edit a Account page
    Given user on the create an account page