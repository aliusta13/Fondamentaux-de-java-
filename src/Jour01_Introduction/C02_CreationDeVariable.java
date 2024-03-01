package Jour01_Introduction;

public class C02_CreationDeVariable {
    public static void main(String[] args) {///cette écriture est obligatoire pour que le bloc de code puisse être exécuté.

        int                nombre      =                    20;
     // type de donnée     nom        assignation          valeur

        System.out.println("nombre");//nombre
        System.out.println(nombre);//20 ==> "10ème ligne, la valeur de la variable 'nombre'.
        nombre = 30;
        System.out.println(nombre);//30==> 11ème ligne, la valeur de la variable 'nombre'.
        nombre = 50;
        System.out.println(nombre);//50==> 13ème ligne, la valeur de la variable 'nombre'.
        nombre = nombre + 20;
        System.out.println(nombre);//70==> 15ème ligne, la valeur de la variable 'nombre'.
        nombre = (nombre - 10) / 2;
        System.out.println(nombre);//30==> 17ème ligne, la valeur de la variable 'nombre'.
        nombre = (nombre + 10) - 10;
        System.out.println(nombre);//30==> 19ème ligne, la valeur de la variable 'nombre'.







    }
}
