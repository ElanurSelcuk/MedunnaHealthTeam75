Feature: Registrant api test


  @ApiRegistrant
  Scenario Outline: registrant test
    Given user sets the necessary path params
    And user sets the expected data "<firstname>" "<lastname>" "<SSN>" "<email>" "<username>" "<password>" and "<lan>"
    And user sends the Post request and gets the response
    When user saves the api records to correspondent files
    Then user validates api records

    Examples: api test
    |firstname|lastname|SSN        |email            |username   |password|lan    |
    |Kris     |Gilbert |429-32-9873|kris93@gmail.com |krisgilbert|123Elh. |english|

    Scenario: api get request

