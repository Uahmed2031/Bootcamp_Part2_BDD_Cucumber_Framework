@TutorialsNinjaLogout
Feature: Logout functionality of TutorialsNinja Application

@SuccessfulLogout
Scenario: User logout successfully
Given user navigates to the LoginPage  
And user enter the valid email "suraiyaahmed@gmail.com"
And user enter the valid password "Sura/2111"
When user clicks on the login button
Then user is redirected to the AccountPage
Then user clicks on Logout button
And user gets the message of Account Logout



