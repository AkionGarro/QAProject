Feature: Test login functionality
  Scenario Outline: Checks login is successful with right credentials
    Given browser is opened
    And user go to login page now
    When user put <username> and <password>
    And user click on login
    Then user is redirect to home page
    Examples:
      | username | password |
      | Akion    | 12345    |
      | Garro    | 12345     |
      | Carlos   | 12345   |
