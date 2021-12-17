Feature: create states

@StateCreation
Scenario Outline: create a state
  Given user sets the response using end point "https://www.gmibank.com/api/tp-states" and creates states using "<id>" and "<state>"
  Then validate status code is 201

  Examples: create state
    | id     | state         |
    | 123456 | Virginia      |
    | 137489 | Niedersachsen |
    | 126367 | Alaska        |





