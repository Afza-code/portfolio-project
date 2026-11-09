
package soal1;

import java.util.*;
public class Persegi_bintang {
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int x;
        int y;
        int besar_persegi;

        System.out.print("Masukkan besar persegi : ");
        besar_persegi = scn.nextInt();
        
        for (x = 1; x <= besar_persegi; x++){
            for (y = 1; y <= besar_persegi; y++){
                System.out.print("*" + " ");
            }
            System.out.println("*");
        }
    }
}
