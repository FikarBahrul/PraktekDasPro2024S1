import java.util.Scanner;
public class Kafe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu;
        char ukuranCup;
        int jumlah;
        boolean keanggotan;

        System.out.println("Masukkan Menu : ");
        menu = sc.nextLine();
        System.out.println("Masukkan ukuran cup : ");
        ukuranCup = sc.next().charAt(0);
        System.out.println("Masukkan Jumlah : ");
        jumlah = sc.nextInt();
        System.out.println("Masukkan keanggotaan (true/false) : ");
        keanggotan = sc.nextBoolean();

        double hargaMenu = 0;

        switch (menu.toLowerCase()){
            case "kopi" :
                hargaMenu = 12000;
                break;
            case "teh" :
                hargaMenu = 7000;
                break;
            case "coklat" :
                hargaMenu = 20000;
                break;

            


        }
        double totalHarga = hargaMenu * jumlah;

        switch (ukuranCup){
            case 'S':
            break;
            case 'M':
            totalHarga += 0.25 *totalHarga;
            break;
            case 'L':
            totalHarga += 0.4 * totalHarga;
            break;
            default:
            System.out.println("Size yang dipilih tidak tersedia");
        }
        double diskon = keanggotan ? 0:0.1;
        double nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian : " + jumlah + menu + " dengan ukuran cup" + ukuranCup); 
        System.out.println("Nominal bayar : " + nominalBayar);
    }
    
}
