package jour02;

public class C07_Datacasting {
    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 23;
        short shrt = 258;
        int int1 = 577;
        long lng = 1899;
        float fl = 23.6f;
        double dbl = 44.6;
        String str = "Java Candir";

        //bl = chr;
        //bl = byt;
        //bl = str izin vermez

        dbl = fl;
        dbl = lng;
        dbl= int1;
        dbl= shrt;
        dbl= byt;

        lng =(long)dbl;
        lng = (long)fl;
        lng = int1;
        lng = shrt;
        lng= byt;


        int1= (int) dbl;
        int1 = (int) fl;
        int1 = (int) lng;
        int1 = shrt;
        int1 = byt;



        // javada bir data turunden baska bir data turune cevirmeye data casting denir.
        //ancak her data turu birbirine cevrilmez
        //benzer ozelliklerdeki datalari birbirine kolayca cevirebilirken bazi casting islemleri icin extra kod
        // yazlmaniz gerekir, bazi casting islemleri ise imkansizdir
        // data kucuk data turlerini buyuklere atarken bunu ekstra code yazimina gerek kalmadan
        //otomatik olarak yapar buna "Auto-Widening" denir





    }
}
