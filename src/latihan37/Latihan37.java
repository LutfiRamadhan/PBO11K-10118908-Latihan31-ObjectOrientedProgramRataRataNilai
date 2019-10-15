/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan37;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA  : LUTFI RAMADHAN
 * NIM   : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OlahNilai on = new OlahNilai();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        int jml_mahasiswa = scanner.nextInt();
        
        int[] nilai_mhs = new int[jml_mahasiswa];
        for (int i = 0; i < nilai_mhs.length; i++) {
            nilai_mhs[i] = 0;
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilai_mhs[i] = scanner.nextInt();
        }
        System.out.println("Maka, Rata-rata Nilainya adalah "+on.HitungRataRata(nilai_mhs));
        System.out.println("Developed by : Lutfi Ramadhan");
        
    }
    
}
