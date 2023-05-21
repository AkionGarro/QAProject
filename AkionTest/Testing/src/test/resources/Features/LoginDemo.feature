Feature: Test login functionality
  Scenario: Checks login is successful with right credentials
    Given browser is opened
    And user go to login page now
    When user put username and password
    And user click on login
    Then user is redirect to home page
