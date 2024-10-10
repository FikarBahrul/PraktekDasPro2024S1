package Minggu7;
import java.util.Scanner;
public class TempatParkir13 {
    public static void main(String[] args) {
        //input Scanner
        Scanner sc = new Scanner(System.in);
        //Deklarasi TipeData
        int jenis, durasi, total=0;
        //Input Kendaraan beserta Pengulangan
        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Batal) = ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi Parkir (jam) : ");
                durasi = sc.nextInt();
                
                int tarifPerJam = jenis == 1 ? 3000 : 2000;
                total += durasi <= 5 ? durasi * tarifPerJam : 12500;
            }
            //Titik Stop
        } while (jenis != 0);
        //Output
        System.out.println("Total Bayar Parkiran = Rp. "+ total);
    }
}

