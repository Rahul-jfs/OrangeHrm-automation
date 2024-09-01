Feature: Apply Leave Functionality

  Scenario: Verify user can apply for the leave

    Given user opens website
    When user enters login credentials "username" and "password"
    And clicks on login button
    Then verify user is on home page
    When user clicks on leave menu option
    Then verify user is on leave page
    When user clicks on apply option
    Then verify apply leave page is displayed
    When user selects leave type
    And select from date "leave.fromDate" and to date "leave.toDate"
    And user selects partial days of type "partialDays.type"
    And selects duration type as "leaveDuration.type"
    And adds comment as "leave.comment"
    And clicks on apply button