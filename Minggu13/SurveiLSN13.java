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
public class SurveiLSN13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah daerah dan program
        System.out.print("Masukkan jumlah daerah : ");
        int jmlDaerah = scanner.nextInt();
        System.out.print("Masukkan jumlah program : ");
        int jmlProgram = scanner.nextInt();

        // Deklarasi array
        String[] namaDaerah = new String[jmlDaerah];
        String[] namaProgram = new String[jmlProgram];
        int[][] kepuasan = new int[jmlDaerah][jmlProgram];
        double[] rataProgram = new double[jmlProgram];
        String[] programFavoritDaerah = new String[jmlDaerah];

        // Input nama program yang anda tambahkan 
        System.out.println("\nMasukkan nama program : ");
        for (int i = 0; i < jmlProgram; i++) {
            System.out.print("Program ke-" + (i + 1) + " : ");
            namaProgram[i] = scanner.next();
        }

        // Input data survei
        System.out.println("\nMasukkan data kepuasan untuk setiap daerah : ");
        for (int i = 0; i < jmlDaerah; i++) {
            System.out.print("Nama daerah ke-" + (i + 1) + " : ");
            namaDaerah[i] = scanner.next();
            for (int j = 0; j < jmlProgram; j++) {
                System.out.print("Nilai Rating kepuasan untuk program " + namaProgram[j] + " (1-5) : ");
                int nilaiRating;
                
                //Prasyarat agar rating memiliki range antara 1-5
                while (true) {
                    nilaiRating = scanner.nextInt();
                    if (nilaiRating >= 1 && nilaiRating <= 5) {
                        break;
                    } else {
                        System.out.print("Nilai Rating harus antara 1-5. Masukkan ulang : ");
                    }
                }
                kepuasan[i][j] = nilaiRating;  //memasukkan hasil Rating ke dalam Array
            }
        }

        //tabel hasil survei
        System.out.println("\nTabel Hasil Survei:");
        System.out.printf("%-15s", "Daerah"); //untuk posisi string format
        for (String program : namaProgram) { //For Each
            System.out.printf("%-10s", program); //untuk posisi string format
        }
        System.out.println(); //membersihkan Line
        for (int i = 0; i < jmlDaerah; i++) {
            System.out.printf("%-15s", namaDaerah[i]); //untuk posisi string format
            for (int j = 0; j < jmlProgram; j++) {
                System.out.printf("%-10d", kepuasan[i][j]); //untuk posisi decimal format
            }
            System.out.println(); //membersihkan Line
        }

        // menghitung rata-rata kepuasan per program
        for (int j = 0; j < jmlProgram; j++) {
            int total = 0;
            for (int i = 0; i < jmlDaerah; i++) {
                total += kepuasan[i][j];
            }
            rataProgram[j] = (double) total / jmlDaerah; //menghitung rata-rata dan mengganti tipedata agar dapat masuk kedalam array
        }

        // menentukan daerah dengan nilaiRating kepuasan tertinggi untuk setiap program
        String[] daerahTertinggi = new String[jmlProgram];
        for (int j = 0; j < jmlProgram; j++) {
            int maxnilaiRating = kepuasan[0][j];
            daerahTertinggi[j] = namaDaerah[0];
            for (int i = 1; i < jmlDaerah; i++) {
                if (kepuasan[i][j] > maxnilaiRating) {
                    maxnilaiRating = kepuasan[i][j];
                    daerahTertinggi[j] = namaDaerah[i];
                }
            }
        }

        // menentukan program favorit untuk setiap daerah
        for (int i = 0; i < jmlDaerah; i++) {
            int maxnilaiRating = kepuasan[i][0];
            programFavoritDaerah[i] = namaProgram[0];
            for (int j = 1; j < jmlProgram; j++) {
                if (kepuasan[i][j] > maxnilaiRating) {
                    maxnilaiRating = kepuasan[i][j];
                    programFavoritDaerah[i] = namaProgram[j];
                }
            }
        }

        // Tampilan Deskripsi Analisis dari Survei
        System.out.println("\nAnalisis Hasil dari Survei : ");
        for (int j = 0; j < jmlProgram; j++) {
            System.out.printf("Rata-rata kepuasan untuk program %-5s : %.2f\n", namaProgram[j], rataProgram[j]);
        }
        for (int j = 0; j < jmlProgram; j++) {
            System.out.printf("Daerah dengan kepuasan tertinggi untuk program %-5s : %s\n", namaProgram[j], daerahTertinggi[j]); 
        }
        for (int i = 0; i < jmlDaerah; i++) {
            System.out.printf("Program favorit daerah %-5s : %s\n", namaDaerah[i], programFavoritDaerah[i]);
        }
    }
}

