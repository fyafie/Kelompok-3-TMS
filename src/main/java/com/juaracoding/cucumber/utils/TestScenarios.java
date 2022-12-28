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
    T9("TCC.TMS.001 user valid absen masuk"),

    //ReportAbsenPulangAdmin
    T10("TCC.TMS.001 user invalid absen pulang"),
    T11("TCC.TMS.002 user invalid absen pulang"),
    T12("TCC.TMS.003 user invalid absen pulang"),
    T13("TCC.TMS.004 user invalid absen pulang"),
    T14("TCC.TMS.005 user invalid absen pulang"),
    T15("TCC.TMS.006 user invalid absen pulang"),
    T16("TCC.TMS.001 user valid absen pulang");


//    T4("TCC.TMS.008 user valid absen pulang"),
//    T5("TCC.TMS.015 user valid absen sakit");

//    T4("TCC.TMS.008 user valid absen pulang");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
