class mahasiswa {
  String nama;
  int nim;
  String jurusan;

  mahasiswa(this.nama, this.nim, this.jurusan);

  void tampilData() {
    print("Nama : $nama");
    print("Nim : $nim");
    print("Jurusan : $jurusan");
  }
}

void main() {
  var m1 = mahasiswa("Budi", 707012500070, "SIKC");
  var m2 = mahasiswa("Andi", 707012500073, "SIKC");

  m1.tampilData();
  m2.tampilData();
}
