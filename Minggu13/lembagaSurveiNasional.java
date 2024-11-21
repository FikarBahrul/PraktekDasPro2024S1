/*Lembaga Survei Nasional (LSN) sedang melakukan survei untuk mengukur tingkat kepuasan masyarakat terhadap beberapa program pemerintah, seperti infrastruktur, kesehatan, dan pendidikan.
Survei dilakukan di berbagai daerah, dengan nilai kepuasan dalam rentang antara 1-5 untuk setiap program di daerah masing-masing.
LSN membutuhkan sistem untuk mencatat dan menganalisis data survei ini.
Sistem ini harus dapat mencatat nilai kepuasan untuk setiap program di setiap daerah, menampilkan tabel hasil survei dengan nilai rata-rata kepuasan , serta menghitung rata-rata kepuasan untuk setiap program di semua daerah.
selain itu, LSN ingin mengetahui daerah mana yang memberikan nilai kepuasan tertinggi untuk masing-masing program.
Anda diminta untuk membuat program sederhana  yang :
memungkinkan pengguna memasukkan data hasil survei
menampilkan tabel hasil kepuasan.
menghitung rata-rata kepuasan per program.
menentukan daerah dengan nilai kepuasan tertinggi untuk setiap program.
mementukan program favorit dari setiap daerah. 
*/
package Minggu13;
import java.util.Scanner;
public class lembagaSurveiNasional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
           // Input Jumlah Jenis Barang dan Lokasi Penyimpanan
           System.out.print("Masukkan jumlah masyarakat : ");
           int jmlMasyarakat = scanner.nextInt();
           System.out.print("Masukkan jumlah lokasi penyimpanan : ");
           int jmlTempat = scanner.nextInt();
           scanner.nextLine(); // Membersihkan Line
   
           //1. Inisialisasi array 2 dimensi
           int[][] survei = new int[jmlMasyarakat][jmlTempat];
           //2. Inisialisasi array 1 dimensi
           String[] namaKota = new String[jmlTempat];
   
           // Input Nama Kota
           for (int i = 0; i < namaKota.length; i++) {
               System.out.print("Kota untuk lokasi " + (i + 1) + " : ");
               namaKota[i] = scanner.nextLine();
           }
   
           System.out.println("\nMengisi rating...");
           for (int i = 0; i < 3; i++) { 
               System.out.print("Masyarakat (0-" + (jmlMasyarakat - 1) + ") : ");
               int indeksRating = scanner.nextInt();
               System.out.print("Lokasi (0-" + (jmlTempat - 1) + ") : ");
               int indeksKota = scanner.nextInt();
               System.out.print("Input Nilai kepuasan (harus 1 hingga 5 : ");
               int jmlRating = scanner.nextInt();
               scanner.nextLine(); // Membersihkan Line
   
               survei[indeksRating][indeksKota] += jmlRating;
           }
   
           System.out.println("\nTabel Survei : ");
           System.out.print("      ");
           for (String kota : namaKota) {
               System.out.print(kota + "    ");
           }
           System.out.println();
   
           for (int i = 0; i < survei.length; i++) {
               System.out.print("Rating " + (i + 1) + " :   ");
               for (int j = 0; j < survei[i].length; j++) {
                   System.out.print(survei[i][j] + "       ");
               }
               System.out.println();
           }
   
           System.out.println("\nTotal survei untuk setiap jenis barang : ");
           for (int i = 0; i < survei.length; i++) {
               int totalsurvei = 0;
               for (int j = 0; j < survei[i].length; j++) {
                   totalsurvei += survei[i][j];
               }
               System.out.println("Rating ke-" + (i + 1) + " : " + totalsurvei);
           }
   

           System.out.println("\nLokasi dengan stok terbanyak untuk setiap jenis barang : ");
           for (int i = 0; i < survei.length; i++) {
               int surveiMax = 0;
               int indeksKotaMax = -1;
               for (int j = 0; j < survei[i].length; j++) {
                   if (survei[i][j] > surveiMax) {
                       surveiMax = survei[i][j];
                       indeksKotaMax = j;
                   }
               }
               if (indeksKotaMax != -1) {
                   System.out.println("Jenis barang ke-" + (i + 1) + " : " + namaKota[indeksKotaMax]);
               } else {
                   System.out.println("Jenis barang ke-" + (i + 1) + " : Tidak ada stok");
               }
           }
   
    }
 
}
