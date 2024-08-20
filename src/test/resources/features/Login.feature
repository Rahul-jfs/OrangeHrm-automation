Feature: Login Functionality

  Scenario: verify user can login successfully

    Given user opens website
    When user enters login credentials "username" and "password"
    And clicks on login button
    Then verify user is on home page