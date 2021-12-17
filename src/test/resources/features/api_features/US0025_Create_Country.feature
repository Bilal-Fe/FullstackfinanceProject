
  @US25gmibank
  Feature: Create new Country with api

    Scenario Outline: create a country and validate
      Given user sets the response using end point "https://www.gmibank.com/api/tp-countries" and creates country using "<countryId>" and "<name>"
    #  Then validates the country
      Examples:
        | countryId | name  |
        | id        | Japan |
        | id        | China |
