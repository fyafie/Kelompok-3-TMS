Feature: Absen Admin

  Scenario: TCC.TMS.001 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click position
    And user select position
    Then User invalid report masuk

  Scenario: TCC.TMS.002 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click branch
    And user select branch
    Then User invalid report masuk

  Scenario: TCC.TMS.003 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user click unit
    And user select unit
    Then User invalid report masuk

  Scenario: TCC.TMS.004 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user input start date
    Then User invalid report masuk

  Scenario: TCC.TMS.005 user invalid absen
    When User click Report Absen
    And User click absen masuk
    And user input end date
    Then User invalid report masuk

  Scenario: TCC.TMS.006 user invalid absen
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

  Scenario: TCC.TMS.007 user valid absen
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
