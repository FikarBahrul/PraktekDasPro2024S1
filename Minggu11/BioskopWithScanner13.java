package Minggu11;
import java.util.Scanner;
public class BioskopWithScanner13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int baris, kolom, opsi;
    String nama, next;
    String[][] penonton = new String[4][2];

    /*while (true) {
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan baris : ");
        baris = sc.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom = sc.nextInt();

        penonton[baris - 1][kolom - 1] = nama;

        System.out.print("Input penonton lainnya ? (y/n) : ");
        next = sc.nextLine();
        if (next.equalsIgnoreCase("n")) {d
            break;

        }
    } */
        while (true) {
            //List Menu yang dapat dipilih
            System.out.println("\n Menu (Pilih Opsi 1-3):");
            System.out.println("1. Input data penonton bioskop");
            System.out.println("2. Menampilkan daftar penonton bioskop");
            System.out.println("3. Keluar");
            
            
            //input opsi
            System.out.println("Pilih Menu : ");
            opsi = sc.nextInt();
            sc.nextLine(); //membersihkan Line



            //Opsi 1 adalah Input Data masuk ke Array
            if (opsi == 1) {
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan baris : ");
        baris = sc.nextInt();
        System.out.print("Masukkan kolom : ");
        kolom = sc.nextInt();
        //Check input Data sesuai dengan bangku/kursi bioskop apakah sudah terisi atau belum
        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
            if (penonton[baris - 1][kolom - 1] != null) { //untuk check jika kursi tidak kosong
                System.out.println("Mohon maaf, kursi bioskop tersebut sudah di Order. Silakan pilih kursi lain.");
                } else { //untuk menambah penonton jika kursi kosong
                    penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton " + nama + " berhasil ditambahkan di baris " + baris + " dan kolom kursi bioskop " + kolom);
                }
            } else {
                    System.out.println("Nomor baris atau kolom tidak valid."); //Input pengguna tidak valid
            }
    
        }
            
            
            
            //Opsi 2 adalah Output untuk menampilkan daftar penonton bioskop saat ini.
            else if (opsi == 2) {
                System.out.println("\n Daftar penonton bioskop saat ini : "); {
                    for (int i = 0;i < penonton.length;i++) {
                        for (int j = 0; j < penonton[i].length;j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("[***]\t");
                            } else { 
                                System.out.print(penonton[i][j]+"\t");
                            }
                        }
                        System.out.println();
                    }
                    
                }
               
            }
            
            
            
            //Opsi 3 adalah Output untuk Keluar dari Bioskop
            else if (opsi == 3) {
                System.out.println("Terimakasih sudah order !");
                break;
            } else {
                System.out.println("Opsi yang anda tekan tidak valid, mohon pilih opsi yang benar !");
            }

        }
    }
    
}