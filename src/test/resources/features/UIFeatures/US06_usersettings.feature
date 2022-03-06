@user_settings
  Feature: user settings feature
    
    Scenario: TC_0001_user_verify_info
      Given user goes to homepage
      And user clicks user dropdown
      And user clicks Settings
      Then verify the user info

      Scenario: TC_0002_options_of_user_info
        And user verify the update option for firstname
        And user verify the update option for lastname
        And user verify the update option for e-mail

        #Negative scenario:

        Scenario: TC_0003_usersettings_negative_scenario
          And user verify firstname should not be blank
          And user verify lastname should not be blank
          And user verify e-mail should not be created without @ sign and  .com extension



