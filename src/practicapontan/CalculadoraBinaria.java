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
public class CalculadoraBinaria {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        int decimal = sc.nextInt();

        String binario = "";
        int cociente = decimal;

        while (cociente > 0) {
            int resto = cociente % 2;
            binario = resto + binario;
            cociente = cociente / 2;
        }

        System.out.println("El número binario es: " + binario);
    }
}
