package Minggu10;
import java.util.Scanner;
public class searchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlNilai = sc.nextInt();
        //int [] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int[] arrNilai = new int[jmlNilai];
        //int key = 90;
        //int hasil = 0;
/*
        for (int i = 0; i<arrNilai.length;i++) {
            if (key == arrNilai [i]) {
                hasil = i;
                break;
            }
        }*/
        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        } // Meminta input nilai yang ingin dicari (key)
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = -1;

        // Mencari nilai key di dalam array
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        // Menampilkan hasil pencarian
        System.out.println();
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai Mahasiswa ke-" + (hasil+1));
        } else {
            System.out.println("Nilai " + key + " tidak ditemukan dalam Array.");
        }
        System.out.println();
    }
    
}
