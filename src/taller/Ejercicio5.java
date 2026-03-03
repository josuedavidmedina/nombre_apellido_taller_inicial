package taller;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio5 {

    static Scanner sc = new Scanner(System.in);

    public static void calcularEdad() {
        System.out.println("Ingrese año de nacimiento:");
        int año = sc.nextInt();
        System.out.println("Ingrese mes:");
        int mes = sc.nextInt();
        System.out.println("Ingrese día:");
        int dia = sc.nextInt();

        LocalDate nacimiento = LocalDate.of(año, mes, dia);
        LocalDate hoy = LocalDate.now();

        Period edad = Period.between(nacimiento, hoy);
        System.out.println("Tiene " + edad.getYears() + " años");
    }
}
