/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_randomarray;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class B_RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek "input" yang merupakan Scanner
        Scanner input = new Scanner(System.in);
        int jumlahderet = 0;
        
        System.out.print("Masukkan jumlah deret: ");
        //nextInt digunakan untuk membaca baris angka yang diinputkan user
        jumlahderet = input.nextInt();
        
        int[] deretarray = new int [jumlahderet];

        for (int i = 0; i <jumlahderet; i++) {
            //math.random()*10 digunakan untuk menampilkan angka secara acak dengan batasan sampai angka 10
            deretarray[i] = (int) (Math.random()* 10);
        }
        for (int j = 0; j <jumlahderet; j++) {
            System.out.print(deretarray[j]+"\t");
        }
                
    }
    
}
