Feature: Searching

#  Scenario Outline: Searching by model as non-logged user
#    Given User is not logged in
#    When User select brand by <Brand>
#    And User select model by <Model>
#    And User click search button
#    Then Searching title should contains selected model and brand
#    And Ads titles should contain model and brand
#    Examples:
#      | Brand | Model |
#      | Audi  | A4    |
#      | BMW   | Z4    |
#      | Opel  | Astra |


    Scenario: Searching by price as non-logged user
      Given User is not logged in
      When User fill minimal price with 5000
      And User fill maximal price with 10000
      And User click search button