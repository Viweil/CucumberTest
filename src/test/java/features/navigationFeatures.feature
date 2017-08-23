Feature: Check the page title

Scenario: Check page title for Products page
Given I am on the home page
When I navigate to "Products"
Then I check page title is "CRAZY HATS - Products"
And I close the browser

Scenario: Check page title for About page
Given I am on the home page
When I navigate to "About"
Then I check page title is "CRAZY HATS - About Us"
And I close the browser

Scenario: Check page title for Products page
Given I am on the home page
When I navigate to "Contact"
Then I check page title is "CRAZY HATS - Contact Us"
And I close the browser