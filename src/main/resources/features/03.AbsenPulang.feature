Feature: Absen Admin Pulang
  Scenario: TCC.TMS.001 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click branch
    And TCC.pulang user select branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user input start date
    And TCC.pulang user input end date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get alert no data

  Scenario: TCC.TMS.002 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user input start date
    And TCC.pulang user input end date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get alert no data

  Scenario: TCC.TMS.003 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click branch
    And TCC.pulang user select branch
    And TCC.pulang user input start date
    And TCC.pulang user input end date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get alert no data

  Scenario:  TCC.TMS.004 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click branch
    And TCC.pulang user select branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user input end date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get maximal date

  Scenario:  TCC.TMS.005 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click branch
    And TCC.pulang user select branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user input start date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get maximal date

  Scenario:  TCC.TMS.006 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click branch
    And TCC.pulang user select branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user invalid input start date
    And TCC.pulang user invalid input end date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get maximal date

  Scenario:  TCC.TMS.007 user invalid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click branch
    And TCC.pulang user select branch branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit unit
    And TCC.pulang user input start date
    And TCC.pulang user input end date
    And TCC.pulang User invalid report masuk
    Then TCC.pulang user get alert no data

  Scenario: TCC.TMS.001 user valid absen pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position
    And TCC.pulang user click branch
    And TCC.pulang user select branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user input start date
    And TCC.pulang user input end date
    Then TCC.pulang User valid report pulang

  Scenario: TCC.TMS.002 admin search user pulang
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And user input search pulang
    Then user get input pulang

  Scenario: TCC.TMS.003 user valid absen pulang branch spesifik
    When TCC.pulang User click Report Absen
    And TCC.pulang User click absen pulang
    And TCC.pulang user click position
    And TCC.pulang user select position position
    And TCC.pulang user click branch
    And TCC.pulang user select branch branch
    And TCC.pulang user click unit
    And TCC.pulang user select unit
    And TCC.pulang user input start date
    And TCC.pulang user input end date
    Then TCC.pulang User valid report pulang