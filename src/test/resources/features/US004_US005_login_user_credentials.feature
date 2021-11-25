@login_test
Feature: Login_Functionality_With_Right_Credentials

  @manager_login_test
  Scenario Outline: login_with_manager_credentials
    Given user access login page
    And user enters manager username "<manager_username>"
    And user enters manager password "<manager_password>"
    When user clicks on the login button
    Then verify the "<my_operations_button>" is displayed
    Then close the application

    Examples: manager_data
      | manager_username | manager_password | my_operations_button |
      | BugFightersMgr   | Bugfighters$1    | My Operations        |


  @admin_login_test
  Scenario Outline: login_with_admin_credentials

    Given user access login page
    And user enters admin username "<admin_username>"
    And user enters admin password "<admin_password>"
    When user clicks on the login button
    Then verify the "<administration_button>" is displayed
    Then close the application


    Examples: admin_data
      | admin_username   | admin_password | administration_button |
      | BugFightersAdmin | FatihGul1469.  | Administration        |

  @employee_login_test
  Scenario Outline: login_with_employee_credentials

    Given user access login page
    And user enters employee username "<employee_username>"
    And user enters employee password "<employee_password>"
    When user clicks on the login button
    Then verify the "<my_operations_button>" is displayed
    Then close the application


    Examples: employee_data
      | employee_username | employee_password | my_operations_button|
      | mary.jane         | Mary.Jane1+       | My Operations        |

  @customer_login_test
  Scenario Outline: login_with_customer_credentials

    Given user access login page
    And user enters customer username "<customer_username>"
    And user enters customer password "<customer_password>"
    When user clicks on the login button
    Then verify the "<my_operations_button>" is displayed
    Then user clicks on the myOperations button
    Then verify the "<my_accounts_button>" is displayed
    Then close the application


    Examples: customer_data
      | customer_username | customer_password | my_operations_button | my_accounts_button |
      | cameliamueller    | Camelia.30        | My Operations        |My Accounts         |
