import java.util.Scanner;
public class tokoBuku13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jenis buku (kamus, novel, atau lainnya): ");
        String jenisBuku = sc.nextLine();

        System.out.print("jumlah buku yang akan anda beli : ");
        int jmlBuku = sc.nextInt();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 10;
            if (jmlBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 7;
            if (jmlBuku > 3) {
                diskon += 2;
            } else {
                diskon += 1;
            }
        } else {
            if (jmlBuku > 3) {
                diskon = 5;
            }
        }

        System.out.println("Diskon yang anda peroleh adalah " + diskon + "% !!!");
    }
}