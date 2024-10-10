package Minggu7;
import java.util.Scanner;

public class Bioskop13 {
    public static void main(String[] args) {
        //Input Scanner
        Scanner sc = new Scanner(System.in);
       //Deklarasi TipeData
        int jmlTiket, totalTiket=0, hargaTiket,totalHarga=0,diskon=0;
        char tanggapan = 'y';

        while (tanggapan == 'y') {
            System.out.print("Masukkan Jumlah Tiket = ");
            jmlTiket = sc.nextInt();
            //Pengkategorian Tiket berisikan diskon
            if (jmlTiket <= 0) {
                System.out.println("Input anda Invalid");
                continue;
            } else if (jmlTiket > 10) {
                diskon = (int) (0.15 * 50000);
            }else if (jmlTiket > 4) {
                diskon = (int) (0.1 * 50000);
            } else {
                diskon = 0;
            }
            //Perhitungan Keseluruhan
            hargaTiket = (50000 - diskon) * jmlTiket;
            totalTiket = totalTiket * jmlTiket;
            totalHarga = totalHarga * hargaTiket;
            //Output
            System.out.print("ingin memesan kembali ? (y/n) = ");
            tanggapan = sc.next().charAt(0);
        }
    }
}
