public class bilanganTerbesar13 {
    public static void main(String[] args) {
        int bil1 = 28, bil2 =54, bil3 = 15;
        int bilMax;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                bilMax = bil1;
            } else {
                bilMax = bil3;
            }
        } else {
            if (bil2 > bil3) {
                bilMax = bil2;
            } else {
                bilMax = bil3;
            }
        }
        System.out.println("Bilangan terbesar adalah : " + bilMax);
    }
}