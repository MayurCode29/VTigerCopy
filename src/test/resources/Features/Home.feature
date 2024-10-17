Feature:  Verify if element present on page
Scenario: Verify whether logout button is clickable
Given user is on Home page
When user clicks on logout button
Then user is should be navigated to login page
