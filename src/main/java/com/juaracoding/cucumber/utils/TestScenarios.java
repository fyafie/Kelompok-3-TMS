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
	T14("Cancel Add data parameter shifting"),
	T15("Edit data parameter shifting invalid"),
	T16("Edit data parameter shifting valid"),
	T17("Delete data parameter shifting"),
	T18("Cancel delete data parameter shifting"),
	T19("Show 10 data parameter shifting"),
	T20("Show 25 data parameter shifting"),
	T21("Show 50 data parameter shifting"),
	T22("Show 100 data parameter shifting"),
	T23("Search data parameter shifting"),
	T24("Add data kerja penempatan invalid"),
	T25("Add data kerja penempatan valid"),
	T26("Edit data kerja penempatan invalid"),
	T27("Edit data kerja penempatan valid"),
	T28("Cancel edit data kerja penempatan"),
	T29("Show 10 data kerja penempatan"),
	T30("Show 25 data kerja penempatan"),
	T31("Show 50 data kerja penempatan"),
	T32("Show 100 data kerja penempatan"),
	T33("Search data kerja penempatan"),
	T34("Add data master position invalid"),
	T35("Add data master position valid"),
	T36("Edit data master position invalid"),
	T37("Edit data master position valid"),
	T38("Cancel edit data master position"),
	T39("Show 10 data kerja position"),
	T40("Show 25 data kerja position"),
	T41("Show 50 data kerja position"),
	T42("Show 100 data kerja position"),
	T43("Search data kerja position");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
