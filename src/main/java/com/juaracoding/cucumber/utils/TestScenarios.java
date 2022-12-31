package com.juaracoding.cucumber.utils;

public enum TestScenarios {

//    T1("User invalid login"),
    T1("User valid login"),
    T2("User login invalid username and invalid password"),

    //ReportAbsenMasukAdmin
    T3("TCC.TMS.001 user invalid absen"),
    T4("TCC.TMS.002 user invalid absen"),
    T5("TCC.TMS.003 user invalid absen"),
    T6("TCC.TMS.004 user invalid absen"),
    T7("TCC.TMS.005 user invalid absen"),
    T8("TCC.TMS.006 user invalid absen"),
    T31("TCC.TMS.007 user invalid absen"),
    T32("TCC.TMS.003 admin branch position spesifik"),
    T9("TCC.TMS.001 user valid absen masuk"),
    T24("TCC.TMS.002 admin search user"),

    //ReportAbsenPulangAdmin
    T10("TCC.TMS.001 user invalid absen pulang"),
    T11("TCC.TMS.002 user invalid absen pulang"),
    T12("TCC.TMS.003 user invalid absen pulang"),
    T13("TCC.TMS.004 user invalid absen pulang"),
    T14("TCC.TMS.005 user invalid absen pulang"),
    T15("TCC.TMS.006 user invalid absen pulang"),
    T29("TCC.TMS.007 user invalid absen pulang"),
    T16("TCC.TMS.001 user valid absen pulang"),
    T25("TCC.TMS.002 admin search user pulang"),
    T30("TCC.TMS.003 user valid absen pulang branch spesifik"),


    //ReportAbsenSakitAdmin
    T17 ("TCC.TMS.001 user invalid absen sakit"),
    T18("TCC.TMS.002 user invalid absen sakit"),
    T19("TCC.TMS.003 user invalid absen sakit"),
    T20("TCC.TMS.004 user invalid absen sakit"),
    T21("TCC.TMS.005 user invalid absen sakit"),
    T22("TCC.TMS.006 user invalid absen sakit"),
    T23("TCC.TMS.001 user valid absen sakit"),
    T26("TCC.TMS.002 admin search user sakit"),
    T27("TCC.TMS.003 user valid absen sakit branch spesifik"),
    T28("TCC.TMS.007 user invalid absen sakit");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
