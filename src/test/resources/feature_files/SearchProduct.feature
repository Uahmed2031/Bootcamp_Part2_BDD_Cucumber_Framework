@TutorialsNinjaSearchProduct
Feature: Search product functionality of TutorialsNinja Application

@ValidProduct
Scenario: Search with a valid product
Given user navigates to LandingPage
When user enters valid product "HP"
And user clicks on search button
Then user gets valid product info display in the ProductPage

