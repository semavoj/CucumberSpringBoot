Feature: Stresstesting plants

  Scenario: Treating the plant well
    Given I have a plant
    When I water my plant with 2 liter
    And I fertilize it with 4 kg of fertilizer every week
    Then my plant grows

 Scenario: Not watering the plant enough
   Given I have a plant
   When I water my plant with 1 liter
   And I fertilize it with 2 kg of fertilizer every week
   Then my plant grows

 Scenario: Treating the plant
    Given I have a plant
    When I water my plant with <water> liter
    And I fertilize it with <fertilizer> kg of fertilizer every week
    Then my plant grows

      Examples:
        | water | fertilizer|
        |    2  |   4       |
        |    3  |   4       |
        |    1  |   2       |
        |    1  |   3       |