/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan program menghitung lingkaran
 */
package pboif2.pkg10119059.latihan22.lingkaran;

import java.util.Scanner;


public class PBOIF210119059Latihan22Lingkaran {
    
    public static double hitungJariJari(double diameter){
       double jariJari = diameter/2;
       return jariJari;
   }
   
   public static double hitungLuas(double diameter){
       double jariJari = diameter/2;
       double luas = 3.14 * jariJari * jariJari;
       return luas;
   }
   
   public static double hitungKeliling(double diameter){
       double jariJari = diameter/2;
       double keliling = 2 *3.14 * jariJari;
       return keliling;
   }
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int diameter=0;
    String konversi;
    boolean kondisi = true;
    
    System.out.println("===== Perhitungan Lingkaran ======");
    do {
        System.out.print("Masukkan nilai diameter lingkaran : ");
            konversi = input.next();
                if(konversi.matches("[0-9]*")){
                    diameter = Integer.parseInt(konversi);
                    kondisi = true;
                }else{
                    System.err.println("Nilai Diameter Tidak Sesuai");
                    kondisi = false;
                }
    }while(!kondisi);
        System.out.println("");
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-Jari Lingkaran = "+hitungJariJari(diameter)+" cm");
        System.out.println("Luas Lingkaran      = "+hitungLuas(diameter)+" cm");
        System.out.println("Keliling Lingkaran  = "+hitungKeliling(diameter)+" cm");
    
        }
    }
    

