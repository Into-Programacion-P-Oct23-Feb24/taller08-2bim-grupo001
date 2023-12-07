/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        int edades = 0;
        double estatura;
        double estaturas = 0;
        int jugador ;
        String mensajeF = "";
        String tedades = "";
      
        double promedioedades = 0;
        double promedioestaturas = 0;

        System.out.println("Ingrese la cantidad de jugadores");
        jugador = entrada.nextInt();

        for (int i = 1; i <= jugador; i++) {
            entrada.nextLine();
            System.out.println("Ingrese el nombre del Jugador: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese la posición en el campo: ");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del Jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del Jugador");
            estatura = entrada.nextDouble();
           //vamos sumando las cadenas con string fomrat
            tedades = String.format("%s%d ",tedades, edad);

            mensajeF = String.format("%s%d.%s-%s-,edad %d, estatura %.2f\n",
                    mensajeF,
                    i,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            // Sacamos el promedio tanto de edades como de estatura 
            edades = edades + edad;
            promedioedades = edades / i;

            estaturas = estaturas + estatura;
            promedioestaturas = estaturas / i;

        }
        System.out.printf("-----Listado de jugadores-----\n%s\nListado de "
                + "edades: %s\n"
                + "Promedio de edades:%.2f Promedio de estaturas: %.2f\n", 
                mensajeF,tedades,
                 promedioedades,
                promedioestaturas);
        
        
        
        
        
        

    }
}
