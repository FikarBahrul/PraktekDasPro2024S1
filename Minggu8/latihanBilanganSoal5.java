package Minggu8;

public class latihanBilanganSoal5 {
    public static void main(String[] args) {
        int batas = 8;
        int bil = 3;
        int hasilSebelumnya = 1;

        System.out.print(bil + " ");
        for (int i = 1; i < batas; i++) {
            bil += hasilSebelumnya;
            System.out.print(bil + " ");
            hasilSebelumnya += 2;
        }
    }
}
