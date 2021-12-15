@manage_customer
Feature: As_an_Employee_manage_Costumer

  Background:
    Given user is on the gmi bank application page
    And user clicks on Sign in button
    When user enter employee credentials and click sign in button
    Then verify that user is in the employee page
    When user clicks on My Operation button
    And user clicks on Manage Customer button
    Then verify that user is in the Customer page

  Scenario: TC_01 All customers should show up on manage customers module
    And verify that all Customers account informations are appear
    And close the webpage

  Scenario: TC_02 Manage Customer page should have view option
    Then verify that view button is clickable
    When user clicks on view button
    Then verify that all customer info is navigated
    And verify that edit button is clickable
    And close the webpage

  Scenario: TC_03 Customer information can be populated by using edit button
    Then verify that edit button is clickable
    When user clicks on edit button
    Then verify that save button is clickable
    And close the webpage
<<<<<<< HEAD:src/test/resources/features/US012_As_An_Employee_manage_Customer.feature
  @smoke
=======
  @SmokeTest
>>>>>>> main:src/test/resources/features/ui_features/US012_As_An_Employee_manage_Customer.feature
  Scenario:TC_04 Customer information can be edit by using edit button
    Then verify that edit button is clickable
    When user clicks on edit button
    Then verify that user is in the Create or edit a Customer page
    When user edit customer's information
    And user clicks on save button
    Then verify that success message for edit customer is displayed
    And close the webpage

#  Scenario: TC_04 With data table
#    Then verify that edit button is clickable
#    When user clicks on edit button
#    Then verify that user is in the Create or edit a Customer page
#    When user edit customer's information
#      | firstname | lastname | address |  state   |
#      | joker     | batman   | agawam  |  alabama |
#    And user clicks on save button
#    Then verify that success message for edit customer is displayed


  Scenario: TC_05 User can delete a customer, but seeing a message if the user is sure about deletion
    When user clicks on delete button
    Then verify that Confirm delete operation message is display
    When user clicks on delete button on the message page
    Then verify that success message for delete customer is displayed
    And close the webpage
