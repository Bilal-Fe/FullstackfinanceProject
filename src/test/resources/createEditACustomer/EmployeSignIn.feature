@employee_signIn
Feature: User_goes_to_gmibank_webpage_and_signIn_with_valid_credentials
  Scenario: User_goes_to_gmibank_webpage

    Given user is on the gmibank homepage
#    And user clicks on data icon
    And user selects "Sign in"
    When user enters username of the employee
    And user enters password of the employee
    And user clicks on sign in
#    And user clicks on "My Operations" drop down menu
#    And user selects "Manage Customers"
#    And user clicks on "Create a new Customer" button
#    Then verify "Create or edit a Customer"

