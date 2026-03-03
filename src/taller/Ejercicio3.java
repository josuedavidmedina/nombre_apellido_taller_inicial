package taller;
import java.util.Scanner;

public class Ejercicio3 {

    static Scanner sc = new Scanner(System.in);

    public static void parImpar() {
        System.out.println("Ingrese un número entero:");
        int num = sc.nextInt();

        if (num % 2 == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
    }
}