Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact scenario

Given user is already on Login Page
When title of Login Page is CRM
Then user enters "<username>" and "<password>"
Then user clicks on Login button
Then user is on Home Page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser


Examples:
| username | password | firstname | lastname | position  |
| Sergii   | Test123  | Tom       | Peter    | Manager   |
| Sergii   | Test123  | John      | Smith    | Developer |