package model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Básica en Java");
        System.out.println("--------------------------");
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Opción: ");
        
        int opcion = scanner.nextInt();
        double resultado = 0;
        
        switch(opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("\nResultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case 4:
                if(num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("\nResultado: " + num1 + " / " + num2 + " = " + resultado);
                } else {
                    System.out.println("\nError: No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("\nOpción no válida.");
        }
        
        scanner.close();

	}

}
