@create_account
Feature: User create a new account as a employee

  Background:
    Given user is on the gmi bank application page
    And user clicks sign in button
    When user sign in as an employee
    And user clicks My operations
    And user clicks Manage Account
    Then user clicks create an account
    And user should be able to see Create or edit a Account page

  @checking_blanks_box_errors
  Scenario: us013_tc001_descriptionBox_BalanceBox_cannot_blank
    When user not enter description see an error message for description box
    Then user  not enter balance see an error message for balance box
    Then user clicks signout button
    And close the application



  @create_checking_active_account
  Scenario: us013_tc002_create_new_checking_account_with_active_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Active status type
    And User clicks save button
    Then user clicks signout button
    And close the application



  @create_checking_suspended_account
  Scenario: us013_tc003_create_new_checking_account_with_suspended_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User clicks save button
    Then user clicks signout button
    And close the application



  @create_checking_closed_account
  Scenario: us013_tc004_create_new_checking_account_with_closed_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Closed status type
    And User clicks save button
    Then user clicks signout button
    And close the application



  @create_saving_active_account
  Scenario: us013_tc005_create_new_saving_account_with_active_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Saving account type
    And user  selects Active status type
    And User clicks save button
    Then user clicks signout button
    And close the application



  @create_saving_suspended_account
  Scenario: us013_tc006_create_new_saving_account_with_active_suspended_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Saving account type
    And user  selects Suspended status type
    And User clicks save button
    Then user clicks signout button
    And close the application



  @create_saving_closed_account
  Scenario: us013_tc007_create_new_checking_account_with_active_status_type


    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Saving account type
    And user  selects Closed status type
    And User clicks save button
    Then user clicks signout button
    And close the application



  @create_credit_card_active_account
  Scenario: us013_tc008_create_new_credit_card_account_with_active_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Credit_card account type
    And user  selects Active status type
    And User clicks save button
    Then user clicks signout button
    And close the application




  @create_credit_card_suspended-account
  Scenario: us013_tc009_create_new_credit_card_account_with_suspended_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User clicks save button
    Then user clicks signout button
    And close the application




  @create_credit_card_closed_account
  Scenario: us013_tc0010_create_new_credit_card_account_with_closed_status_type

    When user enters data in description box
    And user  provides a balance for the first time account creation as Dollar
    Then user  selects Checking account type
    And user  selects Suspended status type
    And User clicks save button
    Then user clicks signout button
    And close the application


  @checking_account_type_options_account
  Scenario: us013_tc0011_account_type_options
    When user select accounts there should be four accounts
    Then user clicks signout button
    And close the application


  @checking_account_status_options_account
  Scenario: us013_tc0012_account_status_options
    When user select accounts status there should be three accounts
    And close the application



