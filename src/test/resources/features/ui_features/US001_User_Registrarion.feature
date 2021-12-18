@user_registration
@valid_user_registratio
Feature: Registration
  Background:
    Given user is on the gmi bank application page
    And user clicks register button


  @SmokeTest
    @EndtoEndTest
  Scenario Outline: us001_tc001_enter_valid_required_data
    When user enters ssn "<ssn_number>"
    And user enters first name "<first_name>"
    And user enters last name "<last_name>"
    And user enters address "<address>"
    And user enters phone number "<phone_number>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters password and confirm password "<password>"
    And user clicks on register button
    Then verify success_message is displayed
    And close the application
    Examples: test_data
      |ssn_number |first_name|last_name|address   |phone_number|username|email      |password |
      |777-45-3333|Cristiano |Ronaldo  |Manchester|777-777-7777|cri.ro  |cr7@aol.com|CriRo777$|

  Scenario: us001_tc002_enter_invalid_9_digits_phone_number
    When user enters all valid required data and invalid nine digits phone number
      |ssn         |first_name|last_name|address|phone_number|username |email     |password |
      |599-96-9999 |Lionel    |Messi    |Paris  |345-456-456 |leo.messi|lm@psj.com|Barca123$|
    Then verify invalid phone number message is displayed
    And close the application

  Scenario: us001_tc003_enter_invalid_11_digits_phone_number
    When user enter eleven digits phone number
    Then verify that only 10 digits are in Phone Number textbox
    And close the application

  Scenario: us001_tc004_enter_invalid_8_digits_ssn_number
    When user enters all valid required data and invalid eight digits ssn
      |ssn         |first_name|last_name|address|phone_number |username  |email     |password |
      |599-969-99  |Kylian    |Mbappe   |Paris  |345-456-4564 |kyl.mbappe|km@psj.com|Paris123$|
    Then verify invalid ssn number message is displayed
    And close the application

  Scenario: us001_tc005_enter_invalid_10_digits_ssn_number
    When user enter eleven digits ssn number
    Then verify that only nine digits are in SSN Number textbox
    And close the application

