@ui @test
Feature: Test added functionality here
  # This feature tests if added functionalities work as expected to avoid bugs and conflicts

  Scenario Outline: Navigation
    Given user goes to log in page
    When user logs in with valid credentials
    And user clicks on "<nav>"
    Then user should be on the "<nav>" page
    Examples:
      |   nav       |
      |   files     |
      |   dashboard |
      |   photos    |
      |   talk      |
      |   contacts  |