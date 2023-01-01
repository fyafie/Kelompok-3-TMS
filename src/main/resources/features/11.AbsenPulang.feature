Feature: Absen Pulang

	Scenario: TCC04.Input kehadiran pulang kerja
		When TCC04.Tampilan Pulang
		And TCC04.Submit
		Then TCC04.User mendapatkan pemberitahuan

	Scenario: TCC05.Input kehadiran pulang kerja
		When TCC05.Upload foto selfie
		And TCC05.Input Divisi
		And TCC05.Input tipe Shift
		And TCC05.Input Nama Shift
		And TCC05.Input Tipe Absen
		And TCC05.Isi keterangan
		Then TCC05.Submit

	Scenario: TCC06. Input kehadiran pulang kerja
		When TCC06.Klik menu absen pulang
		Then TCC06. Muncul Alert