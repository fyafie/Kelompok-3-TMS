Feature: Kerja Penempatan

  Scenario: Add data kerja penempatan invalid
    When User click button submit add penempatan
    Then User get field null alert penempatan
    
  Scenario: Add data kerja penempatan valid
    When User enter unit kerja penempatan
    When User enter kode cabang pembayaran
    When User enter RCC pembayaran
    When User select status
    When User click button submit add penempatan
    Then User get alert success add penempatan
    
  Scenario: Edit data kerja penempatan invalid
    When User click grid button penempatan
    When User click edit button penempatan
    When User delete field penempatan
    When User click button update penempatan
    Then User get field edit null alert penempatan
    
  Scenario: Edit data kerja penempatan valid
    When User click grid button penempatan
    When User click edit button penempatan
    When User edit field penempatan
    When User click button update penempatan
    Then User get alert success update penempatan
  
  Scenario: Cancel edit data kerja penempatan
    When User click grid button penempatan
    When User click edit button penempatan
    When User click cancel button penempatan
    Then User back to kerja penempatan page
    
   Scenario: Show 10 data kerja penempatan
    When User click 10option penempatan
    Then User get 10data penempatan
    
   Scenario: Show 25 data kerja penempatan
    When User click 25option penempatan
    Then User get 25data penempatan
    
   Scenario: Show 50 data kerja penempatan
    When User click 50option penempatan
    Then User get 50data penempatan
    
   Scenario: Show 100 data kerja penempatan
    When User click 100option penempatan
    Then User get 100data penempatan
    
   Scenario: Search data kerja penempatan
    When User enter search keyword penempatan
    Then User get data penempatan
    

    