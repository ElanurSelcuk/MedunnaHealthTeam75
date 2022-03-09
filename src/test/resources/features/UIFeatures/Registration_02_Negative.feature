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


  Examples:
           |username    |   email              |
           |            |  ayse76@gmail.com    |
           |aysegelir   |  ayse76gmail.com     |
           |aysegelir   |                      |
           |aysegelir   |  ayse76@gmail        |






