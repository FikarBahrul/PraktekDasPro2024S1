package Minggu10;
import java.util.Scanner;
public class tugasArrayKafeSatu13 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int jmlOrder,totalBiaya=0;
     //Order Pesanan
     System.out.print("Masukkan jumlah Pesanan anda : ");
     jmlOrder = sc.nextInt();
     sc.nextLine(); //untuk "membersihkan" karakter yang tersisa.

     //Array untuk simpan order pesanan dan harga
     String [] namaOrderan = new String[jmlOrder];
     int [] hargaOrder = new int [jmlOrder];

     //Nama dan Harga tiap makanan
     for (int i = 0; i < jmlOrder; i++) {
        System.out.print("Masukkan nama Pesanan ke-" + (i + 1) + ": ");
        namaOrderan[i] = sc.nextLine();

        System.out.print("Masukkan harga untuk " + namaOrderan[i] + ": ");
        hargaOrder[i] = sc.nextInt();
        sc.nextLine(); //Untuk "membersihkan" karakter yang tersisa.
     }
     //Hitungan total biaya
     for (int i = 0; i < jmlOrder; i++) {
        totalBiaya += hargaOrder[i];
    }
    // Menampilkan daftar pesanan dan total biaya
    System.out.println("Daftar Pesanan:");
    for (int i = 0; i < jmlOrder; i++) {
        System.out.println((i + 1) + ". " + namaOrderan[i] + " - Rp." + hargaOrder[i]);
    }
    //Menampilkan total biaya
    System.out.println("Total biaya: Rp." + totalBiaya);
    }

}
