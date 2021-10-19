Feature: As a user
  I should be able to access to Files module.

  Scenario: Verify users can access to file module
  Given Login as a User
  Then Verify the page tile is "Files-Trycloud

  Scenario: Verify users can select all the uploaded
    files from the package
  Given login as a user
  When Click the top  left checkBox of the table
  Then assert all files are selected




