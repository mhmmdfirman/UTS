/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatement;

/**
 *
 * @author MUHAMMAD FIRMAN
 */
public class IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var nilai = 80;
        var absen = 75;
        
        
        var lulusNilai = nilai >= 80;
        var lulusAbsen = absen >= 75;
        
        var lulus = lulusNilai && lulusAbsen;
        
        if (nilai >=75 && absen <= 75) {
            System.out.println("selamat anda lulus");
    }else {
     System.out.println("silahkan coba tahun depan");       
        }
    if (nilai >= 80 && absen >= 80){
        System.out.println("nilai anda A"); 
    }else if (nilai >= 70 && absen >= 70 ) {
        System.out.println("nilai anda B");
    }else if (nilai >= 60 && absen >= 60 ) {
        System.out.println("nilai anda C");
    }else if (nilai >= -50 && absen >= -50 ) {
        System.out.println("nilai anda D");
    }else{
        System.out.println("nilai anda E");
    }
    }
        
    
}
