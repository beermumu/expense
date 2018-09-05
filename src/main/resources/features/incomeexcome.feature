Feature: income and excome
    As a user
    I can add and view income and expense
    so that I know how much money I have.

    Scenario: Add Money
    Given a user no money in pocket = 0
    When I add money to 50.00
    Then My pocket have 50.00

    Scenario: Add Money with Minus
    Given a user no money in pocket
    When I add money to -50
    Then Show "Cannot add money with minus"

    Scenario: Get Money
    Given a user have 50.00 money in pocket
    When I get money to 50
    Then My pockey have 0.00

