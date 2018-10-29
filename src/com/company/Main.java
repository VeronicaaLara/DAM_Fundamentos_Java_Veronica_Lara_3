package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	// Pedir el radio de la circunferencia
        // Calcular su longitud

        Scanner sc = new Scanner(System.in);

        System.out.println(" Introduce el radio de la circunferencia");

        int radio = sc.nextInt();

        double longitud = Math.pow(radio,2)*(3.14);

        System.out.println("La longitud de la circunferencia es" + longitud + "cm");

        sc.close();


    }
}
