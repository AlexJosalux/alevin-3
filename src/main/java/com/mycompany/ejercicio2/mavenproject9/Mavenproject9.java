/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2.mavenproject9;
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author ItsqmetEstudiantes
 */
public class Mavenproject9 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int opcion;
        double base, altura, respuesta,lado, radio;
        System.out.println("1. Triangulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Circulo");
         System.out.println("Elija una opcion");
         opcion=leer.nextInt();
         switch (opcion){
             case 1:
                 System.out.println("Ingrese la base");
                 base=leer.nextDouble();
                 System.out.println("Ingrese la altura");
                 altura=leer.nextDouble();
                 respuesta=(base*altura)/2;
                 System.out.println("El area del triangulo es "+respuesta);
                 break;
             case 2:
                 System.out.println("Ingrese el lado");
                 lado=leer.nextDouble();
                 respuesta=lado*lado;
                 System.out.println("El area del cuadrado es " +respuesta);
                 break;             
             case 3:
                  System.out.println("Ingresar el radio");
                  radio=leer.nextDouble();
                  respuesta=3.1416*(radio*radio);
                  System.out.println("El area del circulo es " +respuesta);
                 break;
                 
             default :
                 System.out.println("Elija una opcion del menu");
         }
        
    }
}
