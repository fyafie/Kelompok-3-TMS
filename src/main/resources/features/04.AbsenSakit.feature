Feature: Absen Admin Sakit

  Scenario: TCC.TMS.001 user invalid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.sakit user click branch
    And TCC.sakit user select branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input start date
    And TCC.sakit user input end date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert no data

  Scenario: TCC.TMS.002 user invalid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input start date
    And TCC.sakit user input end date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert no data

  Scenario: TCC.TMS.003 user invalid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click branch
    And TCC.sakit user select branch
    And TCC.sakit user input start date
    And TCC.sakit user input end date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert no data

  Scenario: TCC.TMS.004 user valid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click branch
    And TCC.sakit user select branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input end date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert maximal date


  Scenario: TCC.TMS.005 user invalid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click branch
    And TCC.sakit user select branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input start date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert maximal date


  Scenario: TCC.TMS.006 user invalid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click branch
    And TCC.sakit user select branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input invalid start date
    And TCC.sakit user input invalid end date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert maximal date

  Scenario: TCC.TMS.007 user invalid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click branch
    And TCC.sakit user select branch branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit unit
    And TCC.sakit user input start date
    And TCC.sakit user input end date
    And TCC.sakit user invalid report sakit
    Then TCC.sakit user get alert no data

  Scenario: TCC.TMS.001 user valid absen sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position
    And TCC.sakit user click branch
    And TCC.sakit user select branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input start date
    And TCC.sakit user input end date
    Then TCC.sakit User valid report sakit

  Scenario: TCC.TMS.002 admin search user sakit
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.sakit user input search
    Then TCC.sakit user get input

  Scenario: TCC.TMS.003 user valid absen sakit branch spesifik
    When TCC.sakit User click Report Absen
    And TCC.sakit User click absen sakit
    And TCC.pulang user click position
    And TCC.sakit user select position position
    And TCC.sakit user click branch
    And TCC.sakit user select branch branch
    And TCC.sakit user click unit
    And TCC.sakit user select unit
    And TCC.sakit user input start date
    And TCC.sakit user input end date
    Then TCC.sakit User valid report sakit
