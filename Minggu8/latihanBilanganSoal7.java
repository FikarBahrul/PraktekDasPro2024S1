package Minggu8;

public class latihanBilanganSoal7 {
    public static void main(String[] args) {
        int batas = 10;
        int bil1 = 1, bil2 = 1;
        int hasil;

        System.out.print(bil1 + " " + bil2 + " ");

        for (int i = 3; i <= batas; i++) {
            hasil = bil1 + bil2;
            System.out.print(hasil + " ");
            bil1 = bil2;
            bil2 = hasil;
        }
}
}