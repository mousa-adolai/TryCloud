@ui @us
Feature: Talks module
  Background:
    Given a user has logged in
    When the user clicks the talks module

  Scenario: A user can access the Talks module
    Then the user should be at the Talks module page

  Scenario Outline: A user can send messages
    When the user searches for a "<user>" from the box on the top left
    And the user sends a message "<message>"
    Then the message should be displayed in the conversation log with "<message>"
    Examples:
      |   user      |   message                 |
      |   user94   |   This a trial message example 94  |
