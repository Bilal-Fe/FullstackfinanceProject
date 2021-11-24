@employee_sign_in

Feature: Employee_goes_to_gmibank_webpage_and_signIn_with_valid_credentials
  Scenario: Sign_in_the_gmibank_webpage
    Given user is on the gmi bank webpage
    When user clicks sign in button
    And user enters username of the employee
    And user enters password of the employee
    Then user clicks on sign in
    And user clicks on My Operations drop down menu
    And user selects Manage Customers
    And user clicks on Create a new Customer button
    Then verify Create or edit a Customer