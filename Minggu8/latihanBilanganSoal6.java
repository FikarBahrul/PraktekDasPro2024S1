package Minggu8;

public class latihanBilanganSoal6 {
    public static void main(String[] args) {
        int bil = 10;
        int limit = 4;

        System.out.print(bil + " ");

        for (int i = 2; i <= limit; i++) {
           
            bil *= 2;
            System.out.print(bil + " ");

            
            bil += 4;
            System.out.print(bil + " ");
        }
    }
}
