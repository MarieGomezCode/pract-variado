/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaespontanea;

/**
 *
 * @author angela
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class CajeroAutomaticoCuatro {

    public static void main(String[] args) {
        // Declaramos las variables necesarias
        Scanner scanner = new Scanner(System.in);
        int saldo = 1000;
        String opcion;
        String contrasena = "123456";
        ArrayList<Transaccion> transacciones = new ArrayList<>();
        int totalTransacciones = 0;

        // Mostramos el menú principal
        System.out.println("Bienvenido al cajero automático.");
        System.out.println("¿Qué operación desea realizar?");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Depositar dinero");
        System.out.println("4. Cambiar contraseña");
        System.out.println("5. Consultar historial de transacciones");
        System.out.println("6. Salir");

        // Bucle principal
        while (true) {
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
                        // Registramos la transacción
                        transacciones.add(new Transaccion(monto, "Retiro"));
                        totalTransacciones++;
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
                    // Registramos la transacción
                    transacciones.add(new Transaccion(monto, "Depósito"));
                    totalTransacciones++;
                    System.out.println("Se han depositado $" + monto + " en su cuenta.");
                    break;
                case "4":
                    // Solicitamos la nueva contraseña
                    System.out.println("Ingrese su nueva contraseña: ");
                    contrasena = scanner.nextLine();
                    // Validamos que la contraseña anterior sea correcta
                    if (contrasena.equals(scanner.nextLine())) {
                        // Cambiamos la contraseña
                        contrasena = scanner.nextLine();
                        System.out.println("Su contraseña ha sido cambiada.");
                    } else {
                        System.out.println("Contraseña anterior incorrecta.");
                    }
                    break;
                case "5":
                    // Mostramos el historial de transacciones
                    System.out.println("Historial de transacciones:");
                    for (Transaccion transaccion : transacciones) {
                        System.out.println(transaccion);
                    }
                    break;
                case "6":
                    System.out.println("Gracias por utilizar nuestros servicios.");
                    System.exit(0);
                default:
                    System.out.println("Escoja una opcion.");
                    break;
            }
        }
    }
}

