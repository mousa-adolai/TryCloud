@ui @us1 @us
Feature: Login Functionality
  As a user,
  I should be able to log in

  Background:
    Given user goes to log in page

  Scenario: user successfully logs in with valid credentials
    When user logs in with valid credentials
    Then Verify user is on dashboard page


  Scenario: user successfully logs in with valid credentials
    When user logs in with invalid credentials
    Then “Wrong username or password.” message should be displayed
