package Jour01_Introduction;

public class C03_TypesDonneesPrimitives {
    public static void main(String[] args) {

        /*
        byte:   Entier signé de 8 bits.
                Plage de valeurs : de -128 à 127. Occupe 1 octet en mémoire.

        short:  Entier signé de 16 bits.
                Plage de valeurs : de -32 768 à 32 767.
                Occupe 2 octets en mémoire.

        int:    Entier signé de 32 bits.
                Plage de valeurs : de -2^31 à (2^31)-1.
                Occupe 4 octets en mémoire.

        long:   Entier signé de 64 bits.
                Plage de valeurs : de -2^63 à (2^63)-1.
                Occupe 8 octets en mémoire.

        float:  Nombre à virgule flottante sur 32 bits.
                Occupe 4 octets en mémoire.

        double: Nombre à virgule flottante sur 64 bits.
                Occupe 8 octets en mémoire.

        char:   Caractère Unicode de 16 bits.
                Occupe 2 octets en mémoire.

        boolean: Valeur logique, true ou false.
                 Occupent généralement 1 bit en mémoire,
                 mais cela peut varier en fonction de la gestion de la mémoire par Java.
         */



        // Pour des valeurs booléennes telles que true et false
        boolean b11 = true;
        boolean b12 = false;

        // Pour stocker un seul caractère
        // Le char prend un seul caractère entre apostrophes simples, et un espace est également un caractère.
        // Le type de données char occupe 16 bits d'espace.
        char ch1 = 'a';
        char ch2 = '7';
        char ch3 = '.';
        char ch4 = 'g';
        char ch5 = ' ';

        // Pour stocker des nombres entiers, en tenant compte de l'état de la mémoire
        // byte, short, int, long
        byte nombre1 = 27;
        short nombre2 = 27;
        int nombre3 = 27;
        long nombre4 = 27;
        // Si le nombre est 259
        short nombre5 = 259;
        // short sayi6 = 6666666; C'est un nombre long pour le type short.

        // Pour les nombres décimaux, on utilise float ou double.
        float nombre10 = 234.5f;
        float nombre11 = 23;
        double nombre12 = 2.3;

        float f1 = 20;
        float f2 = 3;
        System.out.println(f1 / f2);//6.6666665

        double d1 = 20;
        double d2 = 3;
        System.out.println(d1/d2); //6.666666666666667

    }
}
