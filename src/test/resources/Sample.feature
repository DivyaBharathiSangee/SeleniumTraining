@Feature1
Feature: To validate the login functionality of the Facebook application

Background:
Given To launch the chrome browser and maxize window
@Regression
Scenario: To validate login with valid username and invalid password
When To launch the url of the facebook application
And To pass valid username in email field
And To pass invalis password in password field
And To click the login button
And To check whether navigate to home page or not
Then To close the browser

Scenario Outline: To validate positive and negative functions of login functionality
When User has to hit the facebook url
And User has to pass the data "<emaildatas>" in email field
And User has to pass the data "<passworddatas>" in password field
And User has to click login button
Then User has to close the browser

Examples:

|emaildatas                 |passworddatas|
|bharathisangee100@gmail.com|inmakes      |
|abc@gmail.com              |1233nm       |
|sangrr17@gmail.com         |78hhghgsh    |
|ftrtrtr@gmail.com          |bharathi100  |
|thenmozhi100@gmail.com     |bharthi200   |

