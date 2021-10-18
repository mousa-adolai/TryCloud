@practice
Feature: say hello to the world
  As a person,
  I should be able to say hi to the world.


  Background:
  Given smile

    @exploring
    Scenario Outline: I say hello to the world
      Then <name> says hello to the world
      Examples:
      |name|
      |Mousa|
      |Zorana|
      |Dilovarsho|
      |Danka     |
      |Rahel     |
      |Karina    |
      |Fabricio  |
      |Bojan     |
      |Edwin     |
      |Murat     |
      |Jassim    |
      |Mustafa   |
      |Aysel     |




