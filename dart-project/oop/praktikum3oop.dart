class mahasiswa {
  String? nama;
  int? nim;
  String? jurusan;

  void tampilData() {
    print("Nama : $nama");
    print("Nim : $nim");
    print("Jurusan : $jurusan");
  }
}

void main() {
  var m1 = mahasiswa();
  var m2 = mahasiswa();

  m1.nama = "Budi";
  m1.nim = 707012500070;
  m1.jurusan = "SIKC";

  m2.nama = "Budi";
  m2.nim = 707012500070;
  m2.jurusan = "SIKC";

  m1.tampilData();
  m2.tampilData();
}
