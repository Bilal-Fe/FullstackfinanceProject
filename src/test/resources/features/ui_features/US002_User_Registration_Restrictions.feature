@user_registration
@registration_restrictions
  Feature: User Registration Restrictions
    Background: User enters registration page
      Given user is on the gmi bank application page
      And user clicks register button

    Scenario Outline: Invalid SSN
      When user enters invalid ssn "<ssn_number>"
      Then Verify SSN text box does not contain "<symbol>"
      And close the application
      Examples: Test data
      |ssn_number  |symbol|
      |345-@3-3423 |@     |
      |678a52312   |a     |

    Scenario Outline: Invalid phone number
      When user enters invalid phone number "<phone_number>"
      Then Verify Phone Number text box does not contain "<symbol>"
      And close the application
      Examples: Test data
        |phone_number |symbol|
        |718-*23-1234 |*     |
        |737349p678   |p     |

    Scenario Outline: Invalid email address
      When user enters invalid email address "<email>"
      And user clicks on register button
      Then verify invalid email address message is displayed
      And close the application
      Examples: Test Data
      |email             |
      |tomhanks-gmail.com|
      |tomhanks@gmailnet |

      Scenario: System should not let customer to register with blank SSN number
        When user enters first name "first_name"
        And user enters last name "last_name"
        And user enters address "address"
        And user enters phone number "phone number"
        And user enters username "username"
        And user enters email "email"
        And user enters password and confirm password "password"
        And user clicks on register button
        Then verify ssn is required message is displayed
        And close the application

    Scenario: System should not let customer to register with blank first name
      When user enters ssn "ssn"
      And user enters last name "last_name"
      And user enters address "address"
      And user enters phone number "phone number"
      And user enters username "username"
      And user enters email "email"
      And user enters password and confirm password "password"
      And user clicks on register button
      Then verify first name is required message is displayed
      And close the application

    Scenario: System should not let customer to register with blank last name
      When user enters ssn "ssn"
      And user enters first name "first_name"
      And user enters address "address"
      And user enters phone number "phone number"
      And user enters username "username"
      And user enters email "email"
      And user enters password and confirm password "password"
      And user clicks on register button
      Then verify last name is required message is displayed
      And close the application

    Scenario: System should not let customer to register with blank address
      When user enters ssn "ssn"
      And user enters first name "first_name"
      And user enters last name "last_name"
      And user enters phone number "phone number"
      And user enters username "username"
      And user enters email "email"
      And user enters password and confirm password "password"
      And user clicks on register button
      Then verify address is required message is displayed
      And close the application

    Scenario: System should not let customer to register with blank phone number
      When user enters ssn "ssn"
      And user enters first name "first_name"
      And user enters last name "last_name"
      And user enters address "address"
      And user enters username "username"
      And user enters email "email"
      And user enters password and confirm password "password"
      And user clicks on register button
      Then verify phone number is required message is displayed
      And close the application

    Scenario: System should not let customer to register with blank username
      When user enters ssn "ssn"
      And user enters first name "first_name"
      And user enters last name "last_name"
      And user enters address "address"
      And user enters phone number "phone_number"
      And user enters email "email"
      And user enters password and confirm password "password"
      And user clicks on register button
      Then verify username is required message is displayed
      And close the application

    Scenario: System should not let customer to register with blank email
      When user enters ssn "ssn"
      And user enters first name "first_name"
      And user enters last name "last_name"
      And user enters address "address"
      And user enters phone number "phone_number"
      And user enters username "username"
      And user enters password and confirm password "password"
      And user clicks on register button
      Then verify email is required message is displayed
      And close the application



