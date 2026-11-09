class Sensor {
  String lokasi;
  int aqi;
  String status = "belum";

  Sensor({required this.lokasi, required this.aqi});

  void analisis() {
    if (aqi <= 50) {
      status = "Bersih";
    } else {
      status = "Polusi";
    }
  }

  void cetak() {
    print("$lokasi | AQI : $aqi | $status");
  }
}

void main() {
  Sensor s1 = Sensor(lokasi: "Dago", aqi: 21);
  Sensor s2 = Sensor(lokasi: "Bubat", aqi: 56);
  Sensor s3 = Sensor(lokasi: "Bojong", aqi: 11);

  s1.analisis();
  s2.analisis();
  s3.analisis();

  print("\n === Data Index AQI ===");
  s1.cetak();
  s2.cetak();
  s3.cetak();
}
