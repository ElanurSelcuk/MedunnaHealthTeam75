
  Feature: test all registrant data

    @UIRegistration
    Scenario Outline: test registration
      Given user provides ssn id "<SSN>"
      And user provides firstname and lastname "<firstname>" and "<lastname>"
      Then user creates username "<username>"
      And user provides also email "<email>"
      And user generates the password "<password>"
      And user registers and validates
      Then user creates the records to a correspondent file

      Examples:
      |SSN| firstname| lastname |username|email| password|
      |384-63-5829|Ayse|Gelir|aysegelir|ayse76@gmail.com|asdfA123.|







