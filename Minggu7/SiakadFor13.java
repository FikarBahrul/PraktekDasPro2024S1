package Minggu7;
import java.util.Scanner;
public class SiakadFor13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi = 0, terendah = 100, jmlLulus=0, jmlTidakLulus=0;
        
        for (int i = 1; i <= 10; i++)  {
            System.out.print ("Masukkan nilai Mahasiswa ke-"+ i +": ");
            nilai = sc.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                jmlLulus++;
            } else {
                jmlTidakLulus++;
            }
        }
        System.out.print ("Nilai Tertinggi : "+ tertinggi);
        System.out.print ("Nilai Terendah : "+ terendah);
    }
}