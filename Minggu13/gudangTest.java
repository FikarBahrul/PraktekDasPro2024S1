package Minggu13;
import java.util.Scanner;

public class gudangTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array 2D untuk menyimpan kode barang dan stok
        String[][] kodeBarang = new String[5][4];
        int[][] stokBarang = new int[5][4];

        // Input data barang untuk setiap slot
        System.out.println("Masukkan data barang di gudang:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Rak " + (i + 1) + ", Slot " + (j + 1) + " - Kode Barang: ");
                kodeBarang[i][j] = scanner.next();
                System.out.print("Rak " + (i + 1) + ", Slot " + (j + 1) + " - Stok Barang: ");
                int stok;
                while (true) {
                    stok = scanner.nextInt();
                    if (stok >= 0) {
                        break;
                    } else {
                        System.out.print("Stok tidak boleh negatif. Masukkan ulang: ");
                    }
                }
                stokBarang[i][j] = stok;
            }
        }

        // Hitung total stok barang di gudang
        int totalStok = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                totalStok += stokBarang[i][j];
            }
        }

        // Cari slot dengan stok barang terbanyak dan terkecil
        int stokTertinggi = Integer.MIN_VALUE;
        int stokTerendah = Integer.MAX_VALUE;
        String slotTertinggi = "", slotTerendah = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (stokBarang[i][j] > stokTertinggi) {
                    stokTertinggi = stokBarang[i][j];
                    slotTertinggi = "Rak " + (i + 1) + ", Slot " + (j + 1);
                }
                if (stokBarang[i][j] < stokTerendah) {
                    stokTerendah = stokBarang[i][j];
                    slotTerendah = "Rak " + (i + 1) + ", Slot " + (j + 1);
                }
            }
        }

        // Tampilkan tabel stok barang
        System.out.println("\nTabel Stok Barang di Gudang:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + kodeBarang[i][j] + ":" + stokBarang[i][j] + "]\t");
            }
            System.out.println();
        }

        // Tampilkan hasil perhitungan
        System.out.println("\nTotal stok barang di gudang: " + totalStok);
        System.out.println("Slot dengan stok terbanyak: " + slotTertinggi + " (Stok: " + stokTertinggi + ")");
        System.out.println("Slot dengan stok terkecil: " + slotTerendah + " (Stok: " + stokTerendah + ")");

        // Cari barang berdasarkan kode
        System.out.print("\nMasukkan kode barang yang ingin dicari: ");
        String kodeDicari = scanner.next();
        cariBarang(kodeBarang, kodeDicari);

        // Pemindahan stok barang
        System.out.println("\nPemindahan stok barang:");
        System.out.print("Masukkan Rak asal: ");
        int rakAsal = scanner.nextInt() - 1;
        System.out.print("Masukkan Slot asal: ");
        int slotAsal = scanner.nextInt() - 1;
        System.out.print("Masukkan Rak tujuan: ");
        int rakTujuan = scanner.nextInt() - 1;
        System.out.print("Masukkan Slot tujuan: ");
        int slotTujuan = scanner.nextInt() - 1;
        System.out.print("Masukkan jumlah stok yang dipindahkan: ");
        int jumlahPindah = scanner.nextInt();

        if (stokBarang[rakAsal][slotAsal] >= jumlahPindah && jumlahPindah >= 0) {
            stokBarang[rakAsal][slotAsal] -= jumlahPindah;
            stokBarang[rakTujuan][slotTujuan] += jumlahPindah;
        } else {
            System.out.println("Stok tidak mencukupi atau jumlah pindahan tidak valid!");
        }

        // Tampilkan tabel stok barang setelah pemindahan
        System.out.println("\nTabel Stok Barang setelah Pemindahan:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + kodeBarang[i][j] + ":" + stokBarang[i][j] + "]\t");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Mencari rak dan slot berdasarkan kode barang
    public static void cariBarang(String[][] kodeBarang, String kodeDicari) {
        boolean ditemukan = false;
        for (int i = 0; i < kodeBarang.length; i++) {
            for (int j = 0; j < kodeBarang[i].length; j++) {
                if (kodeBarang[i][j].equalsIgnoreCase(kodeDicari)) {
                    System.out.println("Kode barang " + kodeDicari + " ditemukan di Rak " + (i + 1) + ", Slot " + (j + 1));
                    ditemukan = true;
                    return; // Berhenti setelah ditemukan
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Kode barang " + kodeDicari + " tidak ditemukan di gudang.");
        }
    }
}
