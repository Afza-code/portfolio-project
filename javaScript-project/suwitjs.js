// var tanya = true;
// while (tanya) {
//     // pilihan pemain
//     var p = prompt('pilih : gajah, semut, orang');

//     // pilihan komputer
//     // membangkitkan bilangan random
//     var comp = Math.random();

//     if (comp < 0.34) {
//         comp = 'gajah';
//     } else if (comp >= 0.34 && comp < 0.67) {
//         comp = 'orang';
//     } else {
//         comp = 'semut';
//     }

//     // aturan main
//     var hasil = '';
//     if (p == comp) {
//         hasil = 'SERI!';
//     } else if (p == 'gajah') {
//         if (comp == 'orang') {
//             hasil = 'MENANG!';
//         } else {
//             hasil = 'KALAH!';
//         }
//     } else if (p == 'orang') {
//         if (comp == 'gajah') {
//             hasil = 'KALAH';
//         } else {
//             hasil = 'MENANG';
//         }
//     } else if (p == 'semut') {
//         if (comp == 'gajah') {
//             hasil = 'MENANG!';
//         } else {
//             hasil = 'KALAH';
//         }
//     } else {
//         hasil = 'KAMU MEMASUKKAN PILIHAN YANG TIDAK SESUAI!'
//     }

//     // tampilan hasil
//     alert('kamu memilih : ' + p + '\nkomputer memilih : ' + comp + '\n' + 'maka hasilnya adalah kamu : ' + hasil);

//     tanya = confirm('masih ingin main?');
// }
// alert('terimakasih sudah bermain');

comp = Math.random(1 - 10);
console.log(comp);