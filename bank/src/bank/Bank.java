/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author MUHAMMAD FIRMAN
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bank mysaldo = new Bank(100000);
        mysaldo.getSaldo();
        mysaldo.simpanuang(150000);
        mysaldo.ambilUang(4000000);
    }
    
}
