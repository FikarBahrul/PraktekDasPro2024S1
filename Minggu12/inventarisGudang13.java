package Minggu12;
import java.util.Scanner;

public class inventarisGudang13 {
    public static void main(String[] args) {
        //Inisialisasi Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Input Jumlah Jenis Barang dan Lokasi Penyimpanan
        System.out.print("Masukkan jumlah jenis barang : ");
        int jmlBarang = scanner.nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan : ");
        int jmlTempat = scanner.nextInt();
        scanner.nextLine(); // Membersihkan Line

        //1. Inisialisasi array 2 dimensi
        int[][] stok = new int[jmlBarang][jmlTempat];
        //2. Inisialisasi array 1 dimensi
        String[] namaKota = new String[jmlTempat];

        // Input Nama Kota
        for (int i = 0; i < namaKota.length; i++) {
            System.out.print("Kota untuk lokasi " + (i + 1) + " : ");
            namaKota[i] = scanner.nextLine();
        }

        //3. Input stok Barang
        System.out.println("\nMengisi stok barang...");
        for (int i = 0; i < 3; i++) { 
            System.out.print("Jenis barang (0-" + (jmlBarang - 1) + ") : ");
            int indeksBarang = scanner.nextInt();
            System.out.print("Lokasi (0-" + (jmlTempat - 1) + ") : ");
            int indeksKota = scanner.nextInt();
            System.out.print("Tambah stok: ");
            int jmlstok = scanner.nextInt();
            scanner.nextLine(); // Membersihkan Line

            // Input dari jmlstok ke dalam Array stok
            stok[indeksBarang][indeksKota] += jmlstok;
        }

        //4. Menampilkan tabel stok barang
        System.out.println("\nTabel stok Gudang : ");
        System.out.print("      ");
        for (String kota : namaKota) {
            System.out.print(kota + "    ");
        }
        System.out.println();

        for (int i = 0; i < stok.length; i++) {
            System.out.print("Barang " + (i + 1) + " :   ");
            for (int j = 0; j < stok[i].length; j++) {
                System.out.print(stok[i][j] + "       ");
            }
            System.out.println();
        }

        //5. perhitungan total stok untuk setiap jenis barang
        System.out.println("\nTotal stok untuk setiap jenis barang : ");
        for (int i = 0; i < stok.length; i++) {
            int totalstok = 0;
            for (int j = 0; j < stok[i].length; j++) {
                totalstok += stok[i][j];
            }
            System.out.println("Jenis barang ke-" + (i + 1) + " : " + totalstok);
        }

        //6. Menemukan kota dengan stok terbanyak untuk setiap jenis barang
        System.out.println("\nLokasi dengan stok terbanyak untuk setiap jenis barang : ");
        for (int i = 0; i < stok.length; i++) {
            int stokMax = 0;
            int indeksKotaMax = -1;
            for (int j = 0; j < stok[i].length; j++) {
                if (stok[i][j] > stokMax) {
                    stokMax = stok[i][j];
                    indeksKotaMax = j;
                }
            }
            if (indeksKotaMax != -1) {
                System.out.println("Jenis barang ke-" + (i + 1) + " : " + namaKota[indeksKotaMax]);
            } else {
                System.out.println("Jenis barang ke-" + (i + 1) + " : Tidak ada stok");
            }
        }

    }
}
