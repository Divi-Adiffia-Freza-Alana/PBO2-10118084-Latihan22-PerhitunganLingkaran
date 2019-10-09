/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan22.perhitunganlingkaran;
import java.util.Scanner;
/**
 *
 * @author Freza
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menghitung lingkaran
 */
public class PBO210118084Latihan22PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner (System.in);
        double jarijari,luas,keliling;
         System.out.println("========Perhitungan Lingkaran======"); 
         System.out.print("Masukkan nilai diameter Lingkaran :"); 
        while (!Scanner.hasNextDouble()) {
        System.out.println("Nilai Diameter Tidak Sesuai ");
        Scanner.nextLine();
        System.out.print("Masukkan nilai diameter Lingkaran :"); 
     }
     double diameter = Scanner.nextDouble();
     jarijari=0.5*diameter;
     luas =Math.PI*jarijari*jarijari;
     keliling=Math.PI*2*jarijari;
        System.out.println("Jari-Jari lingkarang = "+jarijari+" cm");
        System.out.println("Jari-Jari lingkarang = "+luas+" cm");
        System.out.println("Jari-Jari lingkarang = "+keliling+" cm");
       
        
    }
    
}
