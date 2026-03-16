@Booking_1
Feature: Venue Booking
    Scenario: Booking single schedule
      Given user is launch Gelora app
      And user click selanjutnya and homepage button
      And user click search form and then input text with "Gelora Dashboard" and enter
      And user select venue, select date and timetable in the venue
      When user hit checkout button
      Then user is on payment details
