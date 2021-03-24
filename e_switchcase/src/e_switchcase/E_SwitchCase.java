/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_switchcase;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class E_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        
        //mengambil input
        System.out.println("       CAFE TWING     ");
        System.out.println("----------------------");
        System.out.println("         MENU :       ");
        System.out.println("----------------------");
        String[] menu = {"Milk", "Matcha latte", "Redvelved", "Coffee latte", "Cocktail"};
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu [i]);
        }
        System.out.println("----------------------");
        
        String nama;
        System.out.print("Masukkan nama pemesan : ");
        nama = scan.nextLine();
        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda: ");
        int aa = scan.nextInt();
        String pesanan = "";
        switch (aa){
            case 0:
                pesanan = "Milk";
                break;
            case 1:
                pesanan = "Matcha latte";
                break;
            case 2:
                pesanan = "Redvelved";
                break;
            case 3:
                pesanan = "Coffee latte";
                break;
            case 4:
                pesanan = "Cocktail";
                break;
            default:
                System.out.println("Pilihan anda tidak ada di menu");
                break;
        }
        
        System.out.println("Pesanan yang anda pilih : " + pesanan);
        System.out.println("Pesanan anda segera kami antar");
        System.out.println("Terima Kasih " + nama + " telah memesan di CAFE TWING");
    }
    
}
