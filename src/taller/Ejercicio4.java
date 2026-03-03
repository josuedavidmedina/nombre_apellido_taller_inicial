package taller;
import java.util.Scanner;

public class Ejercicio4 {

    static Scanner sc = new Scanner(System.in);

    public static void parPositivoNegativo() {
        System.out.println("Ingrese un número entero:");
        int num = sc.nextInt();

        if (num % 2 == 0 && num > 0)
            System.out.println("Es par positivo");
        else if (num % 2 == 0)
            System.out.println("es par negativo");
        else if (num > 0)
            System.out.println("impar positivo");
        else
            System.out.println("Impar negativo");
    }
}