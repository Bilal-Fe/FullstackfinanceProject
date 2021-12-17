@DeleteStates
Feature:System should allow to delete states using api end point "https://www.gmibank.com/api/tp-states"

  Scenario Outline:User should delete states
    Given create a state from endpoint <"endpoint"> and country id <"countryid">
    And delete state using endpoint <"endpoint"> and state id <"stateid">
    Then verify that state deleted

    Examples:
      | end_point                             | countryid | stateid |
      | https://www.gmibank.com/api/tp-states |           | 119120  |