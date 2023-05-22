Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <Country> and <Club> and <Language>
    And user select club
    Then user is redirect another club
    And user shopping cart is empty
    Examples:
      | Language | Country    | Club      |
      | Ingles   | Costa Rica | Escazú    |
      | Ingles   | Costa Rica | Zapote    |
      | Ingles   | Costa Rica | Heredia   |
      | Ingles   | Costa Rica | Llorente  |
      | Ingles   | Costa Rica | Alajuela  |
      | Ingles   | Costa Rica | Tres Ríos |
      | Ingles   | Costa Rica | Santa Ana |
      | Ingles   | Costa Rica | Liberia   |
      | Español  | Costa Rica | Escazú    |
      | Español  | Costa Rica | Zapote    |
      | Español  | Costa Rica | Heredia   |
      | Español  | Costa Rica | Llorente  |
      | Español  | Costa Rica | Alajuela  |
      | Español  | Costa Rica | Tres Ríos |
      | Español  | Costa Rica | Santa Ana |
      | Español  | Costa Rica | Liberia   |
