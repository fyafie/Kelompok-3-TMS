Feature: Absen Sakit

Scenario: TCC10.Input kehadiran sakit
When TCC10.Tampilan Sakit
And TCC10.Submit
Then TCC10.User mendapatkan pemberitahuan

Scenario: TCC11.Input kehadiran sakit
When TCC11.Upload foto selfie
And TCC11.Input Divisi
And TCC11.Input tipe Shift
And TCC11.Input Nama Shift
And TCC11.Input Tipe Absen
And TCC11.Isi keterangan
Then TCC11.Submit

Scenario: TCC12. Input kehadiran sakit
When TCC12.Klik menu absen sakit
Then TCC12. Muncul Alert

Scenario: TCC13. Input kehadiran sakit
When TCC13.Klik menu absen sakit
Then TCC13. Muncul Alert