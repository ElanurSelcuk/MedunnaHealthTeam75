@myappoinments_edit_test_results

Feature:My_Appoinments_edit_test_results

  Background: user_signs_as_doctor
  Scenario Outline: user_signinas_doctor
    Given user is on the Medunna Health Group home page
    And user clicks the account drop down icon
    And user clicks  the Signinbuttononaccount menu
    And user provides the username as "<username>"
    And user provides the password as "<password>"
    And user clicks the Sign in button
    And user clicks on the MY PAGES drop down
    And user clicks on My Appoinments option

    Examples:
      |username|password|
      |Tara    |village2017|

  @user_can_see_test_items
  Scenario: TC01_user_can_see_test_items
    Then user creates a new appoinment or clicks on Edit button
    And user clicks Show test results button
    And user clicks View Results button
    And user verifies Test Results text on page

  @user_request_inpatient
  Scenario: TC02_user_request_inpatient
    #Then user clicks on Request Inpatient button
