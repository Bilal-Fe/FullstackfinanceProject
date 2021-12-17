@Country
Feature: Read countries

  @CreateCountry
  Scenario Outline: create a country
    Given user sets the response using end point "https://www.gmibank.com/api/tp-countries" and creates country using "<idJson>" and "<nameJson>"
    Examples:
      | idJson | nameJson   |
      | name   | Ruwanda |
      | name   | Jurdan |

Scenario: read all countries
    Given user sets the countries to response using "https://www.gmibank.com/api/tp-countries"
    And user saves the countries to correspondent files
    Then user validates the countries
@DeleteCountry
  Scenario Outline: delete countries
    Given user deletes a country using endpoint "<endPoint>" and its extension "<id>"

    Examples: multiple countries
      | endPoint                                 | id      |
      | https://www.gmibank.com/api/tp-countries | /103799 |

    Scenario: read logs
      Given users sees all logs "https://www.gmibank.com/audits/?fromDate=200-11-10&toDate=2020-11-12"
