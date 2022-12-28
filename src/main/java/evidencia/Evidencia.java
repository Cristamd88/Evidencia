/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package evidencia;

import java.util.*;

/**
 *
 * @author Cristal Muñoz
 */
public class Evidencia {

    public static void main(String[] args) {
        String nombre;
        String materia;
        float cal1;
        float cal2;
        float cal3;
        float suma =0;
        float prom = 0;
        float porcentaje = 0;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el nombre del alumno: ");
        nombre = lectura.nextLine();
        System.out.println("Ingresa el nombre de la materia: ");
        materia = lectura.nextLine();
        System.out.println("Ingrese la calificacion de la actividad 1:");
        cal1 = lectura.nextFloat();
        System.out.println("Ingrese la calificacion de la actividad 2:");
        cal2 = lectura.nextFloat();
        System.out.println("Ingrese la calificacion de la actividad 3:");
        cal3 = lectura.nextFloat();
        suma=cal1+cal2+cal3;
        System.out.println("El total de las calificacion es:"+ suma);
        prom=suma/3;
        System.out.println("El promedio es:"+prom);
        porcentaje=suma*100/30;
        System.out.println("El porcentaje de la calificacion es:"+ porcentaje);
        
        
        
        
    }
}
