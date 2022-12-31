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
	T12("User valid logout"),
	T13("Add data parameter shifting invalid"),
	T14("Add data parameter shifting valid"),
	T15("Cancel Add data parameter shifting"),
	T16("Edit data parameter shifting invalid"),
	T17("Edit data parameter shifting valid"),
	T18("Delete data parameter shifting"),
	T19("Cancel delete data parameter shifting"),
	T20("Show 10 data parameter shifting"),
	T21("Show 25 data parameter shifting"),
	T22("Show 50 data parameter shifting"),
	T23("Show 100 data parameter shifting"),
	T24("Search data parameter shifting"),
	T25("Add data kerja penempatan invalid"),
	T26("Add data kerja penempatan valid"),
	T27("Edit data kerja penempatan invalid"),
	T28("Edit data kerja penempatan valid"),
	T29("Cancel edit data kerja penempatan"),
	T30("Show 10 data kerja penempatan"),
	T31("Show 25 data kerja penempatan"),
	T32("Show 50 data kerja penempatan"),
	T33("Show 100 data kerja penempatan"),
	T34("Search data kerja penempatan"),
	T35("Add data master position invalid"),
	T36("Add data master position valid"),
	T37("Edit data master position invalid"),
	T38("Edit data master position valid"),
	T39("Cancel edit data master position"),
	T40("Show 10 data kerja position"),
	T41("Show 25 data kerja position"),
	T42("Show 50 data kerja position"),
	T43("Show 100 data kerja position"),
	T44("Search data kerja position")
	;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
