Feature: Master Position

  Scenario: Add data master position invalid
    When User click button submit add position
    Then User get field null alert position
    
  Scenario: Add data master position valid
    When User enter jenis pekerjaan
    When User enter posisi
    When User enter standarisasi upah
    When User select status position
    When User click button submit add position
    Then User get alert success add position
  
  Scenario: Edit data master position invalid
    When User click grid button position
    When User click edit button position
    When User delete field position
    When User click button update position
    Then User get field edit null alert position
    
  Scenario: Edit data master position valid
    When User click grid button position
    When User click edit button position
    When User edit field position
    When User click button update position
    Then User get alert success update position
    
  Scenario: Cancel edit data master position
    When User click grid button position
    When User click edit button position
    When User click cancel button position
    Then User back to master position page
    
  Scenario: Show 10 data kerja position
    When User click 10option position
    Then User get 10data position
    
   Scenario: Show 25 data kerja position
    When User click 25option position
    Then User get 25data position
    
   Scenario: Show 50 data kerja position
    When User click 50option position
    Then User get 50data position
    
   Scenario: Show 100 data kerja position
    When User click 100option position
    Then User get 100data position
    
   Scenario: Search data kerja position
    When User enter search keyword position
    Then User get data position