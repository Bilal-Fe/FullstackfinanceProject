@DeleteStates
Feature:System should allow to delete states using api end point "https://www.gmibank.com/api/tp-states"
@EndtoEndTest
  Scenario Outline:User should delete states
    Given user sets the response using end point "<endPoint>" and creates states using "<CountryId>" and "<StateName>"
    And user deletes a state using "<endPoint>" and "<StateId>"
    Examples: create state
      | endPoint                               | CountryId | StateName        | StateId |
      | https://www.gmibank.com/api/tp-states/ | 103786    | 1st state of Canada | 1198115  |
