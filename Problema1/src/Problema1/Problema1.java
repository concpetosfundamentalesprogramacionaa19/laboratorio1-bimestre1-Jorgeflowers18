/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema1;

import java.util.Scanner;

/**
 *
 * @author Jorgeso
 */
public class Problema1 {

    public static void main(String[] args) {

        /**
         * *Se desea realizar un programa que permita calcular el valor mensual
         * a pagar a un trabajador; así como también el valor de su descuento al
         * Seguro Social (10% del total a pagar). El sueldo mensual del
         * trabajador se obtienen mediante una multiplicación simple entre el
         * número de horas (100), por el costo hora oficial.
        **
         */
        // numero de horas
        double numhoras;
        // descuento del seguro social
        double sS;
        // sueldo mensual del trabajador
        double sueldo;
        // costo de hora
        double costhora;
        /**
         * *Variables auxiliares para el pre-sueldo y para el saldo a descontar
         * para el seguro social
        **
         */
        double aux;
        double aux2;

        Scanner tec = new Scanner(System.in);

        System.out.println("Por favor ingrese el número de horas que ha "
                + "acumulado el trabajador:");

        numhoras = tec.nextDouble();

        System.out.println("Por favor ingrese el costo por hora:");

        costhora = tec.nextDouble();

        aux = numhoras * costhora;

        aux2 = aux * 0.1;

        sueldo = aux - aux2;

        System.out.printf("El sueldo mensual final a pagar es: %.2f\n y el valor"
                + " descontado por el Seguro Social es: %.2f", sueldo, aux2);

    }

}
