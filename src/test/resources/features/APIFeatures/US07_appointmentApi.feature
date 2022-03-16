@api_appointment
Feature: appointment api test
  Scenario Outline: appointment test
    Given user sets the necessary path params
    And user fills all the requested information "<firstName>", "<lastName>", "<ssn>" , "<email>" , "<phone>", "<startDate>"
    And user sends the POST request and gets the response
    When user save the api records to correspondent files
    Then user validates api records

    Examples: api apoointment data
    |firstName|lastName|ssn|email|phone|startDate|
    |Ayse     |Dagli   |458-15-8874|aysed@gmail.com |5478965421|2022-03-15|