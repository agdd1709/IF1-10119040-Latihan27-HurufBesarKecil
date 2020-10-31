/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author Acer
 * Nama     : Agus Deri Dermawan
 * Kelas    : IF1
 * NIM      : 10119040
 * program menampilkan huruf dengan kapital dan kecil
 */
public class IF110119040Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kalimat;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        kalimat = input.nextLine();
        
        System.out.println();
        System.out.println("=========Hasil Formatting==========");
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
    }
    
}
