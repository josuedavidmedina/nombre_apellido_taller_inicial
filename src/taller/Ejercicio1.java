package taller;
import java.util.Scanner;

public class Ejercicio1 {

    static Scanner sc = new Scanner(System.in);

    public static void leerEntero() {
        System.out.println("Ingrese un número entero:");
        int num = sc.nextInt();
        System.out.println("El número ingresado es: " + num);
    }
}