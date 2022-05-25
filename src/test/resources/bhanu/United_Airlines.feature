@RUN
Feature: Book Flight Tickets from United Airlines

  @smoke
  Scenario: This scenario book flight ticket for "RoundTrip"

    When user open united Airlines home page
    And user selects book tab
    And user selects flight option
    And user selects Roundtrip
    And user selects from city
    And user selects To city
    And user selects from date and return date
    And user selects number of Adults
    And user selects the CabinType
    Then user clicks on find flights
    And Capture price details

  @regression
  Scenario: This test is to book tickets for "one way"

    When user open united Airlines home page
    And  user selects book tab
    And  user selects flight option
    And user selects one-way Radio button
    And user selects from city
    And user selects To city
    And user selects from date
    And user selects number of Adults
    And user selects the CabinType
    And user clicks on find flights


  @book
  Scenario: This tests "Book with Miles"

    When user open united Airlines home page
    And  user selects book tab
    And  user selects flight option
    And user selects one-way Radio button
    And user selects BookwithMiles checkbutton
    And user selects from city
    And user selects To city
    And user selects from date
    And user selects number of Adults
    And user selects the CabinType
    And user clicks on find flights


  Scenario: This tests Book with "Flexible Dates"

    When user open united Airlines home page
    And  user selects book tab
    And  user selects flight option
    And user selects one-way Radio button
    And user selects Flexibledates checkbutton
    And user selects from city
    And user selects To city
    And user selects from date
    And user selects number of Adults
    And user selects the CabinType
    And user clicks on find flights


  @hotel
  Scenario: This tests Book "Hotels"

    When user open united Airlines home page
    And  user selects book tab
    And  user selects Hotel Tab
    And user selects Going place
    Then user gives checkin and checkout date
    And selects No of Rooms required
#    Then user selects number of travellers
    And user checks BookwithMiles
    Then user clicks on find Hotels


  @cars
  Scenario: This tests Book "Cars"

    When user open united Airlines home page
    And  user selects book tab
    Then  user selects car Tab
    Then user selects pick-up location
    Then user selects pick and Drop dates
    And user provides pickup time
    And user provides drop time
    And click on find cars

  @package
  Scenario: This tests "Package Tab"
    When user open united Airlines home page
    And  user selects book tab
    Then user click on Package Tab
    And user selects FlightandHotel Package
    Then user gives Fromcity and Tocity
    And user provides Departdate and  ReturnDate
    Then user selects number of travellers under package
    And selects No of Rooms required under package
    Then user click on Find Trips button















