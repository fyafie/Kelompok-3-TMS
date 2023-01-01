Feature: Managemen Divisi

  Scenario: TCC.TMS.013 admin menambahkan managemen divisi baru
    When admin click nama divisi
    And admin choose divisi
    And admin input nik team leader
    And admin input nama supervisor
    And admin input nama staff backup
    And admin click simpan
    Then data berhasil disimpan

  Scenario: TCC.TMS.014 admin menambahkan managemen divisi baru dup
    When admin click nama divisi dup
    And admin choose divisi dup
    And admin input nik team leader dup
    And admin input nama supervisor dup
    And admin input nama staff backup dup
    And admin click simpan dup
    Then data berhasil disimpan dup
    
  Scenario: TCC.TMS.015 admin menambahkan managemen divisi baru tanpa memilih nama divisi
    When admin input nik team leader nodiv
    And admin input nama supervisor nodiv
    And admin input nama staff backup nodiv
    And admin click simpan nodiv
    Then data berhasil disimpan nodiv
    
  Scenario: TCC.TMS.016 admin menambahkan managemen divisi baru tanpa mengisi nik team leader
    When admin click nama divisi nonik
    And admin choose divisi nonik
    And admin input nama supervisor nonik
    And admin input nama staff backup nonik
    And admin click simpan nonik
    Then input managemen divisi gagal nonik
    
  Scenario: TCC.TMS.017 admin menambahkan managemen divisi baru tanpa mengisi nama supervisor
    When admin click nama divisi nospv
    And admin choose divisi nospv
    And admin input nik team leader nospv
    And admin input nama staff backup nospv
    And admin click simpan nospv
    Then input managemen divisi gagal nospv
  
  Scenario: TCC.TMS.018 Show Entries 10 md
  	When admin choose show entries 10 md
  	
  Scenario: TCC.TMS.019 Show Entries 25 md
  	When admin choose show entries 25 md
  	
  Scenario: TCC.TMS.020 Show Entries 50 md
  	When admin choose show entries 50 md
  	
  Scenario: TCC.TMS.021 Show Entries 100 md
  	When admin choose show entries 100 md
  	
  Scenario: TCC.TMS.022 Next Page md
  	When admin click next md
	
  Scenario: TCC.TMS.023 Nomor Page md
  	When admin click nomor page 2 md
   	
  Scenario: TCC.TMS.024 Previous Page md
  	When admin click previous md
   
  Scenario: TCC.TMS.025 Search Nama Divisi Ada md
  	When admin input nama divisi search ada md
  	
  Scenario: TCC.TMS.026 Search Nama Divisi Tidak Ada md
  	When admin input nama divisi search tidak ada md
  	
  Scenario: TCC.TMS.027 Edit Division Name md
  	When admin click button pencil edit md
  	And admin edit nama supervisor edit md
  	And admin click simpan edit md
  	Then data berhasil disimpan edit md
  	
   Scenario: TCC.TMS.028 Delete Division Name md
  	When admin click button trash edit md
  	And are you sure edit md
  	Then data berhasil dihapus md