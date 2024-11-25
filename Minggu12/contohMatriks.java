package Minggu12;
import java.util.Scanner;
public class contohMatriks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //inisialisasi Scanner

        int[][] matriksA = new int[3][3]; //inisialisasi Array 2D untuk Matriks A
        int[][] matriksB = new int[3][3]; //inisialisasi Array 2D untuk Matriks B
        int[][] hasil = new int[3][3]; //inisialisasi Array 2D untuk Hasil operasi dari Matriks A dan Matriks B

        // Input untuk matriks A
        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A [" + i + "][" + j + "] : ");
                matriksA[i][j] = scanner.nextInt(); //input dari User masuk ke Array 2D Matriks A
            }
        
        }

        // Input untuk matriks B
        System.out.println("\nMasukkan elemen matriks B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                matriksB[i][j] = scanner.nextInt(); //input dari User masuk ke Array 2D Matriks B
            }
        }

        // Penjumlahan matriks dengan nested loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j]; //input hasil penjumlahan operasi Matriks A dan Matriks B ke dalam Array Hasil
            }
        }

        // Output Hasil
        System.out.println("\nHasil penjumlahan matriks:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
