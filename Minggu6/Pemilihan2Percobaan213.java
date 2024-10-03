import java.util.Scanner;
public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        String menu, member;
        int jumlah_beli,total_bayar;
        int harga = 0;
        String metodePembayaran;

        System.out.println("Member (y/n): ");
        member = input13.nextLine();
        System.out.println("Masukkan Metode Pembayaran : ");
        metodePembayaran = input13.nextLine();

        System.out.println("==================================");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("==================================");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.print("Masukkan angka dari menu yang dipilih = ");

int pilihan_menu = input13.nextInt();
input13.nextLine();
        System.out.println("==================================");
        
        // Memeriksa apakah pelanggan adalah member
if (member.equalsIgnoreCase("y")) {
    // Jika member diberikan diskon 10%
    double diskon = 0.10;
    System.out.println("Besar diskon = 10%");

    // harga berdasarkan pilihan menu
    if (pilihan_menu == 1) {
         harga = 14000;
        System.out.println("Harga ricebowl = " + harga);
    } else if (pilihan_menu == 2) {
         harga = 3000;
        System.out.println("Harga ice tea = " + harga);
    } else if (pilihan_menu == 3) {
         harga = 15000;
        System.out.println("Harga bundling = " + harga);
    } else {
        System.out.println("Masukkan pilihan menu dengan benar!");
        return; // Keluar dari program jika pilihan menu salah
    }

    // Menghitung total bayar setelah diskon
    total_bayar = (int)(harga - (harga * diskon));
    if (metodePembayaran.equalsIgnoreCase("QRIS"))
        harga = harga - 1000;
    System.out.println("Total bayar setelah diskon = " +total_bayar);
        
}
else if (member.equalsIgnoreCase("n")) {
    if (pilihan_menu == 1) {
        harga = 14000;
        System.out.println("Harga ricebowl =" + harga);
        
    } if (pilihan_menu == 2) {
        harga = 3000;
        System.out.println("Harga ice tea =" + harga);

    } if (pilihan_menu == 3) {
        harga = 15000;
        System.out.println("Harga bundling =" + harga);

    } else {
        System.out.println("Masukkan pilihan menu yang benar");
        return; 
    }
    //Menghitung total bayar
    System.out.println("Total bayar = " + harga);

} else {
    System.out.println("Member tidak valid");
}
System.out.println("-----------------------------------");
    }
} 