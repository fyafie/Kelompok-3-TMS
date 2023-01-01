Feature: Absen Izin

Scenario: TCC07.Input kehadiran izin
When TCC07.Tampilan Izin
And TCC07.Submit
Then TCC07.User mendapatkan pemberitahuan

Scenario: TCC08.Input kehadiran izin
When TCC08.Upload foto selfie
And TCC08.Input Divisi
And TCC08.Input tipe Shift
And TCC08.Input Nama Shift
And TCC08.Input Tipe Absen
And TCC08.Isi keterangan
Then TCC08.Submit

Scenario: TCC09. Input kehadiran izin
When TCC09.Klik menu absen izin
Then TCC09. Muncul Alert