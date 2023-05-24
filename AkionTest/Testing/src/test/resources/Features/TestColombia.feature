Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <country> and <club> and <language>
    Then user is redirect to country in a specific club
    And user's shopping cart is empty
    Examples:
      | country  | club                        | language |
      | Colombia | Bucaramanga - Floridablanca | Ingles   |
      | Colombia | Barranquilla                | Ingles   |
      | Colombia | Cali Cañasgordas            | Ingles   |
      | Colombia | Cali Menga                  | Ingles   |
      | Colombia | Pereira                     | Ingles   |
      | Colombia | Bogotá Salitre              | Ingles   |
      | Colombia | Medellín                    | Ingles   |
      | Colombia | Chía                        | Ingles   |
      | Colombia | Bogotá Usaquén              | Ingles   |
      | Colombia | Bucaramanga - Floridablanca | Español  |
      | Colombia | Barranquilla                | Español  |
      | Colombia | Cali Cañasgordas            | Español  |
      | Colombia | Cali Menga                  | Español  |
      | Colombia | Pereira                     | Español  |
      | Colombia | Bogotá Salitre              | Español  |
      | Colombia | Medellín                    | Español  |
      | Colombia | Chía                        | Español  |
      | Colombia | Bogotá Usaquén              | Español  |

