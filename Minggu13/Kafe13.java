package Minggu13;

import java.util.Scanner;

public class Kafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan : ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah Anda member? (true/false) : ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Masukkan kode promo : ");
        String kodePromo = sc.nextLine();

        menu(namaPelanggan, isMember, kodePromo);
    }

    
    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println(namaPelanggan+" adalah member, akan mendapatkan diskon 10% untuk setiap pembelian!");
        }

        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! "+namaPelanggan+ " mendapatkan diskon 50% dengan kode promo " + kodePromo);
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Selamat! " +namaPelanggan+ " mendapatkan diskon 30% dengan kode promo " + kodePromo);
        } else {
            System.out.println("Kode promo tidak valid: " + kodePromo);
        }

        // Menampilkan menu
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam  - Rp. 15,000");
        System.out.println("2. Cappuccino  - Rp. 20,000");
        System.out.println("3. Latte       - Rp. 22,000");
        System.out.println("4. Teh Tarik   - Rp. 12,000");
        System.out.println("5. Roti Bakar  - Rp. 10,000");
        System.out.println("6. Mie Goreng  - Rp. 18,000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.\n");
    }
}
