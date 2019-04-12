Feature: machine

  Background:
    Given The user enter to home
    And The user goes to machine section

  Scenario: The user will register a machine
    Given The user goes to registration section and register a machine
    Then The machine was registered

  Scenario: Edit a machine
    Given The user will edit a machine
    Then The machine was edited

  Scenario: The user will delete a machine
    Given The user will delete a machine
    Then The machine was deleted