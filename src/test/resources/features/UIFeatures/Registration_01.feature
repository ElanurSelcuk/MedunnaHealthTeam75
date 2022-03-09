Feature: test all registrant data

  @SmokeTest
    @UIRegistration
  Scenario Outline: test registration
    Given user provides ssn id "<SSN>"
    And  user provides firstname and lastname "<firstname>" and "<lastname>"
    Then user creates username "<username>"
    And user provides also email "<email>"
    And user generates the password "<password>"
    And user registers and validates
    Then user creates the records to a correspondent file
    Examples: test data
      |SSN|firstname|lastname|username|email|password|
      |483-12-3123|Maya|Mia|miamia|maya@gmail.com|asdfA123.|


  @UINegativeRegistration
    Scenario Outline: negative test registration
    Given user provides negative ssn id  "<SSN>"
    And user validates the ssn
    And user leaves firstname and lastname blank "<firstname>" and "<lastname>"
    Then user validates the firstname and lastname

    Examples:user info
      |SSN         |firstname|lastname|
      |384635829   |Anna     |McCarthy  |
      |384-636-5829|Anna     |McCarthy  |
      |384-63-582  |Anna     |McCarthy  |
      |356-98-2345 |         |          |




















