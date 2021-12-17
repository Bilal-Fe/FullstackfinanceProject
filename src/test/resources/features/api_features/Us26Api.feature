@CountryUpdate
Feature: Update countries and validate them
  Scenario Outline: update a country and make validation
    Given user validate updated countries with end point "https://www.gmibank.com/api/tp-countries" and using "<id>" and "<countryName>"
    Examples:
      | id    |countryName  |
      | 24103 | Santa Clara |
      | 24104 | Cupertino   |
      | 24105 | San Jose    |
      | 24109 | Campbell    |

