@smoke
Feature: online banking login feature
  Agile Story:Authorized user should be able to login so that they can do online banking
  @pos
  Scenario: Only authorized users should be able to login to the application
    Given User is on the login page
    And User logs in with username "username" and password "password"
    Then User should be able to see "Account Summary" page
  @neg
  Scenario: Unauthorized users should not be able to login to the application
    Given User is on the login page
    And User logs in with username "wrong" and password "wrong"
    Then User should see "Login and/or password are wrong." message
    And User logs in with username "" and password ""
    Then User should see "Login and/or password are wrong." message