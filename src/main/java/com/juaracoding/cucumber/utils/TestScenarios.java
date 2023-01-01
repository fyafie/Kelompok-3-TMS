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
    
 // Test Tambah Divisi
 	T43("TCC.TMS.001 Admin menambahkan divisi baru"),
 	T44("TCC.TMS.002 Admin tidak input nama divisi baru"),
 	T45("TCC.TMS.003 Show Entries 10"),
 	T46("TCC.TMS.004 Show Entries 25"),
 	T47("TCC.TMS.005 Show Entries 50"),
 	T48("TCC.TMS.006 Show Entries 100"),
 	T49("TCC.TMS.007 Next Page"),
 	T50("TCC.TMS.008 Nomor Page"),
 	T51("TCC.TMS.009 Previous Page"),
 	T52("TCC.TMS.010 Search Nama Divisi Ada"),
 	T53("TCC.TMS.011 Search Nama Divisi Tidak Ada"),
 	T54("TCC.TMS.012 Edit Division Name"),
 	
 	// Test Managemen Divisi
 	T55("TCC.TMS.013 admin menambahkan managemen divisi baru"),
 	T56("TCC.TMS.014 admin menambahkan managemen divisi baru dup"),
 	T57("TCC.TMS.015 admin menambahkan managemen divisi baru tanpa memilih nama divisi"),
 	T58("TCC.TMS.016 admin menambahkan managemen divisi baru tanpa mengisi nik team leader"),
 	T59("TCC.TMS.017 admin menambahkan managemen divisi baru tanpa mengisi nama supervisor"),
 	T60("TCC.TMS.018 Show Entries 10 md"),
 	T61("TCC.TMS.019 Show Entries 25 md"),
 	T62("TCC.TMS.020 Show Entries 50 md"),
 	T63("TCC.TMS.021 Show Entries 100 md"),
 	T64("TCC.TMS.022 Next Page md"),
 	T65("TCC.TMS.023 Nomor Page md"),
 	T66("TCC.TMS.024 Previous Page md"),
 	T67("TCC.TMS.025 Search Nama Divisi Ada md"),
 	T68("TCC.TMS.026 Search Nama Divisi Tidak Ada md"),
 	T69("TCC.TMS.027 Edit Division Name md"),
 	T70("TCC.TMS.028 Delete Division Name md"),
 	
	//parameter shifting
	T71("Add data parameter shifting invalid"),
	T72("Add data parameter shifting valid"),
	T73("Cancel Add data parameter shifting"),
	T74("Edit data parameter shifting invalid"),
	T75("Edit data parameter shifting valid"),
	T76("Delete data parameter shifting"),
	T77("Cancel delete data parameter shifting"),
	T78("Show 10 data parameter shifting"),
	T79("Show 25 data parameter shifting"),
	T80("Show 50 data parameter shifting"),
	T81("Show 100 data parameter shifting"),
	T82("Search data parameter shifting"),
	
	//unit kerja penempatan
	T83("Add data kerja penempatan invalid"),
	T84("Add data kerja penempatan valid"),
	T85("Edit data kerja penempatan invalid"),
	T86("Edit data kerja penempatan valid"),
	T87("Cancel edit data kerja penempatan"),
	T88("Show 10 data kerja penempatan"),
	T89("Show 25 data kerja penempatan"),
	T90("Show 50 data kerja penempatan"),
	T91("Show 100 data kerja penempatan"),
	T92("Search data kerja penempatan"),
	
	//master position
	T93("Add data master position invalid"),
	T94("Add data master position valid"),
	T95("Edit data master position invalid"),
	T96("Edit data master position valid"),
	T97("Cancel edit data master position"),
	T98("Show 10 data kerja position"),
	T99("Show 25 data kerja position"),
	T100("Show 50 data kerja position"),
	T101("Show 100 data kerja position"),
	T102("Search data kerja position"),
	
	//T2("Absen Masuk"),
	T103("TCC01.Input kehadiran masuk kerja"),
	T104("TCC02.Input kehadiran masuk kerja"),
	T105("TCC03.Input kehadiran masuk kerja"),
	
	//T3("Absen Pulang"),
	T106("TCC04.Input kehadiran pulang kerja"),
	T107("TCC05.Input kehadiran pulang kerja"),
	T108("TCC06. Input kehadiran pulang kerja"),
	
	//T2("Absen Izin"),
	T109("TCC07.Input kehadiran izin"),
	T110("TCC08.Input kehadiran izin"),
	T111("TCC09. Input kehadiran izin"),
	
	//T2("Absen Sakit"),
	T112("TCC10.Input kehadiran sakit"),
	T113("TCC11.Input kehadiran sakit"),
	T114("TCC12. Input kehadiran sakit"),
	T115("TCC13. Input kehadiran sakit")
	;

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
