package Minggu13;
import java.util.Scanner;

public class test12 {
    static Scanner sc = new Scanner(System.in);
    static int[][] penjualan; // Deklarasi array penjualan
    static String[] menu = {">-> Kopi", ">-> Teh", ">-> Es Degan", ">-> Roti Bakar", ">-> Gorengan"};

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("\n<=== Sistem Dasar Program ===>");
            System.out.println("Pilih opsi :");
            System.out.println("1. Hitung Volume dan Luas Permukaan Kubus");
            System.out.println("2. Rekap Penjualan Cafe");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();

            if (pilihan == 1) {
                // Bagian Kubus
                System.out.print("Masukkan panjang sisi kubus : ");
                double sisi = sc.nextDouble();
                double luasPermukaan = hitungLuasPermukaan(sisi);
                double volume = hitungVolume(sisi);
                
                System.out.println("Luas Permukaan Kubus : " + luasPermukaan);
                System.out.println("Volume Kubus : " + volume);
            } else if (pilihan == 2) {
                // Bagian Rekap Penjualan
                System.out.print("Masukkan jumlah mahasiswa : ");
                int jmlMHS = sc.nextInt();
                System.out.print("Masukkan jumlah tugas : ");
                int jmlTugas = sc.nextInt();

                // Inisialisasi array penjualan berdasarkan jumlah menu dan tugas
                penjualan = new int[menu.length][jmlTugas];

                // Mengisi data penjualan berdasarkan sc pengguna
                for (int i = 0; i < menu.length; i++) {
                    System.out.println("Masukkan penjualan untuk " + menu[i] + ":");
                    for (int j = 0; j < jmlTugas; j++) {
                        System.out.print("Tugas " + (j + 1) + ": ");
                        penjualan[i][j] = sc.nextInt();
                    }
                }
                //Memanggil function
                System.out.println("\n<=== Rekap Penjualan ===>");
                TotalPenjualan();
                System.out.println();
                PenjualanPerHari();
                System.out.println();
                MenuTertinggi();
                System.out.println();
                RataRataPenjualan();
            } else if (pilihan == 3) {
                // Keluar program
                System.out.println("Operasi selesai.");
                running = false;
            } else {
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

    }

    // Fungsi menghitung luas permukaan kubus
    static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    // Fungsi menghitung volume kubus
    static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi untuk menampilkan total penjualan
    static void TotalPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            System.out.println("Total penjualan " + menu[i] + " : " + total);
        }
    }

    // Fungsi untuk menampilkan data penjualan per hari
    static void PenjualanPerHari() {
        System.out.println("\nData penjualan dari hari ke-1 hingga hari ke-" + penjualan[0].length + ":");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + " : [");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j]);
                if (j < penjualan[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    static void MenuTertinggi() {
        int maxIndex = 0;
        int maxTotal = 0;
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                maxIndex = i;
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menu[maxIndex] + " dengan total " + maxTotal);
    }

    // Fungsi untuk menampilkan rata-rata penjualan
    static void RataRataPenjualan() {
        System.out.println("Rata-rata penjualan per menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println(menu[i] + " : " + rataRata);
        }
    }
}