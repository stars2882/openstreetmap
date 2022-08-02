Feature: Test from the task

  Scenario Outline: Check distance

    Given User opens home page is site
    And User click button find a route between two points
    And Enter the starting point in the field '<firstPoint>'
    And Enter the finishing point in the field '<secondPoint>'
    And In the drop-down list of transport options, select '<kindOfTransport>'
    And Click button Go
    Then We check that the distance is '<distance>' km.


    Examples:
      | firstPoint     | secondPoint | kindOfTransport  |distance|
      | Радищева, Київ | Кембридж    | Велосипед (OSRM) |2423km   |