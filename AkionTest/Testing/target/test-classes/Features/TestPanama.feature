Feature: Test shopping cart works correctly
  Scenario Outline: Checks shopping cart don't have items when change locations
    Given browser is running
    And user go to priceSmart home page
    When user put <country> and <club> and <language>
    Then user is redirect to country in a specific club
    And user's shopping cart is empty
    Examples:
      | country | club                 | language |
      | Panamá  | Vía Brasil           | Ingles   |
      | Panamá  | El Dorado            | Ingles   |
      | Panamá  | David                | Ingles   |
      | Panamá  | Brisas               | Ingles   |
      | Panamá  | Costa Verde          | Ingles   |
      | Panamá  | Santiago de Veraguas | Ingles   |
      | Panamá  | Metro Park           | Ingles   |
      | Panamá  | Vía Brasil           | Español  |
      | Panamá  | El Dorado            | Español  |
      | Panamá  | David                | Español  |
      | Panamá  | Brisas               | Español  |
      | Panamá  | Costa Verde          | Español  |
      | Panamá  | Santiago de Veraguas | Español  |
      | Panamá  | Metro Park           | Español  |

