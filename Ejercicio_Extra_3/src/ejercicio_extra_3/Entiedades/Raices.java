/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_3.Entiedades;

/**
 *
 * @author droa
 */
public class Raices {
    // Atributos
    private float a;
    private float b;
    private float c;
    
    //Constructures

    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante(){
        double discriminante;
            discriminante=(double)(Math.pow(b, 2f)-(4f*a*c));
        return discriminante;
    }
    public boolean tieneRaices(){
        boolean respuesta=false;
            if(getDiscriminante()>=0){
                respuesta=true;
            }
        return respuesta;
    }
    public boolean tieneRaiz(){
        boolean respuesta=false;
            if(getDiscriminante()==0){
                respuesta=true;
            }
        return respuesta;
    }
    public void obtenerRaices(){
        
    }
}
