Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <country> and <club> and <language>
    Then user is redirect to country in a specific club
    And user's shopping cart is empty
    Examples:
      | country    | club      | language |
      | Costa Rica | Escazú    | Ingles   |
      | Costa Rica | Zapote    | Ingles   |
      | Costa Rica | Heredia   | Ingles   |
      | Costa Rica | Llorente  | Ingles   |
      | Costa Rica | Alajuela  | Ingles   |
      | Costa Rica | Tres Ríos | Ingles   |
      | Costa Rica | Santa Ana | Ingles   |
      | Costa Rica | Liberia   | Ingles   |
      | Costa Rica | Escazú    | Español  |
      | Costa Rica | Zapote    | Español  |
      | Costa Rica | Heredia   | Español  |
      | Costa Rica | Llorente  | Español  |
      | Costa Rica | Alajuela  | Español  |
      | Costa Rica | Tres Ríos | Español  |
      | Costa Rica | Santa Ana | Español  |
      | Costa Rica | Liberia   | Español  |

