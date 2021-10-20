@ui
Feature: Talks module
  Background:
    Given a user has logged in
    When the user clicks the talks module

  Scenario: A user can access the Talks module
    Then the user should be at the Talks module page

  Scenario: A user can send messages
    When the user searches for a "<user>" from the box on the top left
    And the user writes a message
    And the user clicks the send button
    Then the message should be displayed in the conversation log
