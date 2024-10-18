/*Buatlah Program Sederhana untuk game RPG untuk simulasi, pemain memiliki health dan attack power, data musuh juga sama. kekuatan pemain berdasarkan input. pertempuran terjadi pada tiap ronde sesuai peraturan.
 * Aturan 1 : Pemain dan Musuh menyerang (Turn Based)
 * Aturan 2 : Dalam tiap serangan, nyawa akan berkurang sesuai attack power musuh.
 * Aturan 3 : Permainan akan selesai jika salah satu pemain atau musuh nyawanya 0
 * Aturan 4 : Jika nyawa pemain dibawah 20% dari total nyawa, akan ada tampilan "Pemain Berada dalam Kondisi Kritis" dan diberikan kesempatan  untuk pemilihan "Melarikan diri" atau "Terus Bertarung"
 * Aturan 5 : Jika Pemain Memilih untuk melanjutkan pertarungan, ronde berikutnya terjadi seperti biasa.
*/

package Minggu8UTS;

import java.util.Scanner;

public class UTSSkasus213 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi data
        System.out.print("Masukkan Nyawa pemain: ");
        int healthPemain = scanner.nextInt();
        System.out.print("Masukkan attack power pemain: ");
        int attackPemain = scanner.nextInt();
        
        String namaMusuh = "Kaijuu";
        int healthMusuh = 150;
        int attackMusuh = 40;
        boolean isRunning = true;

        while (isRunning) {
            // Cek Status
            System.out.println("\nStatus Pertempuran Saat ini :" );
            System.out.println( "Nyawa Pemain = " + healthPemain + ", Serangan = " + attackPemain);
            System.out.println("Nyawa Pemain = " + healthMusuh + ", Serangan = " + attackMusuh);

            // Giliran Pemain untuk Menyerang
            healthMusuh -= attackPemain;
            System.out.println("Pemain menyerang " + namaMusuh + ". Nyawa musuh sekarang: " + healthMusuh);

            // Cek apakah musuh mati
            if (healthMusuh <= 0) {
                System.out.println("Pemain menang!");
                isRunning = false;
                break;
            }

            // Giliran Musuh untuk Menyerang
            healthPemain -= attackMusuh;
            System.out.println("Musuh menyerang pemain, Nyawa pemain sekarang: " + healthPemain);

            // Cek apakah pemain mati
            if (healthPemain <= 0) {
                System.out.println(namaMusuh + " menang!");
                isRunning = false;
                break;
            }

            // Cek kondisi kritis pemain atau berada di 20%
            if (healthPemain <= healthPemain * 0.2) {
                System.out.println("Pemain berada dalam kondisi kritis!");
                System.out.println("Pilihan: ");
                System.out.println("1. Kabur");
                System.out.println("2. LANJUTTTT");
                System.out.print("Pilih: ");
                int pilihan = scanner.nextInt();

                if (pilihan == 1) {
                    System.out.println("Pemain berhasil melarikan diri!");
                    isRunning = false;
                    break;
                }
            }
        }
    }
}

