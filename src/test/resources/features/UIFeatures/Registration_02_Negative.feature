Feature:test all registrant data

  @SmokeTest
    @UIRegistration
  Scenario Outline: test registration
    Then user creates username "<username>"
    And user provides also email "<email>"
    Examples:Test data
    |username  |email  |
    |aysegelir|ayse76@gmail.com|





    @UINegativeRegistration
    Scenario Outline:negative test
      Then user leaves username blank "<username>"
      And user creates an email without @ sign "<email>"
      And verifies your username is invalid
      And verifies your email is invalid


  Examples:
           |username    |   email              |
           |            |  ayse76gmail.com     |
           |            |    ayse76@gmail      |







