package taller;
import java.util.Random;

public class Ejercicio8 {

    public static void numeroAleatorio() {
        Random r = new Random();
        int num = r.nextInt(21) + 50;
        System.out.println("Número entre 50 y 70: " + num);
    }
}
