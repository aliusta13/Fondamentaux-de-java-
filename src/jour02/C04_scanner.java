package jour02;

import java.util.Scanner;

public class C04_scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("isminiz:");
        String isim = scanner.next();

        System.out.println("soy isminiz:");
        String soyisim = scanner.next();

        System.out.println("yasiniz:");
        int yas = scanner.nextInt();

        System.out.println( "isminiz:" + isim +
                "\nsoyisminiz:" + soyisim +
                "\nyasiniz:" + yas +
                "\nkaydiniz basari ile tamamlanmistir");

    }



}
