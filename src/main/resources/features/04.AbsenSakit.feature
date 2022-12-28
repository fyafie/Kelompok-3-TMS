Feature: Absen Admin Sakit

  Scenario: TCC.TMS.015 user valid absen sakit
#    Given user on menu dashboard
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