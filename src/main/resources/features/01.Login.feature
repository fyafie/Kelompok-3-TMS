Feature: Login User

  Scenario: User login invalid username and invalid password
    When User go to Web SIT
  	And User enter username password invalid
  	And User click button login
  	Then User invalid credentials
  	
  Scenario: User valid login
    When User go to Web SIT
    And User enter username password valid
    And User click button login
    Then User valid credentials