/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author LAB.ELECT
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables
        int fahrenheit = 20;
        int celsius;

        // iniciamos el ciclo for para que trabaje 20 comberciones 
        for (int i = 1; i <= 20; i++) {
            //formula para sacar el resultado para la comvercion 
            celsius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("%d. %d Grados Fahrenheit = %d Grados Celsius\n", i,fahrenheit, celsius);

            // Incrementamos el valor de Fahrenheit
            fahrenheit = fahrenheit + 4;
        }
    }
}
