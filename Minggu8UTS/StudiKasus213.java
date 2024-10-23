/*Buatlah Program Sederhana untuk game RPG untuk simulasi, pemain memiliki health dan attack power, data musuh juga sama. kekuatan pemain berdasarkan input. pertempuran terjadi pada tiap ronde sesuai peraturan.
 * Aturan 1 : Pemain dan Musuh menyerang (Turn Based)
 * Aturan 2 : Dalam tiap serangan, nyawa akan berkurang sesuai attack power musuh.
 * Aturan 3 : Permainan akan selesai jika salah satu pemain atau musuh nyawanya 0
 * Aturan 4 : Jika nyawa pemain dibawah 20% dari total nyawa, akan ada tampilan "Pemain Berada dalam Kondisi Kritis" dan diberikan kesempatan  untuk pemilihan "Melarikan diri" atau "Terus Bertarung"
 * Aturan 5 : Jika Pemain Memilih untuk melanjutkan pertarungan, ronde berikutnya terjadi seperti biasa.
*/
//PROTOTYPE GAGAL
package Minggu8UTS;

import java.util.Scanner;
public class StudiKasus213 {
    public static void main(String[] args) {
        //import Scanner
        Scanner sc = new Scanner(System.in);
        //Deklarasi
        int nyawaPlayer=0,nyawaMusuh=0,kekuatanSerangPemain=0,kekuatanSerangMusuh=0, i=1;
        boolean isRunning = true;
        String kabur;
        //input
        System.out.print("Masukkan Nyawa Awal Pemain : ");
        nyawaPlayer = sc.nextInt();
        System.out.print("Masukkan Nyawa Awal Musuh : ");
        nyawaMusuh = sc.nextInt();
        System.out.print("Kekuatan Serang Pemain : ");
        kekuatanSerangPemain = sc.nextInt();
        System.out.print("Kekuatan Serang Musuh : ");
        kekuatanSerangMusuh = sc.nextInt();

        do {  
            
            System.out.println("===Ronde "+ i++ +"===");
            //Pemain Nyerang
            if (nyawaPlayer > nyawaMusuh) {
                 nyawaMusuh = (nyawaMusuh-kekuatanSerangPemain);
                System.out.println("Pemain Menyerang !!! Nyawa musuh tersisa : " +nyawaMusuh);
                continue;
            //Musuh Nyerang
            } if (nyawaPlayer < nyawaMusuh) {
                 nyawaPlayer = (nyawaPlayer-kekuatanSerangMusuh);
                System.out.println("Musuh Menyerang !!! Nyawa Pemain tersisa : "+nyawaPlayer);
                continue;
            }
            //Nyawa Pemain 20%
            if (nyawaPlayer >= ((int)0.2f*nyawaPlayer)){
                System.out.println("Pemain ada di Kondisi Kritis");
                System.out.println("Apakah anda ingin kabur? (ya/tidak) : ");
                kabur = sc.nextLine();
                if (kabur.equalsIgnoreCase("ya")) {
                    break;
                    
                }
            }
                
        } while(true);
    }
}
