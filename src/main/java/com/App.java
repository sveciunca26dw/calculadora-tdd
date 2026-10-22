package com.zubirimanteo.devops;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1. Sumar dos enteros");
            System.out.println("2. Sumar dos strings");
            System.out.println("3. Finalizar");
            System.out.print("Elige una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1 -> sumarEnteros(sc, calc);
                case 2 -> sumarStrings(sc, calc);
                case 3 -> System.out.println("Hasta luego.");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 3);

        sc.close();
    }

    private static void sumarEnteros(Scanner sc, Calculadora calc) {
        try {
            System.out.print("Primer entero: ");
            int a = Integer.parseInt(sc.nextLine().trim());
            System.out.print("Segundo entero: ");
            int b = Integer.parseInt(sc.nextLine().trim());
            System.out.println("Resultado: " + calc.suma(a, b));
        } catch (NumberFormatException e) {
            System.out.println("Eso no es un entero válido.");
        }
    }

    private static void sumarStrings(Scanner sc, Calculadora calc) {
        System.out.print("Primer string: ");
        String a = sc.nextLine();
        System.out.print("Segundo string: ");
        String b = sc.nextLine();
        System.out.println("Resultado: " + calc.sumaStrings(a, b));
    }
}