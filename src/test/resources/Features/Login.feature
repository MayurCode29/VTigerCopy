Feature: Login functionality

Scenario: Valid Login
Given user should be on login page
When user enters valid credentials
Then user should be naviagate to home page
And user can click on logout page


Scenario: invalid Login
Given user should be on login page
When user enters invalid credentials
Then user should be naviagate to login page
And user can see the error message
