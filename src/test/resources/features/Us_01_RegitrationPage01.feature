#1- Go to the https://www.medunna.com
#2-Click the account drop down icon.
#3- Click the Register button.
#4-Validate the Register page
#5-Click the SSN box
#6- Write the SSN.
  @registration_page_01
  Feature: registration_01
    Scenario:register_login_page
      Given user is on the login page
      And user clicks on login dropdown
      And user clicks on register button
      And user sends ssn
      And user sends firstname
      And user sends lastname


      @registration_page_ssn
      Scenario: registration_ssn
        Given user is on the login page
        And user clicks on login dropdown
        And user clicks on register button
        And user sends ssn

      @registration_page_firstname
      Scenario: registration_firstname
      Given user is on the login page
      And user clicks on login dropdown
      And user clicks on register button
      And user sends firstname

      @registration_page_lastname
      Scenario: registration_firstname
      Given user is on the login page
      And user clicks on login dropdown
      And user clicks on register button
      And user sends lastname





