/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_tugas2;

/**
 *
 * @author ACER
 */
public class B_tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat variabel
        int i = 1;
        //membuat desain
        System.out.println("          do_while          ");
        System.out.println("bilangan perkalian 2 (1-100)");
        System.out.println("============================");
        
        //membuat perkalian 2
        do{
            System.out.print(" " + i);
            i= i * 2;
            
        //membuat batas dari perkalian 2
        }
        while (i <=100);
        System.out.println("");
        }
    
}
