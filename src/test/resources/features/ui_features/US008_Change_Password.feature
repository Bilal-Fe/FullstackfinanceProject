@change_password
  Feature: US008_Password_should_be_editable

    Background: Navigate _to_the_password_change_page
      Given user is on the application page
      And user clicks sign in button
      And user enters admin username
      And user enters admin password
      And user clicks sign in button in page
      And user clicks on the user name drop down
      And user clicks on password button
      And user enters admin current password

    Scenario: TC01_Password segment on Homepage should be editable with a new valid password
      And user enter a new valid password
      And user verifies the five bars for password strength
      And user reenters the new password
      Then user clicks on save button

    Scenario Outline: TC02,03,04_Password segment on Homepage should not be editable with a new invalid password.
      And user enter a new invalid "<password>" with one missing "<criteria>"
      And user verifies the three bars for password strength
      And user reenters the new password

      Examples:
      |criteria|password|
      |lowercase|GMI123456!|
      |uppercase|gmi123456!|
      |special  |Gmi123456 |


    Scenario: TC05_Password segment on Homepage should not be editable with a new invalid password.
      And user enters a new invalid password with six characters
      And user verifies the four bars for password strength
      And user reenters the new password


