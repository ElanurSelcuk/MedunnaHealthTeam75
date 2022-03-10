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
            |384-48-3838|Selane|Selen|selena|selena@gmail.com|asdfghA12!|

    @Password_Strength_Check
    Scenario Outline: test password strength
        Given user is on registration page
        And user provides the password "<password>"
        Then user validates the password strength "<strength>"
        Examples: test data
            |password  |strength|
            |asdfgkdjs |1     |
            |qwertyU   |2     |
            |123456a   |2     |
            |asdfgh1   |2     |
            |zxcvbn?   |2     |
            |zxcvbn@   |2     |
            |asdhgsag?1|3     |
            |asdfA1@   |4     |
            |asdfA1!   |4     |








