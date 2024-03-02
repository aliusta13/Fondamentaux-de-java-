package jour02;

import java.util.Scanner;

public class C05_Scanner {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("isminiz:");
        char isminIlkHarfi = scanner.nextLine().charAt(0);

        System.out.println("soy isminiz:");
        String soyisim = scanner.nextLine();

        System.out.println("yasiniz:");
        int yas = scanner.nextInt();

        System.out.println( isminIlkHarfi + " "+ soyisim+ ", "+ yas);


    }


}
