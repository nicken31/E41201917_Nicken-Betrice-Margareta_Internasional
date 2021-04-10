/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_minmax;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class C_minmax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat scanner
        Scanner sc = new Scanner(System.in);
        int[] array;
        int nr, max, min, sum = 0, count = 0;
        
        int average =0;
        System.out.print("masukkan banyaknya data nilai : ");
        nr = sc.nextInt();
        array = new int[nr];
        
        for(int i = 0; i<array.length;i++) {
            System.out.print("masukkan nilai ke-" + (i+1) + " : ");
            array[i] = sc.nextInt();
        }
        max = array[0];
        min = array[0];
        for(int i=0;i<array.length;i++){
            sum += array[i];
            count++;
            if(array[i] > max) {
                max = array[i];
            }else if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("nilai minimum = " + min);
        System.out.println("nilai maksimum = " + max);
        
        average = sum / count;
        System.out.println("nilai rata ratanya adalah = " + average);
    }
    
}
