@login_test
Feature: Login_Functionality_With_Right_Credentials
  Background:
    Given user is on the main page
    And user clicks login button
    When user clicks sign in button
    Then access to login page


  @manager_login_test
  Scenario Outline: us004_tc001_login_with_manager_credentials
    Given user enters manager username "<manager_username>"
    And user enters manager password "<manager_password>"
    When user clicks sign in submit button
    Then verify the page is displayed
   Then click sign out back to main page

    Examples: manager_data
      | manager_username | manager_password |
      | BugFightersMgr   | Bugfighters$1    |


  @admin_login_test
  Scenario Outline: us004_tc002_login_with_admin_credentials
    Given user enters admin username "<admin_username>"
    And user enters admin password "<admin_password>"
    When user clicks on the sign in submit button
    Then verify the Administration is displayed
    Then click sign out back to main page


    Examples: admin_data
      | admin_username   | admin_password  |
      | BugFightersAdmin | FatihGul1469.  |



  @employee_login_test
  Scenario Outline: us004_tc003_login_with_employee_credentials
    Given user enters employee username "<employee_username>"
    And user enters employee password "<employee_password>"
    When user clicks on the sign in submit button
    Then verify the page is displayed
    Then click sign out back to main page


    Examples: employee_data
      | employee_username | employee_password |
      | mary.jane         | Mary.Jane1+       |

  @customer_login_test
  Scenario Outline: us004_tc004_login_with_customer_credentials
    Given user enters customer username "<customer_username>"
    And user enters customer password "<customer_password>"
    When user clicks on the sign in submit button
    Then verify the page is displayed
    Then user clicks on the myOperations button
    Then verify the My Accounts  is displayed
    Then click sign out back to main page


    Examples: customer_data
      | customer_username | customer_password |
      | cameliamueller    | Camelia.30        |

  Scenario: us004_tc005_click_cancel_button
    When user click cancel button
    Then verify that come back to main page
    And close the application

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
    Then verify that cannot login
    And click cancel back to main page


  Scenario: us005_tc005_can reset invalid password
    Given user can reset invalid password
    Then verify that can reset password
    And click cancel back to main page