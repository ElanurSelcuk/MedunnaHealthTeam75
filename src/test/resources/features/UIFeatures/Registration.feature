Feature: test all registrant data


  @UIRegistration
  Scenario Outline: test registration
    Given user provides ssn id "<ssn>"
    And user provides firstname and lastname "<firstname>" and "<lastname>"
    Then user creates username "<username>"
    And user provides also email "<email>"
    And user generates the password "<password>"
    And user registers and validates
    Then user creates the records to a correspondent file

    Examples: test data
      |ssn|firstname|lastname|username|email|password|
      |884-37-3787|Irfan|Pishkin|Irfanpishkin|irfan@gmail.com|asdfA123.|