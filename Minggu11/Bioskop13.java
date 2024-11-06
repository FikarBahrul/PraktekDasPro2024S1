package Minggu11;

public class Bioskop13 {
    public static void main(String[] args) {
        String [][] penonton = new String[4][2];
        penonton [0][0] ="Amin";
        penonton [0][1] ="Bena";
        penonton [1][0] ="Candra";
        penonton [1][1] = "Dela";
        penonton [2][0] = "Eka";
        penonton [2][1] = "Farhan";
        penonton [3][0] = "Gisel";
        //Nomor 3, Menambah Penonton Hana
        penonton [3][1] = "Hana";
        System.out.println("\n Output.");


        System.out.printf("%s \t %s \n",penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n",penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n",penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n",penonton[3][0], penonton[3][1]);

        //Nomor 4, Modifikasi Penambahan Array Length
        System.out.println("\n Nomor 4.");
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        //Nomor 5, Modifikasi Penambahan For Loop
        System.out.println("\n Nomor 5.");
        System.out.println(penonton.length);
        for (int i = 0; i<penonton.length;i++) {
            System.out.println("Panjang baris ke-"+(i+1)+": "+penonton[i].length);
        }
        
        //Nomor 6, Modifikasi Penambahan ForEach Loop
        System.out.println("\n Nomor 6.");
        System.out.println(penonton.length);
        for (String[] barisPenonoton : penonton){
            System.out.println("Panjang baris : "+barisPenonoton.length);
        }
        //Nomor 7, Modifikasi Penambahan Output Nama Penonton Pada baris 3
        System.out.println("\n Nomor 7.");
        System.out.println("Penonton pada baris ke-3 : ");
        for (int i = 0; i < penonton [2].length; i++) {
            System.out.println(penonton [2][i]);
        }
        //Nomor 8, Modifikasi Penambahan1 Perulangan ForEach Loop
        System.out.println("\n Nomor 8.");
        for (String i : penonton[2]){
            System.out.println(i);
        }
        //Nomor 9, Modifikasi Penambahan Output Penonton setiap baris
        System.out.println("\n Nomor 9.");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-"+(i+1)+" : "+String.join(", "));
        }
        


        
    }
    
}
