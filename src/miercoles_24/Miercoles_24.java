package miercoles_24;

import java.util.Scanner;

public class Miercoles_24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaramos variables
        float guillermo, luis,juan,total;
        //Le pedimos al usuario que que ingrese la cantidad de guillermo
        System.out.println("Ingresa la cantidad de guillermo");
        guillermo=entrada.nextFloat();
        //la cantidad que nos dio guillermo lo dividimos entre 2
        luis =guillermo/2;
        //lo que nos da guillermo le sumamos lo que nos dio luis y lo dividimos entre 2
        juan= guillermo +luis/2;
        // toltal es igual a la suma de juan luis y guillermo
        total= guillermo+luis+ juan;
        
        //imprimimos en pantalla los resultados
        System.out.println("La cantidad de luis es : "+luis);
        System.out.println("La cantidad de juan es : "+juan);
        System.out.println("El total es de : "+total);
    }

}
