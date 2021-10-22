@ui @us10 @us
Feature: As a user,
  I should be able to access to Files module.

  Background:
    Given Login as a user "username1" and passcode "password"
    Then Click on file

  Scenario: verify users can change the app Settings
    And Click Settings on the left bottom corner
    Then Verify user can click any buttons

  Scenario: verify users see the app storage usage
   When Check the current storage usage
   Then Upload a file
   And Refresh the page
   Then Verify the storage usage is increased