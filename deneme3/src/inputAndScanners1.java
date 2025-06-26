import java.util.Scanner;

public class inputAndScanners1 {
    public static void main(String[] args){
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);

        String scannedString = sc.next();
        System.out.println(scannedString);

        int scannedInt = sc.nextInt();
        System.out.println(scannedInt);

        boolean scannedBoolean = sc.nextBoolean();
        System.out.println(scannedBoolean);

        double scannedDouble = sc.nextDouble();
        System.out.println(scannedDouble);

        String scanned = sc.next();
        int x = Integer.parseInt(scanned);

    }
}