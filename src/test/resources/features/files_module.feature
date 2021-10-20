@ui @us6
Feature:  Files module

  Scenario Outline: As a user,
  I should be able to access
  to Files module

    Given user is at library login page
    When user use username "<email>" and passcode "<password>"
    And Click Files icon
    And Click the plus icon on top
#    And Click “New Folder”
 #   And Write a folder name
  #  And Click submit icon
    Then Verify the folder is displayed on the page
    Examples:
      | email   | password    |
      | User11  | Userpass123 |


