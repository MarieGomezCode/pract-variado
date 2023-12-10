/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaespontanea;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author angela
 */
public class DesgloseMoned {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));
        int importe = 0, numeroBilletes50 = 0, numeroBilletes20 =0, numeroBilletes10 = 0, numeroBillete5 = 0, numeroMonedas2 = 0,numeroMonedas1;
       int numeroUnidades= 0;
       numeroMonedas1 = numeroUnidades;
        System.out.println("Obtenemos tambien"+numeroMonedas1+"MOnedas de 1s");
        try {
            System.out.println("Pulse INTRO para finalizar");
            String teclaFin = bufferedReader.readLine();
        } catch (Exception excepcion){
            System.out.println(excepcion.getMessage());
        }
        
    }
}
