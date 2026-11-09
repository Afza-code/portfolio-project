import 'dart:io';

void main() {
  String nama;
  int umur;
  double berat;

  stdout.write("Nama :");
  nama = stdin.readLineSync() ?? '';

  stdout.write("Umur :");
  umur = int.parse(stdin.readLineSync() ?? '');

  stdout.write("Berat :");
  berat = double.parse(stdin.readLineSync() ?? '');

  print("\n ==== Output ====");
  print("Nama : $nama");
  print("Umur : $umur Tahun");
  print("Berat : $berat Kg");
  print("\n ==== Output ====");
  print(
    "Halo $nama selamat datang di data, kamu berumur $umur tahun, dan berat badan kammu $berat kg",
  );
}
