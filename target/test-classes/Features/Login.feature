Feature: Login Functionality

@bvt @bvtnew
Scenario Outline: To verify user is able to login to facebook

Given user navigates to facebook
When user entered "<username>" username
And user entered "<password>" password
And user click on SignIn button
Then user "<LoginType>" successfully LoggedIn

Examples:

| username | password | LoginType  |
| valid    | valid    |  should    |
| invalid  | invalid  |  shouldnot |





   