@login_test
Feature: Login_Functionality_With_Right_Credentials
  Background:
    Given user is on the main page
    When user clicks sign in button
    Then access to login page

  #Negative test senarios

  Scenario: us005_tc001_enter_invalid_username
    Given user enter invalid username and valid password
      | user_username | user_password |
      | camelia       | Camelia.30    |
    Then verify that cannot login
    And click cancel back to main page

  Scenario: us005_tc002_enter_invalid_password
    Given user enter  valid name and invalid password
      | user_username | user_password |
      | mary.jane     | Mary.Jane  |
    Then verify that cannot login
    And click cancel back to main page

  Scenario: us005_tc003_enter_invalid_username_and_password
    Given user enter invalid username and password
      | user_username | user_password |
      | BarackObama   | Michelle      |
    Then verify that cannot login
    And click cancel back to main page


  Scenario: us005_tc004_can access to registration page from login page
    Given user can access to registration page
    Then verify that registration page
    And click back to main page


  Scenario: us005_tc005_can reset invalid password
    Given user can reset invalid password
    Then verify that can reset password
    And click back to main page
    And close the webpage