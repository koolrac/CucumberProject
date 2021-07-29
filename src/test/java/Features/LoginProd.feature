Feature: Login Functionality to prod

Background:
        Given user navigates to facebook

@sanity
Scenario: To verify user is able to login to facebook

When user entered "valid" username
And user entered "valid" password
And user click on SignIn button
Then user "shouldbe" successfully LoggedIn

@smoke
Scenario: To verify user is not able to login to facebook

When user entered "invalid" username
And user entered "invalid" password
And user click on SignIn button
Then user "shouldnot" successfully LoggedIn
