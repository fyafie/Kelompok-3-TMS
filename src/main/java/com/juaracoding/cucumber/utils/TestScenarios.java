package com.juaracoding.cucumber.utils;

public enum TestScenarios {
	//login
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
	
	//ReportAbsenMasukAdmin
    T13("TCC.TMS.001 user invalid absen"),
    T14("TCC.TMS.002 user invalid absen"),
    T15("TCC.TMS.003 user invalid absen"),
    T16("TCC.TMS.004 user invalid absen"),
    T17("TCC.TMS.005 user invalid absen"),
    T18("TCC.TMS.006 user invalid absen"),
    T19("TCC.TMS.007 user invalid absen"),
    T20("TCC.TMS.003 admin branch position spesifik"),
    T21("TCC.TMS.001 user valid absen masuk"),
    T22("TCC.TMS.002 admin search user"),

    //ReportAbsenPulangAdmin
    T23("TCC.TMS.001 user invalid absen pulang"),
    T24("TCC.TMS.002 user invalid absen pulang"),
    T25("TCC.TMS.003 user invalid absen pulang"),
    T26("TCC.TMS.004 user invalid absen pulang"),
    T27("TCC.TMS.005 user invalid absen pulang"),
    T28("TCC.TMS.006 user invalid absen pulang"),
    T29("TCC.TMS.007 user invalid absen pulang"),
    T30("TCC.TMS.001 user valid absen pulang"),
    T31("TCC.TMS.002 admin search user pulang"),
    T32("TCC.TMS.003 user valid absen pulang branch spesifik"),

    //ReportAbsenSakitAdmin
    T33 ("TCC.TMS.001 user invalid absen sakit"),
    T34("TCC.TMS.002 user invalid absen sakit"),
    T35("TCC.TMS.003 user invalid absen sakit"),
    T36("TCC.TMS.004 user invalid absen sakit"),
    T37("TCC.TMS.005 user invalid absen sakit"),
    T38("TCC.TMS.006 user invalid absen sakit"),
    T39("TCC.TMS.001 user valid absen sakit"),
    T40("TCC.TMS.002 admin search user sakit"),
    T41("TCC.TMS.003 user valid absen sakit branch spesifik"),
    T42("TCC.TMS.007 user invalid absen sakit"),

	//parameter shifting
	T43("Add data parameter shifting invalid"),
	T44("Add data parameter shifting valid"),
	T45("Cancel Add data parameter shifting"),
	T46("Edit data parameter shifting invalid"),
	T47("Edit data parameter shifting valid"),
	T48("Delete data parameter shifting"),
	T49("Cancel delete data parameter shifting"),
	T50("Show 10 data parameter shifting"),
	T51("Show 25 data parameter shifting"),
	T52("Show 50 data parameter shifting"),
	T53("Show 100 data parameter shifting"),
	T54("Search data parameter shifting"),
	
	//unit kerja penempatan
	T55("Add data kerja penempatan invalid"),
	T56("Add data kerja penempatan valid"),
	T57("Edit data kerja penempatan invalid"),
	T58("Edit data kerja penempatan valid"),
	T59("Cancel edit data kerja penempatan"),
	T60("Show 10 data kerja penempatan"),
	T61("Show 25 data kerja penempatan"),
	T62("Show 50 data kerja penempatan"),
	T63("Show 100 data kerja penempatan"),
	T64("Search data kerja penempatan"),
	
	//master position
	T65("Add data master position invalid"),
	T66("Add data master position valid"),
	T67("Edit data master position invalid"),
	T68("Edit data master position valid"),
	T69("Cancel edit data master position"),
	T70("Show 10 data kerja position"),
	T71("Show 25 data kerja position"),
	T72("Show 50 data kerja position"),
	T73("Show 100 data kerja position"),
	T74("Search data kerja position"),
	
	;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
