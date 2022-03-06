#1- Go to the https://www.medunna.com
#2-Click the account drop down icon.
#3- Click the Register button.
#4-Validate the Register page
#5-Click the SSN box
#6- Write the SSN.

  @registration_page_02
  Feature: registration_02
    Scenario: register_login_page
      Given user is on the login page
      And user clik on login dropdown
      And user clik on register button
      And user sends firstname
      And user sends lastname
      And user sends username
      And user send email
