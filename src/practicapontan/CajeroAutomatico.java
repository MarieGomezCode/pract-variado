/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaespontanea;

import java.util.Scanner;

/**
 *
 * @author angela
 */
public class CajeroAutomatico {
        public static void main(String[] args) {
        // Declaramos las variables necesarias
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        String opcion;

        // Mostramos el menú principal
        System.out.println("Bienvenido al cajero automático.");
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Salir");

        // Leemos la opción del usuario
        opcion = scanner.nextLine();

        // Realizamos la operación seleccionada
        switch (opcion) {
            case "1":
                System.out.println("El saldo de su cuenta es de $" + saldo);
                break;
            case "2":
                // Solicitamos el monto a retirar
                System.out.println("¿Cuánto dinero desea retirar?");
                int monto = scanner.nextInt();

                // Validamos que el monto a retirar sea menor que el saldo
                if (monto <= saldo) {
                    // Retiramos el dinero
                    saldo -= monto;
                    System.out.println("Se han retirado $" + monto + " de su cuenta.");
                } else {
                    System.out.println("No hay saldo suficiente para realizar la operación.");
                }
                break;
            case "3":
                // Solicitamos el monto a depositar
                System.out.println("¿Cuánto dinero desea depositar?");
                monto = scanner.nextInt();

                // Depositamos el dinero
                saldo += monto;
                System.out.println("Se han depositado $" + monto + " en su cuenta.");
                break;
            case "4":
                System.out.println("Gracias por utilizar nuestros servicios.");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }
    
}
