@TutorialsNinjaLogin
Feature: Login functionality of TutorialsNinja Application

@ValidCredentials 
Scenario: Login with valid credentials 
Given user navigates to LoginPage
And user enters valid email "suraiyaahmed@gmail.com"
And user enters valid password "Sura/2111"
When user clicks on login button
Then user is redirected to AccountPage
