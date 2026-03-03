package taller;
import java.util.Scanner;

public class Ejercicio7 {

    static Scanner sc = new Scanner(System.in);

    public static void intercambiar() {
        System.out.println("Ingrese primer número:");
        int a = sc.nextInt();
        System.out.println("Ingrese segundo número:");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}