package Minggu8;
import java.util.Scanner;
public class latihanBilanganSoal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        double faktorial = 1;
        System.out.print("Masukkan nilai : ");
        n = sc.nextInt();

        for ( i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println("Nilai Faktorial dari " + n + " adalah: " + faktorial);
    }
}
