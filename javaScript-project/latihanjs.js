// pakai while
// var nomorAngkot = 1,
//     jumlahAngkot = prompt('Masukkan jumlah angkot saat ini :');

// while (nomorAngkot <= jumlahAngkot) {
//     console.log('Angkot No.' + nomorAngkot + ' ' + 'Beroprasi dengan baik.');
//     nomorAngkot++;

// }
// confirm('Jumlah armada angkot saat ini :' + jumlahAngkot + ' ' + 'apakah anda ingin isi ulang jumlah armada angkot?');


// pakai for
// for (nomorAngkot = 1; nomorAngkot <= 10; nomorAngkot++) {
//     console.log("Angkot" + " " + nomorAngkot + " " + "Beroprasi dengan baik");
// }
// gabungan for dan while

// var noTruk = 1,
//     trukBeroprasi = 7,
//     jmlhTruk = 10;

// while (noTruk <= trukBeroprasi) {
//     console.log("Truk no" + " " + noTruk + " " + "Beroprasi");
//     noTruk++;
// }

// for (noTruk = trukBeroprasi + 1; noTruk <= jmlhTruk; noTruk++) {
//     console.log("Truk no" + " " + noTruk
//         + " " + "Tidak Beroprasi");
// }

// latihan if else
var noTruk = 1,
    trukBeroprasi = 9,
    jmlhTruk = 10;

for (noTruk = 1; noTruk <= jmlhTruk; noTruk++) {

    if (noTruk <= trukBeroprasi) {
        console.log("Truk no" + " " + noTruk + " " + "Beroprasi");
    } else {
        console.log("Truk no" + " " + noTruk
            + " " + "Tidak Beroprasi");
    }
}


