package jour02;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("diktortgenin uzun kenar uzunlugunu giriniz");
        double uzunKenar = scanner.nextDouble();

        System.out.println("lutfen kisa kenar uzunlugunu giriniz");
        double kisaKenar = scanner.nextDouble();

        System.out.println("diktortgenin alani:"+uzunKenar*kisaKenar );



    }
}
