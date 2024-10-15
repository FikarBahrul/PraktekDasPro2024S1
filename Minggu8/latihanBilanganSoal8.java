package Minggu8;

public class latihanBilanganSoal8 {
    public static void main(String[] args) {
        int bil1 = 3;
        int bil2 = 5;
        int hasil = 0;

        if (bil2 < 0) {
            System.out.println("Bilangan kedua harus positif.");
            return;
        }

        for (int i = 1; i <= bil2; i++) {
            hasil += bil1;
        }

        System.out.println("Hasil perkalian " + bil1 + " x " + bil2 + " adalah: " + hasil);
    }
}
