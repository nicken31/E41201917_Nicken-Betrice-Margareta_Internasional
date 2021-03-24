/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_promo;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class D_Promo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("            TOKO TWING           ");
        System.out.println("      Promo belanja berhadiah    ");
        System.out.println("Khusus pembelian 5 barang pertama");
        System.out.println(" Dengan harga minimum Rp100000   ");
        System.out.println("---------------------------------");

        System.out.println("Masukkan nama pembeli :");
        String nama = scan.nextLine();
        
        int[] harga = new int[5];
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            System.out.print("masukkan harga ke-" + i + " : ");
            harga [i] =scan.nextInt();
            total = total + harga[i];
        }
        System.out.println("total harga pembelian atas nama " +nama+ " adalah : " + total);
        
        boolean promo = false;
        for (int i = 0; i < harga.length; i++) {
            if (harga[i] >= 100000) {
                promo = false;
            } else {
                promo = true;
            }
        }
        if (promo == true) {
            System.out.println("SELAMAT...");
            System.out.println("ANDA MENDAPATKAN HADIAH MUG CANTIK");
        } else {
            System.out.println("MAAF ANDA TIDAK MENDAPATKAN HADIAH");
        }
        System.out.println("----------------------------------");
        System.out.println("          TERIMA KASIH            ");
        System.out.println(" ANDA SUDAH BELANJA DI TOKO TWING ");
    }
    
}
