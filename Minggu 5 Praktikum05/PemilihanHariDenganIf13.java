import java.util.Scanner;

public class PemilihanHariDenganIf13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dayType;
        int dayName;
        System.out.print("Input Day Name : ");
        dayName = sc.nextInt();
    switch (dayName) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            dayType = "Weekday";
            break;
        case 6:
        case 7:
            dayType = "Weekend";
            break;
    
        default:
            dayType = "invalid day name";
    }
    System.out.println("is a " + dayType);
    }

    
}
