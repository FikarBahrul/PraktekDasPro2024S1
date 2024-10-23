package Minggu9;
import java.util.Scanner;
public class persegiAngka13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n-1 || j == 0 || j == n-1) {
                    System.out.print(n+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
