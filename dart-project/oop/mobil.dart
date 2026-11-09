class mobil {
  String merk;
  String warna;
  int kecepatan;

  mobil(this.merk, this.warna, this.kecepatan);

  void jalan() {
    print("mobil $merk melaju dengan kecepatan $kecepatan km/jam");
  }

  void ubahKecepatan() {
  int k = kecepatan;
    if (k < 0) {
      print("Mobil $merk tidak dapat berjalan");
    }
  }

  void berhenti() {
    int k = kecepatan;
    if (k == 0) {
      print("Mobil $merk berhenti");
    }
  }
}

void main() {
  var m1 = mobil("Toyota", "biru", 12);
  var m2 = mobil("daihatsu", "hitam", 0);

  m1.jalan();
  m2.jalan();
  m1.ubahKecepatan();
  m2.ubahKecepatan();
  m1.berhenti();
  m2.berhenti();
}
