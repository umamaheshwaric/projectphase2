Feature: a user should be able to login and enter otp

@uma
Scenario Outline: Login to Swiggy and check error message
Given a user is on swiggy home page
When he clicks on locate me
And he clicks on sign button
And he enters the mobile number "<mobile>"
And he clicks on login button
Then the error message should be displayed

Examples:
|mobile|		
|891944028|
|799500986|