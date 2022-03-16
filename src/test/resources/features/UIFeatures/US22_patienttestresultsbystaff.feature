@patient_test_results
  Feature: Patient Test Results by Staff
    Scenario: TC01_user can search about patient by SSN id
      Given user (staff) goes to homepage
      And user (staff) clicks user dropdown
      And user (staff) enters username and password
      And user (staff) clicks Sign in button
      And user(staff) clicks My Pages dropdown and select Search Patient
      And user(staff) enters Patient SSN and verify patient

      Scenario: TC02_edit patient tests
        And user clicks