package com.juaracoding.cucumber.utils;

public enum TestScenarios {

	// Test Login
    T1("User login invalid username and invalid password"),
    T2("User valid login"),
    
    // Test Tambah Divisi
	T3("TCC.TMS.001 Admin menambahkan divisi baru"),
	T4("TCC.TMS.002 Admin tidak input nama divisi baru"),
	T5("TCC.TMS.003 Show Entries 10"),
	T6("TCC.TMS.004 Show Entries 25"),
	T7("TCC.TMS.005 Show Entries 50"),
	T8("TCC.TMS.006 Show Entries 100"),
	T9("TCC.TMS.007 Next Page"),
	T10("TCC.TMS.008 Nomor Page"),
	T11("TCC.TMS.009 Previous Page"),
	T12("TCC.TMS.010 Search Nama Divisi Ada"),
	T13("TCC.TMS.011 Search Nama Divisi Tidak Ada"),
	T14("TCC.TMS.012 Edit Division Name"),
	
	// Test Managemen Divisi
	T15("TCC.TMS.013 admin menambahkan managemen divisi baru"),
	T16("TCC.TMS.014 admin menambahkan managemen divisi baru dup"),
	T17("TCC.TMS.015 admin menambahkan managemen divisi baru tanpa memilih nama divisi"),
	T18("TCC.TMS.016 admin menambahkan managemen divisi baru tanpa mengisi nik team leader"),
	T19("TCC.TMS.017 admin menambahkan managemen divisi baru tanpa mengisi nama supervisor"),
	T20("TCC.TMS.018 Show Entries 10 md"),
	T21("TCC.TMS.019 Show Entries 25 md"),
	T22("TCC.TMS.020 Show Entries 50 md"),
	T23("TCC.TMS.021 Show Entries 100 md"),
	T24("TCC.TMS.022 Next Page md"),
	T25("TCC.TMS.023 Nomor Page md"),
	T26("TCC.TMS.024 Previous Page md"),
	T27("TCC.TMS.025 Search Nama Divisi Ada md"),
	T28("TCC.TMS.026 Search Nama Divisi Tidak Ada md"),
	T29("TCC.TMS.027 Edit Division Name md"),
	T30("TCC.TMS.028 Delete Division Name md");
	
    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
