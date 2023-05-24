Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <country> and <club> and <language>
    Then user is redirect to country in a specific club
    And user's shopping cart is empty
    Examples:
      | country   | club          | language |
      | Guatemala | Aranda        | Ingles   |
      | Guatemala | Miraflores    | Ingles   |
      | Guatemala | Pradera       | Ingles   |
      | Guatemala | Fraijanes     | Ingles   |
      | Guatemala | San Cristóbal | Ingles   |
      | Guatemala | Aranda        | Español  |
      | Guatemala | Miraflores    | Español  |
      | Guatemala | Pradera       | Español  |
      | Guatemala | Fraijanes     | Español  |
      | Guatemala | San Cristóbal | Español  |

