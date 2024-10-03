import java.util.Scanner;
public class TokoSepatu13 {
    public static void main(String[] args) {
        //Scanner Baru
        Scanner sc = new Scanner(System.in);
        //Deklarasi Variabel
        String merk, kategori, ukuran;
        int harga = 0;

        //Input
        System.out.println("Masukkan Merk = ");
        merk = sc.nextLine();
        System.out.println("Masukkan Kategori = ");
        kategori = sc.nextLine();
        System.out.println("Masukkan Ukuran = ");
        ukuran = sc.nextLine();

        //Jika Converse
        switch (merk) {
            case "Converse":
                
        switch (kategori) {
                    
            case "Slip On":
        if (ukuran.equals("36-40")) {
            harga = 800000;
        }
        break;
            case "High Top":
        if (ukuran.equals("40-44")) {
            harga = 1200000;
        }
        break;
        }
        //Jika Sketcher
        switch (merk) {
            case "Sketcher":
            
        switch (kategori) {       
                case "Woman":
        if (ukuran.equals("36-41")) {
                harga = 1000000;
        }
        break;
                case "Man":
        if (ukuran.equals("41-44")) {
                harga = 1800000;
            }
        break;
        }
        //Jika Nike
        switch (merk) {
            case "Nike":
            
        switch (kategori) {       
                case "Kids":
        if (ukuran.equals("36-40")) {
                harga = 750000;
        }
        break;
                case "Adult":
        if (ukuran.equals("40-44")) {
                harga = 1500000;
            }
        break;
        //Jika Input tidak valid
        default:
                System.out.println("Merk sepatu Invalid.");
        }

        if (harga != 0) {
            System.out.println("Harga sepatu = " + harga);
        } else {
            System.out.println("Invalid");
        }
    }
}
        }
    }
}