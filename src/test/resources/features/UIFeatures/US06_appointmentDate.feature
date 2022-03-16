@date
  Feature: appointment date feature
    Scenario: TC_001_user_enters_valid_date
      Given user goes to homepage
      And user clicks my pages dropdown
      And user selects Make an Appointment
      And user enters current date and verify
      Then user enters future date and verify

Scenario: TC_002_The_order_for_date_should_be_mm/day/year
  Given user enters the date
  Then verify the format of date



