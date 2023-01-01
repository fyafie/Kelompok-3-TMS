Feature: Tambah Divisi

  Scenario: TCC.TMS.001 Admin menambahkan divisi baru
    When Admin input Nama Divisi
    And Admin click simpan
    Then Data berhasil disimpan

  Scenario: TCC.TMS.002 Admin tidak input nama divisi baru
    When Admin click simpan gagal
    Then Input divisi gagal dan ada pemberitahuan untuk input nama divisi
  
  Scenario: TCC.TMS.003 Show Entries 10
  	When admin choose show entries 10
  	
  Scenario: TCC.TMS.004 Show Entries 25
  	When admin choose show entries 25
  	
  Scenario: TCC.TMS.005 Show Entries 50
  	When admin choose show entries 50
  	
  Scenario: TCC.TMS.006 Show Entries 100
  	When admin choose show entries 100
  	
  Scenario: TCC.TMS.007 Next Page
  	When admin click next

  Scenario: TCC.TMS.008 Nomor Page
  	When admin click nomor page 2
    	
  Scenario: TCC.TMS.009 Previous Page
  	When admin click previous
  	
  Scenario: TCC.TMS.010 Search Nama Divisi Ada
  	When admin input nama divisi search ada
  	
  Scenario: TCC.TMS.011 Search Nama Divisi Tidak Ada
  	When admin input nama divisi search tidak ada
  	
  Scenario: TCC.TMS.012 Edit Division Name
  	When admin click button pencil edit
  	And admin edit nama divisi edit
  	And admin click update edit
  	Then data berhasil disimpan edit
  	