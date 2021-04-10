/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_tugas1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class A_tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int pilihan, awal, akhir;
        
        System.out.print("masukkan nilai awal : ");
        awal = input.nextInt();
        System.out.print("masukkan nilai akhir : ");
        akhir = input.nextInt();
        
        
        System.out.println("deret bilangan ganjil");
        for(int i=awal;i<=akhir;i++) {
            if (i%2!=0)
                System.out.println(""+i);
        }
        System.out.println("deret bilangan genap");
        for(int j=awal;j<=akhir;j++){
            if (j%2==0)
                System.out.println(""+j);
        }
    }
    
}
