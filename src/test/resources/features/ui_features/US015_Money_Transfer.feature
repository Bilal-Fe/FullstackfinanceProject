@money_transfer
Feature: As an customer money transfer
  Background:
    Given user is on the gmi bank application page
    And customer  clicks the Sign in button
    When customer  enters customer credentials
      | username       | password   |
      | cameliamueller | Camelia.30 |
    Then verify the My Operations is displayed
    And customer  selects My Operations dropdown

  @EndtoEndTest
  @SmokeTest
  Scenario: US015_TC001 customer should transfer money
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    And customer  selects one account on the from line
    And customer  selects one account on the to line
    And customer  enters the amount on the balance
    And customer  writes a description
    When customer  clicks Make Transfer button
    Then verify Transfer is succesfull message is displayed on the page
    Then close the application

  Scenario: US015_TC002 customer should not transfer money without selected one account on the "from" and "to" line
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    And customer does not select one account on the from line
    And customer does not select one account on the to line
    And customer  enters the amount on the balance
    And customer  writes a description
    When customer  clicks Make Transfer button
    Then verify the from and to line is red

  Scenario: US015_TC003 customer should not transfer money without selected one account on the "to" line
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    And customer  selects one account on the from line
    And customer does not select one account on the to line
    And customer  enters the amount on the balance
    And customer  writes a description
    When customer  clicks Make Transfer button
    Then verify the to line is red

  Scenario: US015_TC004 customer should not transfer money without entering the "balance"
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    And customer  selects one account on the from line
    And customer  selects one account on the to line
    And customer leaves balance empty
    And customer  writes a description
    When customer  clicks Make Transfer button
    Then verify This field is required. message is displayed on the page

  Scenario: US015_TC005 customer should not transfer money without entering the "description"
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    And customer  selects one account on the from line
    And customer  selects one account on the to line
    And customer  enters the amount on the balance
    And customer leaves Description empty
    When customer  clicks Make Transfer button
    Then verify This field is required. message is displayed on the page

  Scenario: US015_TC006 customer should not transfer more money than the amount in their account
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    And customer selects one account on the from line and enters the amount greater than the money in their account on the balance line
    And customer  selects one account on the to line
    And customer  writes a description
    When customer  clicks Make Transfer button
    Then verify translation-not-found[error.Balanceexceed] message is displayed on the page

  @EndtoEndTest
  @SmokeTest
  Scenario: US015_TC007 customer should see their transactions
    When customer selects My Accounts on the dropdown
    Then verify the Customer Accounts is displayed on the page
    And customer clicks View Transaction button
    Then verify the ID is displayed
    Then close the application