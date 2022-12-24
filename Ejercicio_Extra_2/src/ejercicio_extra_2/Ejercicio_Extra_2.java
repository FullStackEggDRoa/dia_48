/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_2;

import ejercicio_extra_2.Entidades.Puntos;
import ejercicio_extra_2.Servicios.serviciosPuntos;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ingresar los Punto 1 y 2: ");
        serviciosPuntos sP=new serviciosPuntos();
        Puntos pt1=sP.crearPuntos();
        System.out.println("Calculando la distancia entre los puntos Ingresados ... ");
        System.out.println("La distancia entre el Punto 1 y Punto 2 es: "+String.format("%.5g", pt1.calcularDistancia()));
    }
    
}
