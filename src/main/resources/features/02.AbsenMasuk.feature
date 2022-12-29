Feature: Absen Admin Masuk
  Scenario: TCC.TMS.001 user invalid absen
    Given user on menu dashboard
    When User click Report Absen
    And User click absen masuk
    And user click branch
    And user select branch
    And user click unit
    And user select unit
    And user input start date
    And user input end date
    And User invalid report masuk
    Then user get alert no data

Scenario: TCC.TMS.002 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click position
    And user select position
    And user click unit
    And user select unit
    And user input start date
    And user input end date
    And User invalid report masuk
    Then user get alert no data

  Scenario: TCC.TMS.003 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click position
    And user select position
    And user click branch
    And user select branch
    And user input start date
    And user input end date
    And User invalid report masuk
    Then user get alert no data

  Scenario: TCC.TMS.004 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click position
    And user select position
    And user click branch
    And user select branch
    And user click unit
    And user select unit
    And user input end date
    And User invalid report masuk
    Then user get alert no data

  Scenario: TCC.TMS.005 user invalid absen
    When User click Report Absen
    And user click position
    And user select position
    And user click branch
    And user select branch
    And user click unit
    And user select unit
    And user input start date
    And User invalid report masuk
    Then user get alert no data

  Scenario: TCC.TMS.006 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click position
    And user select position
    And user click branch
    And user select branch
    And user click unit
    And user select unit
    And user invalid input start date
    And user invalid input end date
    And User invalid report masuk
    Then user get alert maximal date

  Scenario: TCC.TMS.001 user valid absen masuk
    When User click Report Absen
    And User click absen masuk
    And user click position
    And user select position
    And user click branch
    And user select branch
    And user click unit
    And user select unit
    And user input start date
    And user input end date
    Then User valid report masuk
