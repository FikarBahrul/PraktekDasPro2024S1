package Minggu14;
import java.util.Scanner;

public class totalNilai13 {

    // Fungsi iteratif untuk menghitung total
    static int hitungTotalIteratif(int n, int[] angka) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i]; // Menambahkan angka ke total
        }
        return total;
    }

    // Fungsi rekursif untuk menghitung total
    static int hitungTotalRekursif(int n, int[] angka, int index) {
        if (index == n) {
            return 0;
        } else {
            return angka[index] + hitungTotalRekursif(n, angka, index + 1); // Rekursi
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah angka yang ingin dihitung (x)
        System.out.print("Masukkan jumlah angka yang ingin dihitung (x) : ");
        int n = sc.nextInt();

        // Array untuk menyimpan angka yang dimasukkan pengguna
        int[] angka = new int[n];

        // Meminta pengguna untuk input angka satu per satu
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (n - i) + " : ");
            angka[i] = sc.nextInt();
        }

        // Menampilkan deret angka yang dimasukkan
        System.out.print("Deret angka yang dimasukkan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i]);
            if (i < n - 1) {
                System.out.print(" + ");
            }
        }
        System.out.print(" + x ");
        System.out.println();

        // Menghitung dan mencetak total dengan metode iteratif
        int totalIteratif = hitungTotalIteratif(n, angka);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah (hasil iteratif) : " + totalIteratif);

        // Menghitung dan mencetak total dengan metode rekursif
        int totalRekursif = hitungTotalRekursif(n, angka, 0);
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah (hasil rekursif) : " + totalRekursif);

    }
}
