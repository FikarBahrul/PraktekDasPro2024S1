package Minggu10;
import java.util.Scanner;
public class arr2dcontoh {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Jumlah responden dan pertanyaan
        int jumlahResponden = 10;
        int jumlahPertanyaan = 6;

        // Membuat array 2 dimensi untuk menyimpan jawaban
        int[][] jawaban = new int[jumlahResponden][jumlahPertanyaan];

        // Input data dari pengguna
        System.out.println("Masukkan nilai jawaban survei (1-5):");
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                System.out.print("Responden " + (i+1) + ", Pertanyaan " + (j+1) + ": ");
                jawaban[i][j] = scanner.nextInt();
            }
        }

        // Hitung rata-rata per responden
        double[] rataRataResponden = new double[jumlahResponden];
        for (int i = 0; i < jumlahResponden; i++) {
            int jumlahNilai = 0;
            for (int j = 0; j < jumlahPertanyaan; j++) {
                jumlahNilai += jawaban[i][j];
            }
            rataRataResponden[i] = (double) jumlahNilai / jumlahPertanyaan;
        }

        // Hitung rata-rata per pertanyaan
        double[] rataRataPertanyaan = new double[jumlahPertanyaan];
        for (int j = 0; j < jumlahPertanyaan; j++) {
            int jumlahNilai = 0;
            for (int i = 0; i < jumlahResponden; i++) {
                jumlahNilai += jawaban[i][j];
            }
            rataRataPertanyaan[j] = (double) jumlahNilai / jumlahResponden;
        }

        // Hitung rata-rata keseluruhan
        int totalNilai = 0;
        for (int i = 0; i < jumlahResponden; i++) {
            for (int j = 0; j < jumlahPertanyaan; j++) {
                totalNilai += jawaban[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalNilai / (jumlahResponden * jumlahPertanyaan);

        // Tampilkan hasil
        System.out.println("\nHasil Analisis Survei:");
        System.out.println("Rata-rata nilai per responden:");
        for (int i = 0; i < jumlahResponden; i++) {
            System.out.println("Responden " + (i+1) + ": " + rataRataResponden[i]);
        }

        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < jumlahPertanyaan; j++) {
            System.out.println("Pertanyaan " + (j+1) + ": " + rataRataPertanyaan[j]);
        }

        System.out.println("\nRata-rata nilai keseluruhan: " + rataRataKeseluruhan);
    }
    
}
