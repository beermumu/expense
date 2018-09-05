Feature: get income and excome history
    As a user
    I can add and view income and expense
    so that I know how much money I have.

Scenario: Get income history
    Given a user have [50.00 , 40.00] in income history
    When I want to see income history
    Then Show "[50.00 , 40.00]"

Scenario: Get excome history
    Given a user have [30.00] in excome history
    When I want to see excome history
    Then Show "[30.00]"
