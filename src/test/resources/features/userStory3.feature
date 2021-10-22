@ui @us3
Feature: As a user
  I should be able to access to Files module.

  Scenario: Verify users can access to file module
  Given Login as a User
   When Click the file module Btn
  Then Verify the page tile is "Files - Trycloud QA"

  Scenario: Verify users can select all the uploaded
    files from the package
  Given Login as a User
  When Click the file module Btn
  And Click the top  left checkBox of the table
  Then assert all files are selected




