Feature: machine

  Background:
    Given The user enter to home
    And The user clicks to machine section

  Scenario: The user will register a machine
    Given The user clicks to registration section
    Then The machine was registered

  Scenario: The user will edit a machine
    Given The user clicks edit option in list of machines
    Then The machine was edited

  Scenario: The user will delete a machine
    Given The user clicks delete a machine in list of machines
    Then The machine was deleted