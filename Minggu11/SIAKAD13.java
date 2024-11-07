package Minggu11;
import java.util.Scanner;
public class SIAKAD13 {
    public static void main(String[] args) {
        //Deklarasi Scanner
        Scanner sc = new Scanner(System.in);
        //Deklarasi Input
        int jmlmahasiswa, jmlMatkul;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlmahasiswa = sc.nextInt();
        System.out.print("Masukkan jumlah Mata Kuliah : ");
        jmlMatkul = sc.nextInt();
        //Deklarasi Array
        int [][] nilai = new int [jmlmahasiswa][jmlMatkul];

        //Input Nilai Mahasiswwa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("\nInput nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa =0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.println("Nilai mata kuliah "+(j+1)+" : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];     
            }
        //Output Rata-rata Nilai
            System.out.println("Nilai rata-rata : "+totalPerSiswa/jmlMatkul);
        }
        //Perhitungan Nilai setiap Mata Kuliah
        for (int j = 0; j<jmlMatkul; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i <jmlmahasiswa ; i++) {
                totalPerMatkul += nilai[i][j];
            }
        //Output Rata-rata Nilai setiap Mata Kuliah
            System.out.println("Mata Kuliah "+(j+1)+" : "+ totalPerMatkul/jmlmahasiswa);
        }
    
    }
}