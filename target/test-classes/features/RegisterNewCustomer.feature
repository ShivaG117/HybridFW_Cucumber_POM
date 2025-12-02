Feature: Verify the new customer registration 

Scenario: verification of New Customer Page with valid details 
Given when user is on New Customer Page
When user enters the data in the form from xlsx file
When user click on regester button
Then success message should be displayed as "Your registration completed"
