/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_2.Servicios;

import ejercicio_extra_2.Entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosPuntos {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        System.out.print("Ingrese la Coordenada X del Punto 1: ");
        float x1=leer.nextFloat();
        System.out.print("Ingrese la Coordenada Y del Punto 1: ");
        float y1=leer.nextFloat();
        System.out.print("Ingrese la Coordenada X del Punto 2: ");
        float x2=leer.nextFloat();
        System.out.print("Ingrese la Coordenada y del Punto 2: ");
        float y2=leer.nextFloat();
        
        return new Puntos(x1, y1, x2, y2);
    }
    
    
}
