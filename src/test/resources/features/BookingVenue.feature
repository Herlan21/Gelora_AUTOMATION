@Booking_1
Feature: Venue Booking
    Scenario: Booking single schedule
      Given user is launch the app
      And user click selanjutnya button
      And user click search form and then input text with "Gelora dashboard" and enter
      And user select venue, select date and timetable in the venue
      When user hit checkout button
      Then user is on payment details
