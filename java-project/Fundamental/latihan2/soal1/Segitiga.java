package soal1;


import java.util.*;
public class Segitiga {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int panjang_segitiga;

        System.out.print("Masukkan panjang: ");
        panjang_segitiga = scn.nextInt();

        for (int x = 1; x <= panjang_segitiga; x++) {
            for (int y = 1; y <= panjang_segitiga - x; y++) {
                System.out.print(" *");
            }  
            System.out.println("");
        }

        scn.close();
    }
}
