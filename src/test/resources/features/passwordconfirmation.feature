
@password
Feature: passwordSegment feature

 @UIpassword_segment
 Scenario Outline: user should be able to renew password
#    //Given user is on the logIn page
  Given user clicks the logIn dropdown
  And user clicks on the signIn button
  And user provides the userName as "<userName>"
  And user provides the passWord as "<passWord>"
  And user clicks on the signInButton
  And user clicks on user segment
  And user clicks on Password
  And user provides the currentPassword as "<currentPassword>"
  And user provides the newPassword as "<newPassword>"
  And user provides the newPasswordConfirmation as "<newPasswordConfirmation>"
  Then user verifies password changed successfully
  Examples: user info
   |userName        |passWord |  currentPassword |newPassword|newPasswordConfirmation|
   |MedunnaAdmin   |1@qweASD  |     1@qweASD      |  LKmn14!         |     LKmn14!    |
