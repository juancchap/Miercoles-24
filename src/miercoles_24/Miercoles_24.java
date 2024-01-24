package miercoles_24;

import java.util.Scanner;

public class Miercoles_24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis,juan,total;
        System.out.println("Ingresa la cantidad de guillermo");
        guillermo=entrada.nextFloat();
        luis =guillermo/2;
        juan= guillermo +luis/2;
        total= guillermo+luis+ juan;
        System.out.println("La cantidad de luis es : "+luis);
        System.out.println("La cantidad de juan es : "+juan);
        System.out.println("El total es de : "+total);
    }

}
