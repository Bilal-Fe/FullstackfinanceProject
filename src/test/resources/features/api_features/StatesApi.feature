@AllStates
Feature: Read and delete states

#  Background: set all states to response
#    Given user sets all states to response using "https://www.gmibank.com/api/tp-states"

  Scenario: test all states
    Given user manipulates all states
    And user saves the states to correspondent files
    Then user validates all states

  Scenario Outline: delete states
    Given user deletes a states using endpoint "<endPoint>" and its extension "<id>"

    Examples: multiple states
      | endPoint                              | id      |
      | https://www.gmibank.com/api/tp-states | /103799 |

  @CreateState
  Scenario Outline: create a state
    Given user sets the response using end point "https://www.gmibank.com/api/tp-states" and creates states using "<idJson>" and "<nameJson>"

    Examples: create state
      | idJson | nameJson         |
      | 103786 | British Columbia |



  @UpdateState
  Scenario Outline: update a state
    Given user sets the response using api end point "https://www.gmibank.com/api/tp-states" and updates states using "<idJson>" and "<nameJson>"

    Examples: update state
      | idJson | nameJson |
      | 95197  | Virginia |
      | 103698 | Ontario  |

  Scenario Outline: delete more state
    Given user deletes a state using "<endPoint>" and "<id>"

    Examples: all data
      | endPoint                               | id    |
      | https://www.gmibank.com/api/tp-states/ | 95197 |
