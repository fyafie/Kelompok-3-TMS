package com.juaracoding.cucumber.utils;

public enum TestScenarios {

//    T1("User invalid login"),
	T2("User login invalid username and invalid password"),
	T1("User valid login"),
	
//	T2("Absen Masuk"),
	T5("TCC01.Input kehadiran masuk kerja"),
	T4("TCC02.Input kehadiran masuk kerja"),
	T3("TCC03.Input kehadiran masuk kerja"),
	
//	T3("Absen Pulang"),
	T8("TCC01.Input kehadiran pulang kerja"),
	T7("TCC02.Input kehadiran pulang kerja"),
	T6("TCC03.Input kehadiran pulang kerja"),
	
//	T2("Absen Izin"),
	T11("TCC01.Input kehadiran izin kerja"),
	T10("TCC02.Input kehadiran izin kerja"),
	T9("TCC03.Input kehadiran izin kerja"),
	
//	T2("Absen Sakit"),
	T14("TCC01.Input kehadiran sakit kerja"),
	T13("TCC02.Input kehadiran sakit kerja"),
	T12("TCC03.Input kehadiran sakit kerja");
	
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
