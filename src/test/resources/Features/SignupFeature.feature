@signup
Feature: Check if user is able to create a new account on the Application
Background: User is on the Automation practice url.
Given User is on "http://Automationpractice.com "

Scenario: Check if user is able to create a new account by filling all details in add new user details form.
When user clicks on sign in button on the homepage
When user enters "Beast@0007.com" in the create new account email id field.
Then user clicks on create an account button.
Then user fills all the details in the add new user details form
|FNamee|
|LNameel|
|pass1234|
|Mars|
|Kop|
|Florida|
|01234|
|United States|
|8888888818|
|My|
Then user clicks on register button
Then user should be navigated to the homepage of newly created account and then user loggs out.


Scenario: Check if user is able to login by newly created credentials
When user clicks on sign in button on the homepage
Then user enters "Beast@o0o8.com" in the Email id field
Then user enters "pass1234" in password field.
Then user clicks on sign in button.
Then user should be navigated to the homepage of newly created account






