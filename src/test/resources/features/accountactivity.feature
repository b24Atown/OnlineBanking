Feature: Account Activity Features
  Background:
    Given User is on the login page
    And User logs in with username "username" and password "password"
    @wip
    Scenario: Account Dropdown options and transaction table testing
      And User navigates to "Account Activity" tab
      Then User should be able to see "Account Activity" page
      And Account dropdown should have "Savings" selected
      Then Account dropdown should have the following options
        | Savings     |
        | Checking    |
        | Savings              |
        | Loan        |
        | Credit Card |
        | Brokerage   |
      And Transactions table should have column names
        | Date        |
        | Description |
        | Deposit     |
        | Withdrawal  |