Feature: Login validation

Background:
Given when user is on login page

Scenario: Login validation with valid credentials
When user enters the userId "mngr26593"
And user enters the password "12!@"
And user clicks on Login button
Then page title should be "GTPL Bank Manager HomePage"

Scenario: Login validation with invalid credentials
When user enters the userId "mngr26593"
And user enters the password "1234"
And user clicks on Login button
Then new alert triggered and message should be "User is not valid"