@money_transfer
Feature:money transfer
  Background:
    Given user is on the gmi bank application page
    And customer  clicks the Sign in button
    When customer  enters customer credentials
      | username       | password   |
      | cameliamueller | Camelia.30 |
    Then verify the My Operations is displayed
    And customer  selects My Operations dropdown

  Scenario: US015_TC001_customer_transfer_money
    When customer  selects Transfer Money on the dropdown
    Then verify the TRANSFER BETWEEN YOUR ACCOUNTS is displayed on the page
    Then verify the all their account types is displayed on the from line
    Then verify the all their account types is displayed on the to line
    And customer  selects the one account on the from line
    And customer  selects the one account on the to line
    And customer  enters "the amount" on the balance
    And customer  writes a description
    When customer  clicks Make Transfer button
    Then verify Transfer is succesfull message is displayed on the page
    Then take the screenshot
    Then close the application