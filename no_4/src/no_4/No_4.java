/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no_4;

/**
 *
 * @author MUHAMMAD FIRMAN
 */
public class No_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(var counter = 1; counter <= 100; counter++){
      if(counter % 2 == 1){
        continue;
      }

      System.out.println("Perulangan genap " + counter);
    }
    }
    
}
