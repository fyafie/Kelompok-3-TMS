package com.juaracoding.cucumber.utils;

public enum TestScenarios {

	T1("User go to invalid website"),
	T2("User go to website"),
	T3("User login null username and null password"),
	T4("User login null username and invalid password"),
	T5("User login null username and valid password"),
	T6("User login invalid username and null password"),
	T7("User login invalid username and invalid password"),
	T8("User login invalid username and valid password"),
	T9("User login valid username and null password"),
	T10("User login valid username and invalid password"),
	T11("User valid login"),
	T12("Add data parameter shifting invalid"),
	T13("Add data parameter shifting valid"),
	T14("Edit data parameter shifting valid"),
	T15("Delete data parameter shifting"),
	T16("Cancel delete data parameter shifting"),
	T17("Show 10 data parameter shifting"),
	T18("Show 25 data parameter shifting"),
	T19("Show 50 data parameter shifting"),
	T20("Show 100 data parameter shifting"),
	T21("Search data parameter shifting"),
	T22("Add data kerja penempatan invalid");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
