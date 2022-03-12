Feature: Registrant api test


  @ApiRegistration
  Scenario Outline: registrant test
    Given user sets the necessary path params
    And user sets the expected data  "<username>" , "<email>"
    And user sends the POST request and gets the response
    When user saves the api records to correspondent files
    Then user validates api records

    Examples: api test data
        | username          |    email     |
        |     aysegelir     |aysegelir@gmail.com|
