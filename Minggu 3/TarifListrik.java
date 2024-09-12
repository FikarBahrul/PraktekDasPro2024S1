import java.util.Scanner;

public class TarifListrik {
    public static void main(String[] args) {
        //Buat Scanner tarif Listrik
        Scanner tl = new Scanner(System.in);
        //Masukkan Input
        double jmlPenggunaanKwh = tl.nextDouble();
        double tarifPerKwh = (double)500;
        //Perhitungan
        double totalTagihan = jmlPenggunaanKwh * tarifPerKwh;
        boolean melebihi500Kwh = jmlPenggunaanKwh > 500;
        //Output yang dihasilkan
        System.out.println("Total Tagihan Listrik : Rp."+ totalTagihan);
        System.out.println("Apakah jumlah penggunaan melebihi 500 Kwh ? " +melebihi500Kwh);
    }    
}