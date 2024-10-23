package Minggu9;
import java.util.Scanner;
public class star13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print("*");
        }

    }
}
