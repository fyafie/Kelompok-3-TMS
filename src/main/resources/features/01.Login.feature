Feature: Login User

  Scenario: User login invalid username and invalid password
    When User go to Web SIT
  	And User enter valid username invalid password
  	And User click button login
  	Then User invalid credentials
  
  Scenario: User login invalid username and null password
    When User go to Web SIT
    And User enter invalid username null password
  	And User click button login
  	Then User get null alert
  	
  Scenario: User valid login
    When User go to Web SIT
    And User enter username password valid
    And User click button login
    Then User valid credentials
    