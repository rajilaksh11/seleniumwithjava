

Feature: Login Feature

Scenario Outline: Successful Login
Given I navigate to the login page
When I enter valid email "<email>"  and password "<password>"  click login button
Then I should be logged in successfully

Examples:
| email                      | password    |
| demouser@gmail.com         | demo@123      |