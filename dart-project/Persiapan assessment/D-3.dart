import 'dart:io';

void main() {
  stdout.write("Masukkan Angka :");
  int.tryParse(stdin.readLineSync() ?? '');
}
