package Minggu13;
import java.util.Scanner;

public class BubbleSortBinarySearchTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1️ Input Data Array dari Pengguna
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        int[] data = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i] = scanner.nextInt();
        }

        // 2️ Proses Pengurutan Bubble Sort
        System.out.println("\n=== Proses Pengurutan Bubble Sort ===");
        bubbleSort(data);

        System.out.print("\nArray setelah diurutkan: ");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("\n");

        // 3️ Proses Pencarian Binary Search
        System.out.print("Masukkan elemen yang ingin dicari: ");
        int target = scanner.nextInt();
        
        System.out.println("\n=== Proses Binary Search ===");
        binarySearch(data, target);
        
        scanner.close();
    }

    // Fungsi Bubble Sort
    public static void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) { 
            for (int j = 0; j < n - 1 - i; j++) { 
                if (data[j] > data[j + 1]) {
                    // Tukar elemen jika urutannya salah
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }

            // Tampilkan proses pengurutan di setiap iterasi
            System.out.print("Iterasi " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(data[k] + " ");
            }
            System.out.println();
        }
    }

    // 🔥 Fungsi Binary Search
    public static void binarySearch(int[] data, int target) {
        int low = 0;
        int high = data.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("Indeks Tengah: " + mid + " Elemen Tengah: " + data[mid]);

            if (data[mid] == target) {
                System.out.println("Data ditemukan di indeks ke-" + mid);
                found = true;
                break;
            } else if (data[mid] < target) {
                // Pindah ke bagian kanan array
                low = mid + 1;
            } else {
                // Pindah ke bagian kiri array
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Data tidak ditemukan");
        }
    }
}

