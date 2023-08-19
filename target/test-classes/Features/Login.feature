Feature: Application Login

Scenario: Home Page Default Login 

Given User is on Landing Page
When User Login into application with username and password
Then Home Page is Populated
And All the Cards are displayed