package Minggu14;
import java.util.Scanner;
public class percobaan2 {
    static int hitungPangkat (int x, int y) {
        if (y==0) {
            return (1);
        } else {
            return (x * hitungPangkat(x, y - 1));
        }
    }
    static void outputDeretPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return;
        } else {
            outputDeretPangkat(x, y - 1); 
            System.out.print("x" + x); 
        }
    }
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int bilangan, pangkat;
    System.out.print("Bilangan yang dihitung : ");
    bilangan = sc.nextInt();
    System.out.print("Pangkat : ");
    pangkat = sc.nextInt();

    outputDeretPangkat(bilangan, pangkat);
    System.out.print(" = " + hitungPangkat(bilangan, pangkat));
    }
    
}
