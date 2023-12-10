/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaespontanea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author angela
 */
public class OtroScan {
    public static void main(String[] args) throws IOException {
        // Con este codigo pedimos un número
        System.out.println("Ingrese el primer número:");
        Integer numero1 = cargarNumero();
        
        System.out.println("Ingrese el segundo número:");
        Integer numero2 = cargarNumero();
        
        System.out.println("Ingrese el tercer número:");
        Integer numero3 = cargarNumero();
        
    }
        private static Integer cargarNumero() throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);
        String strNumero = buffer.readLine();
        Integer numero = Integer.parseInt(strNumero);
        return numero;
    }
       private static void calcularNumeroMayor(Integer numero1, Integer numero2, Integer numero3) {
    
        Integer numeroMayor = numero1;
        
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
        }
        if (numero3 > numeroMayor) {
            numeroMayor = numero3;
        }
        
        System.out.println("El número mayor es: " + numeroMayor);
    }
    
    
    private static void calcularNumeroMenor(Integer numero1, Integer numero2, Integer numero3) {
        Integer numeroMenor = numero1;
        
        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
        }
        
        System.out.println("El número menor es: " + numeroMenor);
    }
}
