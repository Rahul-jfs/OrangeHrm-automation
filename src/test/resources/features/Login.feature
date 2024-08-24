Feature: Login Functionality

  Scenario: verify user can login successfully

    Given user opens website
    When user enters login credentials "admin" and "admin123"
    And clicks on login button
    Then verify user is on home page

  Scenario Outline:verify user cannot login with invalid credentials
    Given user opens website
    When user enters login credentials "<username>" and "<password>"
    And clicks on login button
    Then verify error message is displayed
    Examples:
      | username | password  |
      | qwerty   | qwerty123 |
      | AdMIN    | ADMIN123  |
      | admIN    | adMIN123  |
