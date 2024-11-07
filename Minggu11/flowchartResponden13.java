package Minggu11;
import java.util.Scanner;
    public class flowchartResponden13{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //TAHAP 1 Inisialisasi dan Deklarasi
            // Deklarasi variabel
            int jumlahResponden, jumlahPertanyaan;
            double[][] arrayContainer;
            double[] rata2Pertanyaan;
            double[] rata2Responden;
            double rata2Keseluruhan = 0;
            int nilai;

            jumlahResponden = 10;
            jumlahPertanyaan = 6;
    
            // Inisialisasi array
            arrayContainer = new double[10][6];
            rata2Pertanyaan = new double[6];
            rata2Responden = new double[10];
    
            // Input nilai
            System.out.println("\nInput Nilai (harus 1 hingga 5)");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("Masukkan nilai untuk responden ke-" + (i+1) + ", pertanyaan ke-" + (j+1) + ": ");
                     nilai = scanner.nextInt();
    
                    // Validasi input
                    while (nilai < 1 && nilai <= 5) {
                        System.out.println("Nilai yang Anda masukkan tidak sesuai (harus 1 hingga 5)");
                    }
    
                    // Simpan nilai ke dalam array
                    arrayContainer[i][j] = nilai;
                }
            }
            //TAHAP 2 Perhitungan rata-rata
            
            // Hitung rata-rata per responden
            for (int i = 0; i < 10; i++) {
                rata2Responden[i] = 0;
                for (int j = 0; j < 6; j++) {
                    rata2Responden[i] =rata2Responden[i] + arrayContainer[i][j];
                }
                rata2Responden[i] = rata2Responden[i] / 6;
                rata2Keseluruhan = rata2Keseluruhan + rata2Responden[i];
            }

            // Hitung rata-rata per pertanyaan
            for (int j = 0; j < 6; j++) {
                rata2Pertanyaan[j] = 0;
                for (int i = 0; i < 10; i++) {
                    rata2Pertanyaan[j] += arrayContainer[i][j];
                }
                rata2Pertanyaan[j] = rata2Pertanyaan[j] / 10;
                rata2Keseluruhan = rata2Keseluruhan + rata2Responden[j];
            }
    
    
            // Hitung rata-rata keseluruhan
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 6; j++) {
                    rata2Keseluruhan = rata2Keseluruhan + arrayContainer[i][j];
                }
            }
            rata2Keseluruhan = rata2Keseluruhan/10;
            //Revisi
            //rata2Keseluruhan = rata2Keseluruhan/(10*6);
            //TAHAP 3 Output data
            System.out.println("\nOutput Data:");
    
            // Output Rata-rata nilai per pertanyaan
            int j = 0;
            while (j < jumlahPertanyaan) {
                System.out.println("Rata-rata nilai pertanyaan ke-" + (j+1) + " adalah " + rata2Pertanyaan[j]);
                j++;
            }
    
            // Output Rata-rata nilai per responden
            int i = 0;
            while (i < jumlahResponden) {
                System.out.println("Rata-rata nilai responden ke-" + (i+1) + " adalah " + rata2Responden[i]);
                i++;
            }
    
            // Rata-rata nilai keseluruhan
            System.out.println("Rata-rata nilai keseluruhan adalah " +rata2Keseluruhan);
        }
    }


