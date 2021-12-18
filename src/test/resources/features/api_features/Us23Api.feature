@ReadRegistrants
Feature: Read registrants
  @EndtoEndTest
Scenario: read all registrants
Given user sets the registrants to response using "https://www.gmibank.com/api/tp-account-registrations"
And user saves the registrants to correspondent files
Then user validates the registrants