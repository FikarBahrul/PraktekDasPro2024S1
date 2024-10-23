package Minggu9;
import java.util.Scanner;
public class porseni13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah politeknik yang ikut
        System.out.print("Masukkan jumlah politeknik yang akan berpartisipasi dalam porseni: ");
        int jmlPoliteknik = scanner.nextInt();
        scanner.nextLine();

        // Loop untuk memasukkan data setiap politeknik
        for (int i = 0; i < jmlPoliteknik; i++) {
            System.out.println("\nPoliteknik ke-" + (i + 1) + ":");

            // Cabang olahraga 1: Badminton
            System.out.println("Cabang olahraga: Badminton");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                String namaAtlet = scanner.nextLine();
                System.out.println("Atlet ke-" + (j + 1) + ": " + namaAtlet);
            }

            // Cabang olahraga 2: Tenis Meja
            System.out.println("Cabang olahraga: Tenis Meja");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                String namaAtlet = scanner.nextLine();
                System.out.println("Atlet ke-" + (j + 1) + ": " + namaAtlet);
            }

            // Cabang olahraga 3: Basket
            System.out.println("Cabang olahraga: Basket");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                String namaAtlet = scanner.nextLine();
                System.out.println("Atlet ke-" + (j + 1) + ": " + namaAtlet);
            }

            // Cabang olahraga 4: Bola Voli
            System.out.println("Cabang olahraga: Bola Voli");
            for (int j = 0; j < 5; j++) {
                System.out.print("Masukkan nama atlet ke-" + (j + 1) + ": ");
                String namaAtlet = scanner.nextLine();
                System.out.println("Atlet ke-" + (j + 1) + ": " + namaAtlet);
            }
        }

    }
}
