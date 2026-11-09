class mahasiswa {
  int nim;
  String nama;
  double ipk = 0.0; // Menambahkan atribut baru dengan nilai default

  // Konstruktor
  mahasiswa(this.nama, this.nim);

  // 1. Fungsi pertama: Menampilkan perkenalan
  void perkenalan() {
    print("Halo, nama saya $nama dan NIM saya $nim.");
  }

  // 2. Fungsi kedua: Fungsi yang mengembalikan nilai (return)
  String ambilFakultas() {
    // Misalnya kita asumsikan NIM dengan awalan '7' adalah Teknik
    String awalan = nim.toString()[0]; 
    if (awalan == '7') {
      return "Fakultas Teknik";
    } else {
      return "Fakultas Lain";
    }
  }

  // 3. Fungsi ketiga: Fungsi yang menerima parameter
  void setIPK(double nilaiBaru) {
    if (nilaiBaru >= 0.0 && nilaiBaru <= 4.0) {
      ipk = nilaiBaru;
      print("IPK berhasil diubah menjadi $ipk");
    } else {
      print("Nilai IPK tidak valid!");
    }
  }
}

void main() {
  var mhs1 = mahasiswa("Akmallutfi", 707012500064);

  // Cara memanggil fungsi-fungsi tersebut:
  
  // Memanggil fungsi perkenalan
  mhs1.perkenalan(); 
  
  // Memanggil fungsi ambilFakultas dan menyimpan hasilnya ke variabel
  String fakultas = mhs1.ambilFakultas();
  print("Fakultas: $fakultas");
  
  // Memanggil fungsi dengan mengirimkan nilai parameter
  mhs1.setIPK(3.75); 
}
