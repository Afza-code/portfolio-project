package soal1;
import java.util.*;
public class Persegi_panjang {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int panjang_persegi,
        tinggi_persegi;

        System.out.print("Masukkan Panjang Persegi : ");
        panjang_persegi = scn.nextInt();

        System.out.print("Masukkan Tinggi Persegi : ");
        tinggi_persegi = scn.nextInt();

        for(int y = 1; y <= tinggi_persegi; y++){
        for (int x = 1; x <= panjang_persegi; x++){
                System.out.print(" *");
            }
            System.out.println("");
        }

    }
}
