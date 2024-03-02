package jour02;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) { // kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("sayi biri giriniz");
        int sayiBir = scanner.nextInt();

        System.out.println("sayi ikiyi giriniz");
        int sayiIki = scanner.nextInt();

        int temp = 0;

        temp = sayiIki;
        sayiIki= sayiBir;
        sayiBir= temp;
        System.out.println("verdiginiz sayilarin yerini degistirin...");
        System.out.println("sayi1:"+ sayiBir+ " sayi2:" + sayiIki + " oldu." );









    }









}
