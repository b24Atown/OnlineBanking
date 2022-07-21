Feature: Account Summary Tab Functionality

  Background: Loging in
    Given User is on the login page
    And User logs in with username "username" and password "password"

    @wip
    Scenario: Checking the account summary page features
      And User should be able to see "Account Summary" page
      Then Account summary page should have the following account types:
        | Cash Accounts       |
        | Investment Accounts |
        | Credit Accounts     |
        | Loan Accounts       |
      And Credit Accounts table must have columns:
        | Account     |
        | Credit Card |
        | Balance     |