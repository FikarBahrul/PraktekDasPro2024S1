package Minggu13;
import java.util.Scanner;
public class percobaan613 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang : ");
        p = input.nextInt();
        System.out.println("Masukkan Lebar : ");
        l = input.nextInt();
        System.out.println("Masukkan tinggi : ");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi panjang adalah "+L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Persegi panjang adalah "+vol);
    }
    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    
    static int hitungVolume (int tinggi,int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
}
