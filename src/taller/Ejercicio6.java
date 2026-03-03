package taller;
import java.util.Scanner;

public class Ejercicio6 {

    static Scanner sc = new Scanner(System.in);

    public static void operadorMovil() {
        System.out.println("Ingrese número de teléfono:");
        String numero = sc.next();

        if (numero.startsWith("300"))
            System.out.println("Claro");
        else if (numero.startsWith("310"))
            System.out.println("Tigo");
        else if (numero.startsWith("320"))
            System.out.println("Movistar");
        else
            System.out.println("Operador desconocido");
    }
}