Feature: Logout functionality
  Scenario: Verify user can logout
    Given user opens website
    When user enters login credentials "username" and "password"
    And clicks on login button
    Then verify user is on home page
    When user clicks on profile picture
    Then verify options are profile related options are displayed
    When user clicks on logout button
    Then verify user is on login page