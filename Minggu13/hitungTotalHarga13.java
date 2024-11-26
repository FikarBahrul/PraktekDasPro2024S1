package Minggu13;
import java.util.Scanner;

public class hitungTotalHarga13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan : ");
        String namaPelanggan = sc.nextLine();

        System.out.print("Apakah Anda member? (true/false) : ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine(); // Clear the buffer

        System.out.print("Masukkan kode promo : ");
        String kodePromo = sc.nextLine();

        menu(namaPelanggan, isMember, kodePromo);
    }

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println(namaPelanggan + " adalah member, akan mendapatkan diskon 10% untuk setiap pembelian!");
        }

        // Variabel untuk menyimpan total harga keseluruhan
        int totalHargaKeseluruhan = 0;

        Scanner sc = new Scanner(System.in);
        boolean pesanLagi = true;

        while (pesanLagi) { //Perulangan untuk memesan kembali
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6) : ");
            int PilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan : ");
            int banyakItem = sc.nextInt();

            // Hitung total harga untuk menu yang dipilih
            int totalHarga = hitungTotalHarga(PilihanMenu, banyakItem);
            totalHargaKeseluruhan += totalHarga; // Tambahkan ke total keseluruhan

            System.out.print("Apakah Anda ingin memesan lagi? (true/false) : ");
            pesanLagi = sc.nextBoolean();
        }

        // Terapkan diskon
        if (isMember) {
            totalHargaKeseluruhan = (int) (totalHargaKeseluruhan * 0.9); // Diskon 10% jika member
        }

        if (kodePromo.equals("DISKON50")) {
            totalHargaKeseluruhan = totalHargaKeseluruhan / 2; // Diskon 50%
            System.out.println("Selamat! " + namaPelanggan + " mendapatkan diskon 50% dengan kode promo " + kodePromo);
        } else if (kodePromo.equals("DISKON30")) {
            totalHargaKeseluruhan = (int) (totalHargaKeseluruhan * 0.7); // Diskon 30%
            System.out.println("Selamat! " + namaPelanggan + " mendapatkan diskon 30% dengan kode promo " + kodePromo);
        } else {
            System.out.println("Kode promo tidak valid: " + kodePromo);
        }

        System.out.println("Total harga untuk pesanan anda: " + totalHargaKeseluruhan);
    }

    public static int hitungTotalHarga(int PilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000}; //pesanan 1 hingga 6
        int hargaTotal = hargaItems[PilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
}