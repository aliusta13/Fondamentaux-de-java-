package jour02;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ondalikli bir sayi girin");

        double girilenOndaliklisayi = scanner.nextDouble();

        System.out.println("tam sayi girin");

        int girilenSayibir = scanner.nextInt();

        System.out.println("girdiginiz sayilarin çarpimidir:" +girilenSayibir*girilenOndaliklisayi);
        System.out.println("girdiginiz sayilarin toplamidir"+(girilenSayibir+girilenOndaliklisayi));




    }
}
