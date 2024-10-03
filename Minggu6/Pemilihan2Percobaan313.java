import java.util.Scanner;
public class Pemilihan2Percobaan313 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori ");
        kategori = input13.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = input13.nextInt();
            
        
        //Jika Input adalah Pekerja
        if (kategori.equalsIgnoreCase("pekerja")) {
            // Jika penghasilan lebih dari atau sama dengan 2000000 maka pajak 0.1%
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } 
            // Jika penghasilan > 2000000 dan kurang atau sama dengan 3000000 maka pajak 0.15%
            else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } 
            // Jika penghasilan diatas 3000000 maka pajak 0.2%
            else {
                pajak = 0.2;
            }
        
            // perhitungan gaji bersih
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } 
        
        //Jika Input adalah pebisnis
        else if (kategori.equalsIgnoreCase("pebisnis")) {
            // Jika  kurang dari atau sama dengan 2.500.000 maka pajak 15%
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } 
            // Jika penghasilan lebih dari 2.500.000 dan kurang dari atau sama dengan 3.500.000 maka pajak 20%
            else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } 
            // Jika penghasilan lebih dari 3.500.000 maka pajak 25%
            else {
                pajak = 0.25;
            }
        
            // perhitungan gaji bersih
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih: " + gajiBersih);
        } 
        // Jika kategori bukan pekerja maupun pebisnis
        else {
            System.out.println("Masukkan Kategori Salah");
        }
     }
}

