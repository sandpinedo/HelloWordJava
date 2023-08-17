/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Sumayresta {

    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
       
      System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");

        int opcion = scanner.nextInt();
        double resultado = 0;

        if (opcion == 1) {
            resultado = num1 + num2;
        } else if (opcion == 2) {
            resultado = num1 - num2;
        } else {
            System.out.println("Opción no válida");
            scanner.close();
            return;
        }

        System.out.println("El resultado es: " + resultado);

        scanner.close();
            
        }
    }
