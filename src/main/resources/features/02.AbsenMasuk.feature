Feature: Absen Masuk

  Scenario: TCC01.Input kehadiran masuk kerja
    When TCC01.Tampilan Masuk
    And TCC01.Submit
		Then TCC01.User mendapatkan pemberitahuan
  
  Scenario: TCC02.Input kehadiran masuk kerja
   	When TCC02.Upload foto selfie
		And TCC02.Input Divisi
		And TCC02.Input tipe Shift
		And TCC02.Input Nama Shift
		And TCC02.Input Tipe Absen
		And TCC02.Isi keterangan
		Then TCC02.Submit
		
   Scenario: TCC03. Input kehadiran masuk kerja
		When TCC03.Klik menu absen pulang
		Then TCC03. Muncul Alert