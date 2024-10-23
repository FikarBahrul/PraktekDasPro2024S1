package Minggu9;
//buat scanner
import java.util.Scanner;

public class rataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi input
        int i, j, nilaiMHS;
        float nilai, totalNilai = 0, rataNilai;

        i = 1;
        while (i <= 5) {
            System.out.println("Mahasiswa ke-" + i);
            totalNilai = 0; // Inisialisasi totalNilai di awal setiap mahasiswa
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + "=");
                nilaiMHS = sc.nextInt();
                totalNilai += nilaiMHS;
            }
            i++;
        }

        rataNilai = totalNilai / (5 * 5); // Menghitung rata-rata keseluruhan
        System.out.println("Rata-rata nilai semua mahasiswa: " + rataNilai);
    }
}