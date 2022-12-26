/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_3.Entiedades;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Raices {
    // Atributos
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private float a=0;
    private float b=0;
    private float c=0;
    
    //Constructures

    public Raices(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Métodos 

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    
    
    // Métodos Propios
    
    public double getDiscriminante(){
        double discriminante;
            discriminante=(double)(Math.pow(b, 2f)-(4f*a*c));
        return discriminante;
    }
    public boolean tieneRaices(){
        boolean respuesta=false;
            if(getDiscriminante()>0){
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
        if(tieneRaices()){
            System.out.println("Raiz 1: "+String.format("%.5g",((-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a))));
            System.out.println("Raiz 2: "+String.format("%.5g", ((-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a))));
        }
    }
    public void obtenerRaiz(){
        if(tieneRaiz()){
            System.out.println("Raiz: "+String.format("%.5g", ((-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a))));
            //System.out.println("Raiz 2: "+((-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/(2*a)));
        }
    }
    public void calcular(){
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("Ecuación no tiene Soluciones");
        }
    }

    @Override
    public String toString() {
        return "Raices{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
    
}
