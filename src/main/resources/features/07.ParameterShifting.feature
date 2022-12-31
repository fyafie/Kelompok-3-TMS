Feature: Parameter Shifting

  Scenario: Add data parameter shifting invalid
    When User click button add shifting
    When User click button submit shifting
    Then User get field null alert shifting
    
  Scenario: Add data parameter shifting valid
    When User click button add shifting
    When User select unit
    When User enter nama shift
    When User enter jam mulai
    When User enter jam selesai
    When User click button submit shifting
    Then User get success alert shifting
  
  Scenario: Cancel Add data parameter shifting
    When User click button add shifting
    When User click button back shifting
    Then User back to parameter shifting page
  
  Scenario: Edit data parameter shifting invalid
    When User click grid button shifting
    When User click edit button shifting
    When User delete field shifting
    When User click button submit shifting
    Then User get field edit null alert shifting

  Scenario: Edit data parameter shifting valid
    When User click grid button shifting
    When User click edit button shifting
    When User edit field shifting
    When User click button submit shifting
    Then User get success alert shifting
    
  Scenario: Delete data parameter shifting
    When User click grid button shifting
    When User click delete button shifting
    When User click ok shifting
    Then User get success alert shifting
    
  Scenario: Cancel delete data parameter shifting
    When User click grid button shifting
    When User click delete button shifting
    Then User click cancel shifting
    
  Scenario: Show 10 data parameter shifting
    When User click 10option shifting
    Then User get 10data shifting
    
  Scenario: Show 25 data parameter shifting
    When User click 25option shifting
    Then User get 25data shifting
    
  Scenario: Show 50 data parameter shifting
    When User click 50option shifting
    Then User get 50data shifting
    
  Scenario: Show 100 data parameter shifting
    When User click 100option shifting
    Then User get 100data shifting
    
  Scenario: Search data parameter shifting
    When User enter search keyword shifting
    Then User get data shifting