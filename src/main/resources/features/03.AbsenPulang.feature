Feature: Absen Admin Pulang

  Scenario: TCC.TMS.008 user valid absen pulang
#    Given user on menu dashboard
    When User click Report Absen
    And User click absen pulang
    And user click position
    And user select position
    And user click branch
    And user select branch
    And user click unit
    And user select unit
    And user input start date
    And user input end date
    Then User valid report pulang