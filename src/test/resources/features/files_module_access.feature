Feature: As a user,
  I should be able to access to Files module.

    Scenario: verify users can change the app Settings

    Given Login as a user "User10" and passcode "Userpass123"
    And Click Settings on the left bottom corner
    Then Verify user can click any buttons