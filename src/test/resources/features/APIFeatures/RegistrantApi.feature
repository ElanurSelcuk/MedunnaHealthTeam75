Feature: Registrant api test

  @ApiRegistration
  Scenario Outline: registrant test
    Given user sets the necessary path params
    And user sets the expected data "<firstname>", "<lastname>" "<SSN>" "<email>" "<username>" "<password>" and "<lan>"
    And user sends the POST request and gets the response
    When user saves the api records to correspondent files
    Then user validates api records

    Examples: api test data
      |firstname|lastname|SSN|email|username|password|lan|
      |Suna    |Suna  |546-88-2458|sune@gmail.com|sunasuna|sunana123.|en|




  @ApiRegistrant
  Scenario:  api get request for users

    Given user sends the get request for users data
    And user deserializes data to Java
    And user saves the users data to correspondent files


