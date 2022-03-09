@doctor_login_scenario_outline
  Feature: doctor_login

    Scenario Outline: login_with_doctor_credentials
      Given user clicks on the login page
      And user clicks on login dropdown
      And user clicks on signin button
      And user sends username "<login>"
      And user sends password "<password>"
      And user clicks on the login button

      Examples: credentials
      | username    | password    |
      | Dr.lindson  | Welcome123* |


