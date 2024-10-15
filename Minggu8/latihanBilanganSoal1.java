package Minggu8;
import java.util.Scanner;

public class latihanBilanganSoal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,i;
        System.out.print("Masukkan nilai : ");
        n = scanner.nextInt();

        for (i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}