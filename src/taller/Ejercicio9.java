package taller;
import java.util.Scanner;

public class Ejercicio9 {

    static Scanner sc = new Scanner(System.in);

    public static void clasificarEdad() {
        System.out.println("Ingrese edad:");
        int edad = sc.nextInt();

        if (edad <= 3)
            System.out.println("Bebé");
        else if (edad <= 8)
            System.out.println("Niño");
        else if (edad <= 17)
            System.out.println("Adolescente");
        else
            System.out.println("Adulto");
    }
}