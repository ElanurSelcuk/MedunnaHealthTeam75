@myappointments_editAPI

Feature:My_Appoinments_Edit

  Background: user_signs_as_doctor
  Scenario Outline:user_sign_in_as_doctor
    Given user is on the Medunna Health Group home page
    And user clicks the account drop down icon
    And user clicks  the Signinbuttononaccount menu
    And user provides the Username as "<username>"
    And user provides the Password as "<password>"
    And user clicks the Sign in button
    And user clicks on the MY PAGES drop down
    And user clicks on My Appoinments option
    Examples: credentials
      |username|password|
      |Tara    |village2017|



  @edit_existing_appoinment
  Scenario: TC01_user_edit_existing_appoinment
    Then user verifies Appoinments text on the page
    Then user creates a new appoinment or clicks on Edit button

  @updating_an_appoinment
  Scenario: TC02_user_update_an_appoinment

    Then user verifies the Create or Edit an Appoinment text is visible on page

  @type_required_field
  Scenario: TC03_user_type_required_fields
    And user types a text to Anamanesis box
    And user types a text to Treatment box
    And user types a text to Diagnosis box

  @type_optional_field
  Scenario: TC04_user_type_optional_fields
    And user types a text to Prescription box is optional
    And user types a text to Description box is optional

  @select_status_option
  Scenario: TC05_user_select_status_option
    Then user clicks on Status Drop Down

