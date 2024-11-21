package Minggu13;

import java.util.Scanner;

public class matriksTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks
        System.out.print("Masukkan ukuran matriks (n x n): ");
        int n = scanner.nextInt();

        // Deklarasi matriks
        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];

        // Input matriks pertama
        System.out.println("Masukkan elemen untuk matriks A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemen A[" + i + "][" + j + "]: ");
                matriksA[i][j] = scanner.nextInt();
            }
        }

        // Input matriks kedua
        System.out.println("Masukkan elemen untuk matriks B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemen B[" + i + "][" + j + "]: ");
                matriksB[i][j] = scanner.nextInt();
            }
        }

        // Pilihan operasi
        System.out.println("\nPilih operasi matriks:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Transpose Matriks A");
        System.out.println("5. Transpose Matriks B");
        System.out.print("Masukkan pilihan (1-5): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                // Penjumlahan matriks
                int[][] hasilPenjumlahan = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        hasilPenjumlahan[i][j] = matriksA[i][j] + matriksB[i][j];
                    }
                }
                tampilkanMatriks("Hasil penjumlahan", hasilPenjumlahan);
                break;

            case 2:
                // Pengurangan matriks
                int[][] hasilPengurangan = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        hasilPengurangan[i][j] = matriksA[i][j] - matriksB[i][j];
                    }
                }
                tampilkanMatriks("Hasil pengurangan", hasilPengurangan);
                break;

            case 3:
                // Perkalian matriks
                int[][] hasilPerkalian = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        hasilPerkalian[i][j] = 0; // Inisialisasi
                        for (int k = 0; k < n; k++) {
                            hasilPerkalian[i][j] += matriksA[i][k] * matriksB[k][j];
                        }
                    }
                }
                tampilkanMatriks("Hasil perkalian", hasilPerkalian);
                break;

            case 4:
                // Transpose Matriks A
                int[][] transposeA = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        transposeA[i][j] = matriksA[j][i];
                    }
                }
                tampilkanMatriks("Transpose Matriks A", transposeA);
                break;

            case 5:
                // Transpose Matriks B
                int[][] transposeB = new int[n][n];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        transposeB[i][j] = matriksB[j][i];
                    }
                }
                tampilkanMatriks("Transpose Matriks B", transposeB);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    // Fungsi untuk menampilkan matriks
    public static void tampilkanMatriks(String operasi, int[][] matriks) {
        System.out.println(operasi + ":");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
