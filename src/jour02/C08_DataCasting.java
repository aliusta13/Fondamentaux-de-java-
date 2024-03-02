package jour02;

public class C08_DataCasting {

    public static void main(String[] args) {

        int sayi1 = 45;
        int sayi2= sayi1; //ayni data turunde oldugu icin bu islem Casting degil normal atamadir

        double dbl = sayi1; // auto widening
        System.out.println(dbl);

        short sayi3 = 66;
        sayi1 = sayi3; // auto widening

        System.out.println(sayi1);

        int sayi4= 22;
        byte byt1 = (byte) sayi4;
        System.out.println(byt1);

        double dbl2= 34.54;
        int sayi5= (int) dbl2;
        System.out.println(sayi5);

        sayi5 = 132;
        byte byt2 = (byte) sayi5;
        System.out.println(byt2);
        sayi5 = 256;
        byt2 = (byte)sayi5;
        System.out.println(byt2);

        sayi5 = (522);
        byt2 = (byte) sayi5;
        System.out.println(byt2);

        /*
        1 kucuk data turundeki degeri buyuk data turundeki veriable'a atamak istersek
           java bunu otomatik olarak yapar adina Auto widening denir

        2 buyuk data turundeki degeri, kucuk data turundeki verable'a atamak istersek
          java sorumlulugu almamizi ister,
          vevirmek istediginiz degerin onune (cevirmek istedigimiz veriable'in data turu) yazariz

          buna Explicit Narrowing (zorla daraltma) denir

          - eger atanan deger veriable'in data turunun sinirlari icersindeyse ayni kalir
          - eger atanan deger verable'in data sinirlarinda degilse deger kaybi veya baskalasma olur
         */



















    }
}
