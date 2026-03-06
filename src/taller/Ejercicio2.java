package taller;
import java.util.Scanner;

public class Ejercicio2 {

    static Scanner sc = new Scanner(System.in);

    public static void numeroDecimal() {
        System.out.println("NUMERO POSITIVO - NEGATIVO \n Ingrese un numero decimal:");
        float num = sc.nextFloat();

        if (num > 0)
            System.out.println("Es positivo");
        else if (num < 0)
            System.out.println("Es negativo");
        else
            System.out.println("Es cero");
    }
}