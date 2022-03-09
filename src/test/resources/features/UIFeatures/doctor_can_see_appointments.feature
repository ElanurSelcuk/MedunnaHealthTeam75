@myappointments_check

  Feature: My_Appointments_Check_Doctor

    Background: user_signs_as_doctor
    Scenario Outline: user_signs_as_doctor
      Given user is on the Medunna Health Group home page
      And user clicks on the account drop down icon
      And user clicks the Sign in button
      And user provides the username as "<username>"
      And user provides the password as "<password>"
      And user clicks the Signin button
      Then user clicks on MY PAGES drop down
      And user clicks on My Appointments option

      Examples: credentials
      |username|password|
      |dr.lindson|Welcome123*|

    @check_appointment_list_and_date
    Scenario: TC01_appointments_list_and_time_is_available
      Then user verifies Appointments text on the page
      Given user clicks on Edit button
      And user verifies ID field is not empty
      Then user verifies StartDateTime field is not empty
      Then user verifies EndDateTime field is not empty

