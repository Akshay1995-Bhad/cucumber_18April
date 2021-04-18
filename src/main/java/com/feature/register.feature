Feature: register a user on offline WebSite

Scenario: register test

Given user should be on login page for register
When user clicks on register link
And user fills all details
And click submit button 
Then user should see alert 