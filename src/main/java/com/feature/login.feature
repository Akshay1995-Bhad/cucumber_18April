@data
Feature: JBK Offline Application

Scenario Outline: Login test

Given user should launch "file:///C:/Users/Akshay/Downloads/software/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html"
When user enters "<uname>" and "<pass>" and click login button
Then user will verify home page title


Examples:
|  uname          |  pass   |
|kiran@gmail.com  |  123456 |
|mangesh@gmail.com|fdjhbbfd |
|akshay@gmail.com |hdfdhfdhf|