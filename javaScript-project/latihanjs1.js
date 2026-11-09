
// latihan if else
var trukBeroprasi = 6,
    jmlhTruk = 10;

for (noTruk = 1; noTruk <= jmlhTruk; noTruk++) {

    if (noTruk <= trukBeroprasi) {
        console.log("Truk no" + " " + noTruk + " " + "Beroprasi");
    } else if (noTruk === 8) {
        console.log("Truk no" + " " + noTruk
            + " " + "Sedang Lembur");
    } else {
        console.log("Truk no" + " " + noTruk
            + " " + "Tidak Beroprasi");
    }
}


