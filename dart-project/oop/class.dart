class mahasiswa {
  int nim;
  String nama;

  mahasiswa(this.nama, this.nim);
}

void main() {
  var mhs1 = mahasiswa("Akmallutfi", 707012500064);
  var mhs2 = mahasiswa("Muhammad Rajudin", 707012500012);

  print("Mahasiswa 1 :${mhs1.nama}, NIM :${mhs1.nim}");
  print("Mahasiswa 2 :${mhs2.nama}, NIM :${mhs2.nim}");
}
