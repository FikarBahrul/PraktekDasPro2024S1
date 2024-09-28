import java.util.Scanner;
public class Triathon{
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        //Masukkan Input 

        //Input Deklarasi Durasi, BeratBadan, Ketinggian
        int berlari, berenang, bersepeda, beratBadan, ketinggian;
        
        float kecepatanRataRataLari;
        float kecepatanRataRataRenang;
        float kecepatanRataRataSepeda;

        //Input Koefisien
        float koefisienLari = 0.05f;
        float koefisienRenang = 0.04f;
        float koefisienSepeda = 0.03f;

        //input Durasi, Berat Badan, Kecepatan Rata-Rata
        System.out.print("Durasi Berlari : ");
        berlari = Input.nextInt();
        
        System.out.print("Durasi Berenang : ");
        berenang = Input.nextInt();

        System.out.print("Durasi Bersepeda : ");
        bersepeda = Input.nextInt();
        
        System.out.print("Berat Badan : ");
        beratBadan = Input.nextInt();

        System.out.print("Ketinggian : ");
        ketinggian = Input.nextInt();

        System.out.print("Kecepatan Rata-Rata Lari : ");
        kecepatanRataRataLari = Input.nextFloat();

        System.out.print("Kecepatan Rata-Rata Renang : ");
        kecepatanRataRataRenang = Input.nextFloat();

        System.out.print("Kecepatan Rata-Rata Sepeda : ");
        kecepatanRataRataSepeda = Input.nextFloat();

        //Perhitungan Kalori, Durasi, Rata-Rata, Persen Harian

        //Perhitungan Kalori
        float KaloriLari = (float)(berlari*koefisienLari*beratBadan) + (float)(kecepatanRataRataLari*0.5) + (float)(ketinggian * 0.01);
        float KaloriRenang = (float)(berenang*koefisienRenang*beratBadan) + (float)(kecepatanRataRataRenang*0.5) + (float)(ketinggian * 0.01);
        float KaloriSepeda = (float)(bersepeda*koefisienSepeda*beratBadan) + (float)(kecepatanRataRataSepeda*0.5) + (float)(ketinggian * 0.01);
        float KaloriSemua = KaloriLari + KaloriRenang + KaloriSepeda;

        //Perhitungan Durasi
        float totalDurasi = berlari + berenang + bersepeda;

        //Perhitungan Rata-Rata
        float rataRatakalori = KaloriSemua / totalDurasi;

        //Perhitungan Persentase Harian Kalori
        float targetKaloriHarian = KaloriSemua * 100f;

        //Output

        //Output Durasi
        System.out.println("Total Durasi = "+totalDurasi);

        //Output Kalori
        System.out.println("Kalori Lari = "+KaloriLari);
        System.out.println("Kalori Renang = "+KaloriRenang);
        System.out.println("Kalori Sepeda = "+KaloriSepeda);
        System.out.println("Total Kalori = "+KaloriSemua);

        //Output Rata-Rata Kalori
        System.out.println("Rata-Rata Kalori = "+rataRatakalori);

        //Output Persentasi Kalori Harian
        System.out.println("Persentase Target Kalori Harian = "+targetKaloriHarian );

    }
}