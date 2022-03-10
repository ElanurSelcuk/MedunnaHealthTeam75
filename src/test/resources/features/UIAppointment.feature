Feature: appointments test


  @Appointment
  Scenario Outline: test appointments
    Given user clicks on make an appointment
    And user provides the appoinment name "<firstname>"
    And user provides the appointment lastname "<lastname>"
    And user provides ssn and email "<SSN>" and "<email>"
    When user provides the phone number "<phoneNumber>"
    And user provides the date "<date>"
    Then user requests appointment and verifies the success message
    Examples: test data
      |firstname|lastname|SSN|email|phoneNumber|date|
      |Asli    |Unsal |203-38-2837|asli@gmail.com|259-283-2897|06-07-2022|