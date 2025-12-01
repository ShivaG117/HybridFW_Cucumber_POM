Feature: Home Page feature

Scenario: Home Page Title verification
Given user is on HomePage
When user gets the HomePage title
Then HomePage title should be "GTPL Bank Home Page" 