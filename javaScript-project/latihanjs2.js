
// latihan if else
var trukBeroprasi = 3,
    jmlhTruk = 10,
    trukLmbr1 = 5,
    trukLmbr2 = 8;

for (noTruk = 1; noTruk <= jmlhTruk; noTruk++) {

    if (noTruk <= trukBeroprasi && noTruk !== trukLmbr1 && noTruk !== trukLmbr2) {
        console.log("Truk no" + " " + noTruk + " " + "Beroprasi");
    } else if (noTruk === trukLmbr1 || noTruk === trukLmbr2) {
        console.log("Truk no" + " " + noTruk
            + " " + "Sedang Lembur");
    } else {
        console.log("Truk no" + " " + noTruk
            + " " + "Tidak Beroprasi");
    }
}


