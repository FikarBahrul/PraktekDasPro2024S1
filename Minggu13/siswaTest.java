package Minggu13;
import java.util.Scanner;

public class siswaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array
        String[] namaSiswa = new String[5];
        int[][] nilaiSiswa = new int[5][3];
        double[] rataRata = new double[5];

        // Input data siswa
        System.out.println("Masukkan data nilai siswa:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = scanner.next();
            for (int j = 0; j < 3; j++) {
                String mataPelajaran = switch (j) {
                    case 0 -> "Matematika";
                    case 1 -> "Bahasa Inggris";
                    default -> "IPA";
                };
                System.out.print("Nilai " + mataPelajaran + ": ");
                int nilai;
                while (true) {
                    nilai = scanner.nextInt();
                    if (nilai >= 0 && nilai <= 100) {
                        break;
                    } else {
                        System.out.print("Nilai harus antara 0-100. Masukkan ulang: ");
                    }
                }
                nilaiSiswa[i][j] = nilai;
            }
        }

        // Hitung rata-rata nilai
        for (int i = 0; i < 5; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += nilaiSiswa[i][j];
            }
            rataRata[i] = total / 3.0;
        }

        // Cari siswa dengan nilai rata-rata tertinggi dan terendah
        int idxTertinggi = 0, idxTerendah = 0;
        for (int i = 1; i < 5; i++) {
            if (rataRata[i] > rataRata[idxTertinggi]) {
                idxTertinggi = i;
            }
            if (rataRata[i] < rataRata[idxTerendah]) {
                idxTerendah = i;
            }
        }

        // Tampilkan tabel nilai siswa
        System.out.println("\nTabel Nilai Siswa:");
        System.out.printf("%-10s %-10s %-15s %-10s %-10s\n", "Nama", "Matematika", "Bahasa Inggris", "IPA", "Rata-rata");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s %-10d %-15d %-10d %-10.2f\n", namaSiswa[i], nilaiSiswa[i][0], nilaiSiswa[i][1], nilaiSiswa[i][2], rataRata[i]);
        }

        // Tampilkan hasil analisis
        System.out.println("\nSiswa dengan rata-rata tertinggi: " + namaSiswa[idxTertinggi] + " (Rata-rata: " + rataRata[idxTertinggi] + ")");
        System.out.println("Siswa dengan rata-rata terendah: " + namaSiswa[idxTerendah] + " (Rata-rata: " + rataRata[idxTerendah] + ")");

        // Cari nilai berdasarkan nama
        System.out.print("\nMasukkan nama siswa yang ingin dicari: ");
        String namaDicari = scanner.next();
        boolean ditemukan = false;
        for (int i = 0; i < 5; i++) {
            if (namaSiswa[i].equalsIgnoreCase(namaDicari)) {
                System.out.println("Nilai " + namaSiswa[i] + ": Matematika = " + nilaiSiswa[i][0] + ", Bahasa Inggris = " + nilaiSiswa[i][1] + ", IPA = " + nilaiSiswa[i][2]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Siswa dengan nama " + namaDicari + " tidak ditemukan.");
        }

        // Jumlah siswa dengan rata-rata di atas 75
        int jumlahSiswaLulus = 0;
        for (double rata : rataRata) {
            if (rata > 75) {
                jumlahSiswaLulus++;
            }
        }
        System.out.println("\nJumlah siswa dengan rata-rata di atas 75: " + jumlahSiswaLulus);

        // Urutkan siswa berdasarkan nilai rata-rata
        for (int i = 0; i < 5 - 1; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (rataRata[i] < rataRata[j]) {
                    // Tukar rata-rata
                    double tempRata = rataRata[i];
                    rataRata[i] = rataRata[j];
                    rataRata[j] = tempRata;

                    // Tukar nama
                    String tempNama = namaSiswa[i];
                    namaSiswa[i] = namaSiswa[j];
                    namaSiswa[j] = tempNama;

                    // Tukar nilai
                    int[] tempNilai = nilaiSiswa[i];
                    nilaiSiswa[i] = nilaiSiswa[j];
                    nilaiSiswa[j] = tempNilai;
                }
            }
        }

        // Tampilkan siswa setelah diurutkan
        System.out.println("\nSiswa setelah diurutkan berdasarkan rata-rata:");
        System.out.printf("%-10s %-10s %-15s %-10s %-10s\n", "Nama", "Matematika", "Bahasa Inggris", "IPA", "Rata-rata");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%-10s %-10d %-15d %-10d %-10.2f\n", namaSiswa[i], nilaiSiswa[i][0], nilaiSiswa[i][1], nilaiSiswa[i][2], rataRata[i]);
        }

        scanner.close();
    }
}
