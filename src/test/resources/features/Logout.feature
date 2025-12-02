Feature: Verification of the logout functionality 

Scenario: Verify the applicatio behaviour when user clicks on logout link 
Given user is on HomePage
And user clicks on logout link
Then popup should be displayed with the text "You Have Succesfully Logged Out!!"

