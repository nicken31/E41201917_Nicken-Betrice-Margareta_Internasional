/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author ACER
 */
public class Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        class book {
            int price;
            int pages;
            
            
            public void set (int price, int pages) {
                this.price = price;
                this.pages = pages;
            }
            public void show (){
                System.out.println("book information");
                System.out.println("books price : " +price);
                System.out.println("number of pages : " +pages);
            }
        }
        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();
    }
    
}
