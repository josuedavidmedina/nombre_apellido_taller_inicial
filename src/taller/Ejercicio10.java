package taller;

import java.util.Scanner;

public class Ejercicio10 {

    static Scanner sc = new Scanner(System.in);

    public static void calcularIva() {

        System.out.println("Ingrese valor de la venta:");
        double venta = sc.nextDouble();

        double descuento;
        double iva;
        double total;

        if (venta > 150000) {
            descuento = venta * 0.25;
        } else {
            descuento = venta * 0.10;
        }

        iva = venta * 0.19;

        total = venta + iva - descuento;

        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);
    }
}