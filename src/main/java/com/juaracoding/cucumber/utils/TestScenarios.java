package com.juaracoding.cucumber.utils;

public enum TestScenarios {

//    T1("User invalid login"),
	T2("User login invalid username and invalid password"),
	T1("User valid login"),
    T3("TCC.TMS.001 user valid absen masuk"),
    T4("TCC.TMS.008 user valid absen pulang");
//    T4("TCC.TMS.008 user valid absen pulang");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
