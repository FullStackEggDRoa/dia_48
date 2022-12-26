/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_4.Servicios;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosNIF {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearNif(){
    
        System.out.print("Ingrese el Número DNI: ");
        String dni=leer.next();
        String[] dniAux=dni.split(".", 5);
        switch (dniAux.length) {
            case 3 -> { long dniAuxFormated=(long)Integer.parseInt(dniAux[0]+dniAux[1]+dniAux[2]); } 
            case 2 -> { long dniAuxFormated=(long)Integer.parseInt(dniAux[0]+dniAux[1]); }  
            case 1 -> { long dniAuxFormated=(long)Integer.parseInt(dniAux[0]);}
            default -> System.out.println("Número DNI Ingresaod Erradamente"); 
            
        }
    }
    
    
}
