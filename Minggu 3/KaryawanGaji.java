import java.util.Scanner;

public class KaryawanGaji {

    public static void main(String[] args) {
        //Input DurasiKerja, UpahKerja, PersenBonus dan Persen Pajak.
        int durasiKerja,upahPerJam;
        float persenBonusKerja = 0.1f, persenPajak = 0.05f;
        
        Scanner kG = new Scanner(System.in);
        System.out.print("Durasi Kerja Karyawan : ");
        durasiKerja = kG.nextInt();
        System.out.print("Upah Karyawan Per Jam : ");
        upahPerJam = kG.nextInt();
        int totalGaji = upahPerJam*durasiKerja;
        
        //Perhitungan Bonus, Total Gaji setelah mendapat bonus, PajakKerja, dan Gaji Bersih.
        float Bonus = persenBonusKerja*totalGaji;
        int totalGajidenganBonus = totalGaji + (int)Bonus;
        float pajakKerja = persenPajak*totalGajidenganBonus;
        int gajiBersihKaryawan = totalGajidenganBonus - (int)pajakKerja;

        //Output
        System.out.println("Total Gaji Karyawan = " + totalGaji);
        System.out.println("Bonus Karyawan = "+Bonus);
        System.out.println("Total Gaji beserta Bonus Karyawan = " + totalGajidenganBonus);
        System.out.println("Pajak Karyawan = "+pajakKerja);
        System.out.println("Gaji Bersih Karyawan = "+gajiBersihKaryawan);
    }
}