
Feature: JBK Offline Application

Scenario: Login test

Given user should be on login page
When user enters uname and pass and click login button
Then user will be on home page 


Scenario: verify logo

Given user should be on login page for logo
Then user should see JBK logo