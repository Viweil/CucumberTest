Feature: Shopping cart

In order to purchase it later
As a customer
I want to add an item to my shopping cart


Scenario: Customer can add an item to shopping cart
Given I open the website "http://ec2-35-176-202-196.eu-west-2.compute.amazonaws.com/CrazyHatProject/"
And I login as "mocca" with "123"
When I click KIDS categories
And I click a hat image
And I am on the "Hat Detail" page
And I click "add to cart"
Then I should see the item in my shopping cart