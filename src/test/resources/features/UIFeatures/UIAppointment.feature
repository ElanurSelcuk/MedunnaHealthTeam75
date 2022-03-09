Feature:appointment test

  @Appointment
  Scenario Outline: test appointment
    Given user clicks on make an appointment
    And user provides the appointment name "<firstname>"
    And user provides the appointment lastname "<lastname>"
    And user provides ssn and email "<SSN>" and "<email>"
    When user provides the phone number "<phoneNumber>"
    And user provides the date "<date>"
    Then user requests appointment and verifies the success message

    Examples: test data
    |firstname |lastname |SSN |email | phoneNumber|date |
    |Cetin |Isilak | 203-38-2837 | cetin@gmail.com| 518-324-2390|05-06-2022|