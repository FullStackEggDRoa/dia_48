/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_4.Servicios;

import ejercicio_extra_4.Entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosNIF {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNif(){
    
        CharSequence chars_NFI = "TRWAGMYFPDXBNJZSQVHLCKE";
        long dniAuxFormateado=0;
        
        do { 
            System.out.print("Ingrese el Número DNI: ");
            String dni=leer.next();
            String[] dniAux=dni.split("\\.", 0);
            switch (dniAux.length) {
            case 3 -> { dniAuxFormateado=(long)Integer.parseInt(dniAux[0]+dniAux[1]+dniAux[2]); } 
            case 2 -> { dniAuxFormateado=(long)Integer.parseInt(dniAux[0]+dniAux[1]); }  
            case 1 -> { dniAuxFormateado=(long)Integer.parseInt(dniAux[0]);}
            default -> System.out.println("Número DNI Ingresado Erradamente"); 
        }
        } while (String.valueOf(dniAuxFormateado).length()>8);
        
        int restoDni=(int)dniAuxFormateado%23;
        char letra=chars_NFI.charAt(restoDni);
        
        return new NIF(dniAuxFormateado, letra);
    }

 
    
    
}
