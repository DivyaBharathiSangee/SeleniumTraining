@Feature2
Feature: To validate the account creation of fb application
@Sanity
Scenario: To create new account
Given To launch the browser and maximize the window
When To launch the url of fb application
And To click the create new account button
#one dimentional map data
And To pass firstname in firstname text box
#key    value
|firstname1|divya|
|firstname2|sangee|
|firstname3|radha|
And To pass secondname in secondname text box
And To pass mobileno or email in email text box
And To create new password using new password text box
Then To close the chrome browser



