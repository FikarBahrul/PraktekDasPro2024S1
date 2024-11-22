package Minggu13;
import java.util.Scanner;
public class hitungTotalHarga13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan : ");
        int PilihanMenu = sc.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan : ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(PilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan anda : "+ totalHarga);
        
    }
    public static int hitungTotalHarga(int PilihanMenu, int banyakItem) {
        int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[PilihanMenu-1] * banyakItem;
        return hargaTotal;
    }
}
