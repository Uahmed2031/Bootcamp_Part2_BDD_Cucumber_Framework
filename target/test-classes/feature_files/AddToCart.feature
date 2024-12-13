@TutorialsNinjaAddToCart
Feature: Add to cart functionality of TutorialsNinja Application

@ValidateAddToCart
Scenario: Add a valid product to the cart successfully
Given user navigates to LandingPage to add valid product
When user enters product search "HP" 
And user clicks on the search button
Then user gets valid product details display in the ProductPage
Then user clicks on valid product "HP LP3065"
And user clicks on add to cart button
Then user gets success message in the ProductPage