Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <country> and <club> and <language>
    Then user is redirect to country in a specific club
    And user's shopping cart is empty
    Examples:
      | country              | club         | language |
      | Republica Dominicana | Los Prados   | Ingles   |
      | Republica Dominicana | Santiago     | Ingles   |
      | Republica Dominicana | Arroyo Hondo | Ingles   |
      | Republica Dominicana | San Isidro   | Ingles   |
      | Republica Dominicana | Bolívar      | Ingles   |
      | Republica Dominicana | Los Prados   | Español  |
      | Republica Dominicana | Santiago     | Español  |
      | Republica Dominicana | Arroyo Hondo | Español  |
      | Republica Dominicana | San Isidro   | Español  |
      | Republica Dominicana | Bolívar      | Español  |

