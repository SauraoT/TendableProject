Feature: Tendable Test

Scenario: Validation of top level menus
Given I am at homepage
Then Homepage is accesible
Then Our Story page is enable
Then Our Soltion is present
Then Why tendable is accessible

Scenario: Request a demo button is present and accessible
Given I am at homepage
When Click on request a demo button is accessible
Then on Top level menu page Request a demo is present
@check
Scenario: Ensure contact us section confirms error message
Given I am at homepage
When I click at Contact Us
And I clicked at Marketing
And I filled the form
Then On submitting it should display error message
