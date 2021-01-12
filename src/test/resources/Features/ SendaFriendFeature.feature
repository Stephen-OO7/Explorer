@sendtofriend
Feature:  Send a Friend feature.

Background: User is on The Automation practice url
Given user is logged in.

Scenario: User sends a link of product to his friend
When User selects category as Tshirt
Then User click on the product Faded Short Sleeve T-shirts 
Then User opens the product in detail view and Clicks on Send to a Friend Link.
Then User fills the details and clicks on send button
Then Confirmation msg should appear.

