/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perhitunganlingkaran;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA		: Dandi Muhammad Iqbal
 * KELAS	: PBO11K
 * NIM		: 10118911
 * 
 */
public class PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static final float PHI = (float)3.14;
    public static void hitungLingkaran(float diameter){
        float r, luas, keliling;
        keliling = (float)PHI*diameter;
        luas = (float) ((0.25)*PHI*diameter*diameter);
        System.out.println();
        r = keliling/(2*PHI);
        System.out.println("===Hasil Perhitungan Lingkaran===");
        System.out.println("Jari-jari Lingkaran = "+r+" cm");
        System.out.println("Luas Lingkaran = "+luas+" cm");
        System.out.println("Keliling Lingkaran = "+keliling+" cm");       
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float n = 0;
        
        System.out.println("======Perhitungan Lingkaran======");    
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
        try {
        n = input.nextFloat();
        } catch (Exception e) {
            System.out.println("Nilai Diameter Tidak Sesuai\n");
            input.next();
        }
        } while( n <= 0);
        hitungLingkaran(n);
    }
    
}
