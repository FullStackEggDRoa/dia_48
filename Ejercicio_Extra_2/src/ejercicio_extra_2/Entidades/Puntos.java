/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_2.Entidades;

/**
 *
 * @author droa
 */
public class Puntos {
    //Atributos
    
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    
    // Constructores

    public Puntos() {
    }

    public Puntos(float x1, float y1, float x2, float y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    // Métodos

    public float getX1() {
        return x1;
    }

    public void setX1(float x1) {
        this.x1 = x1;
    }

    public float getY1() {
        return y1;
    }

    public void setY1(float y1) {
        this.y1 = y1;
    }

    public float getX2() {
        return x2;
    }

    public void setX2(float x2) {
        this.x2 = x2;
    }

    public float getY2() {
        return y2;
    }

    public void setY2(float y2) {
        this.y2 = y2;
    }
    
    public float calcularDistancia(){
        float distancia;
        distancia=(float) Math.sqrt(Math.pow((x2-x1),2)+Math.pow(y2-y1,2));
        
        return distancia;
    }
    
    
}
