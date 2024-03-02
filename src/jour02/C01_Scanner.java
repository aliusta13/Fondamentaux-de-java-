package jour02;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //kullanicidan bir tamsayi alip
        // tamsayinin karesini yazdirin

        // 1. adim bir scanner objesi olusturalim

        Scanner scanner = new Scanner(System.in);
        // 2. adim kullaniciya ne istediginizi soyleyin

        System.out.println("lutfen bir tam sayi giriniz...");

        // 3. adim: istediginiz bilgiyi depoyabilecek bir verable olusturun
        // scanner objesi ile uygun methodu kullanip
        // kullanicin
        int girilenSayi = scanner.nextInt();

        System.out.println("girdiginiz tam sayinin karesidir:" + girilenSayi*girilenSayi);

        // kullanicidan bir double, bir int sayi alip bunlarin toplamini ve carpimini yazdirin






    }


}

