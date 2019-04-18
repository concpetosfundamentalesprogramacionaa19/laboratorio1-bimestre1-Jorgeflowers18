/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg2;

import java.util.Scanner;

/**
 *
 * @author Jorgeso
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String x;
        String y;
        String z;

        double x1;
        double y1;
        double z1;
        double m;

        // Ingreso de variables
        Scanner tec = new Scanner(System.in);

        System.out.println("Por favor ingrese la variable x");

        x = tec.nextLine();

        System.out.println("Por favor ingrese la variable y");

        y = tec.nextLine();

        System.out.println("Por favor ingrese la variable z");

        z = tec.nextLine();

        // Transformación a double
        x1 = Double.parseDouble(x);

        y1 = Double.parseDouble(y);

        z1 = Double.parseDouble(z);

        // Operación a realizar
        m = (x1 + (y1 / z1)) / (x1 - (y1 / z1));

        System.out.printf("El valor de m, en base a las variables:\nx=%.1f\n\t"
                + "y=%.1f\n\t\tz=%.1f\nda como resultado:\n\t\t\tm=%.1f\n",
                x1, y1, z1, m);

    }

}
