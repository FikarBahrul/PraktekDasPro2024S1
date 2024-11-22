package Minggu13;

import java.util.Scanner;

public class Kubus13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n<=== Sistem Dasar Program ===>");
            System.out.println("Pilih opsi :");
            System.out.println("1. Hitung Volume dan Luas Permukaan Kubus");
            System.out.println("2. Rekap Penjualan Cafe");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                // Bagian Kubus
                System.out.print("Masukkan panjang sisi kubus : ");
                double sisi = input.nextDouble();
                double luasPermukaan = hitungLuasPermukaan(sisi);
                double volume = hitungVolume(sisi);
                
                System.out.println("Luas Permukaan Kubus : " + luasPermukaan);
                System.out.println("Volume Kubus : " + volume);
            } else if (pilihan == 2) {
                // Bagian Rekap Penjualan
                System.out.println("\n<=== Rekap Penjualan ===>");
                tampilkanTotalPenjualan();
                System.out.println();
                tampilkanPenjualanPerHari();
                System.out.println();
                tampilkanMenuTertinggi();
                System.out.println();
                tampilkanRataRataPenjualan();
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

    // Data penjualan cafe
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, // Kopi
        {30, 80, 40, 10, 15, 20, 25}, // Teh
        {5, 9, 20, 25, 10, 5, 45},    // Es Degan
        {50, 8, 17, 18, 10, 30, 15 },  // Roti Bakar
        {15, 10, 16, 15, 5, 10, 55 }   // Gorengan
    };
    static String[] menu = {">-> Kopi", ">-> Teh", ">-> Es Degan", ">-> Roti Bakar", ">-> Gorengan"};

    // Fungsi untuk menampilkan total penjualan
    static void tampilkanTotalPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            System.out.println("Total penjualan " + menu[i] + " : " + total);
        }
    }


// Fungsi untuk menampilkan data penjualan per hari
static void tampilkanPenjualanPerHari() {
    System.out.println("\n Data penjualan dari hari ke-1 hingga hari ke-7 : ");
    for (int i = 0; i < menu.length; i++) {
        System.out.print(menu[i] + " : [");
        for (int j = 0; j < penjualan[i].length; j++) {
            System.out.print(penjualan[i][j]);
            if (j < penjualan[i].length - 1) { //mencegah elemen terakhir
                System.out.print("], ["); // Menambahkan koma dan kurung jika bukan elemen terakhir
            }
        }
        System.out.println("]");
    }
}

    // Fungsi untuk menampilkan menu dengan penjualan tertinggi
    static void tampilkanMenuTertinggi() {
        int maxPenjualan = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxPenjualan) {
                maxPenjualan = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("Menu dengan penjualan tertinggi: " + menuTerlaris + " (Total : " + maxPenjualan + ")");
    }

    // Fungsi untuk menghitung rata-rata penjualan per menu
    static void tampilkanRataRataPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rataRata = (double) total / penjualan[i].length;
            System.out.println("Rata-rata penjualan " + menu[i] + " : " + rataRata);
        }
    }
}
