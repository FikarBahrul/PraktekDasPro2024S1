import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20 + nilaiTugas * 0.15 + nilaiUTS * 0.30 + nilaiUAS * 0.35);

        System.out.println("Nama : " + nama +" NIM : " + nim);
        System.out.println("Kelas : " + kelas +"Absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiAkhir); 

        if (nilaiAkhir>=80 && nilaiAkhir<=100) {
            System.out.println("Nilai A, setara 4");
            System.out.println("Kualifikasi Sangat Baik");
        } else if 
            (nilaiAkhir>=73 && nilaiAkhir<=80) {
                System.out.println("Nilai B+, setara 3,5");
                System.out.println("Lebih dari Baik");
            }else if 
            (nilaiAkhir>=65 && nilaiAkhir<=73) {
                    System.out.println("Nilai B, setara 3");
                    System.out.println("Baik"); 
            }else if 
            (nilaiAkhir>=60 && nilaiAkhir<=65) {
                System.out.println("Nilai C+, setara 2,5");
                System.out.println("Lebih dari Cukup"); 
            }else if 
            (nilaiAkhir>=50 && nilaiAkhir<=60) {
                    System.out.println("Nilai C, setara 2");
                    System.out.println("Cukup"); 
            }else if 
            (nilaiAkhir>=39 && nilaiAkhir<=50) {
                    System.out.println("Nilai D, setara 1");
                    System.out.println("Kurang"); 
            }else if 
            (nilaiAkhir<=39) {
                    System.out.println("Nilai E, setara 0");
                    System.out.println("Gagal"); 
            }else {System.out.println("Nilai anda tidak valid");
            }

    
    }
}
