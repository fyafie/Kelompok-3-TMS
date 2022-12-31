Feature: Login User

  Scenario: User go to invalid website
    When User go to invalid Web SIT
    Then User invalid credentials website
    
  Scenario: User go to website
    When User go to Web SIT
    Then User valid credentials website
    
  Scenario: User login null username and null password
    When User go to Web SIT
    And User enter null username null password
    And User click button login
    Then User get null username alert
    
  Scenario: User login null username and invalid password
    When User go to Web SIT
    And User enter null username invalid password
    And User click button login
    Then User get null username alert
    
  Scenario: User login null username and valid password
    When User go to Web SIT
    And User enter null username valid password
    And User click button login
    Then User get null username alert
    
  Scenario: User login invalid username and null password
    When User go to Web SIT
    And User enter invalid username null password
  	And User click button login
  	Then User get null password alert
  	
  Scenario: User login invalid username and invalid password
    When User go to Web SIT
  	And User enter invalid username invalid password
  	And User click button login
  	Then User invalid credentials
  	
  Scenario: User login invalid username and valid password
    When User go to Web SIT
  	And User enter invalid username valid password
  	And User click button login
  	Then User invalid credentials
  
  Scenario: User login valid username and null password
    When User go to Web SIT
  	And User enter valid username null password
  	And User click button login
  	Then User get null password alert
  
  Scenario: User login valid username and invalid password
    When User go to Web SIT
  	And User enter valid username invalid password
  	And User click button login
  	Then User invalid credentials
  
  Scenario: User valid login
    When User go to Web SIT
    And User enter username password valid
    And User click button login
    Then User valid credentials
    
  Scenario: User valid logout
    When User click profile
    When User click logout button
    Then User back to login page
    