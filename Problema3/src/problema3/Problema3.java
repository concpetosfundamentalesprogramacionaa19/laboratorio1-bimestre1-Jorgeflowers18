/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.Scanner;

/**
 *
 * @author Jorgeso
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Comprobación de pase de año de estudiante
        String nota1;
        String nota2;
        String nota3;
        Double prom;
        String result;

        // Se ingresa las tres notas
        Scanner tec = new Scanner(System.in);
        System.out.println("Por favor ingrese sus notas:");

        nota1 = tec.nextLine();

        nota2 = tec.nextLine();

        nota3 = tec.nextLine();

        /**
         * * aquí se realiza la transformación a double para poder calcular con
         * decimales
        **
         */
        double nota11 = Double.parseDouble(nota1);

        double nota22 = Double.parseDouble(nota2);

        double nota33 = Double.parseDouble(nota3);

        // Esta es la operación para calcular el promedio de las 3 notas
        prom = (nota11 + nota22 + nota33) / 3;

        /* Se compara el promedio para saber si el estudiante pasa o no el año
        con la herramienta lógica "expresionLogica ? expresion_1 : expresion_2"
        **/
        result = prom > 14 ? "pasa el año" : "no pasa el año";

        System.out.printf("El estudiante %s\n", result);

    }

}
