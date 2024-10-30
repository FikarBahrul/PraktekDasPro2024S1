package Minggu10;

import java.util.Scanner;

public class tugasArrayKafeDua13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Daftar menu makanan dan Minuman
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        //Input User tentang Makanan dan Minuman
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = sc.nextLine();

        // Mencari nama makanan menggunakan linear search
        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {  // Membandingkan nama dengan tidak memperhatikan huruf besar/kecil
                ditemukan = true;
                break;
            }
        }

        // Output hasil
        if (ditemukan) {
            System.out.println("Makanan " + makananDicari + " tersedia di menu.");
        } else {
            System.out.println("Makanan " + makananDicari + " tidak ada di menu.");
        }

    }
    
}
