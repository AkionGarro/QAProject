Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <country> and <club> and <language>
    Then user is redirect to country in a specific club
    And user's shopping cart is empty
    Examples:
      | country           | club          | language |
      | Trinidad y Tobago | Chaguanas     | Ingles   |
      | Trinidad y Tobago | Port of Spain | Ingles   |
      | Trinidad y Tobago | Mausica       | Ingles   |
      | Trinidad y Tobago | San Fernando  | Ingles   |
      | Trinidad y Tobago | Chaguanas     | Español  |
      | Trinidad y Tobago | Port of Spain | Español  |
      | Trinidad y Tobago | Mausica       | Español  |
      | Trinidad y Tobago | San Fernando  | Español  |

