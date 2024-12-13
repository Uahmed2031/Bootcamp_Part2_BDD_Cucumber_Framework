@TutorialsNinjaRegister
Feature: Register functionality of TutorialsNinja Application
 
@AllFields
Scenario: Register with all fields
Given user navigates to RegisterPage
And user enters below mandatory fields 
|	firstname				| Suraiya 	 |
|	lastname				| Ahmed	     |
|	telephone				| 9876543210 |
| password 				|	Sura/2111	 |
| confirmpassword	| Sura/2111	 |
And user selects Yes for subscribe newsletter radiobutton
And user selects privacy policy checkbox
When user clicks on Continue button
Then user is re-directed to AccountSuccessPage


 