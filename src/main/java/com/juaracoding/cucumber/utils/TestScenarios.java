package com.juaracoding.cucumber.utils;

public enum TestScenarios {

//    T1("User invalid login"),
	T1("User login invalid username and invalid password"),
	T2("User login invalid username and null password"),
	T3("User valid login");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
