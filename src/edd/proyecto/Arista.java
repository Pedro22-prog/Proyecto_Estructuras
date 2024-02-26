/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

// Clase Arista
 
/***Descripcion: Clase arista que se encarga de ver las ciudades que la hormagia puede visitar, con las feromonas y las distancias respectivas, y con sus setters y getters respectivos.
 * @author: Pedro González
 * @version: 22/02/24
 * 
 * @author VirginiaT
 * @version: 25/02/24
 * Esto es un comentario para javadoc
 */

public class Arista {
    
    /**
     * Atributos de la Clase Arista
     * 
     * city: Ciudad de origen o de llegada
     * distance: Distancia que recorre 
     * feromona: Cantidad de feromona de la Arista
     * next: Siguiente Arista
     * sumatoria: 
     */
    
    private String city;
    private double distance;
    private double feromona;
    private Arista next;
    public double sumatoria; 
    
    
    /**
     * Constructor de la Arista
     * @param city que contendrá la Arista
     */
    
    public Arista(String city){
        this.distance = 0;
        this.feromona = 0;
        this.next = null;
        this.city = city;
        this.sumatoria = 0;
    }

    /**
     * Getter de city de Arista
     * @return the city
     */
    
    public String getCity() {
        return city;
    }

    /**
     * Setter de city de Arista
     * @param city the city to set
     */
    
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Getter de distance de Arista
     * @return the distance
     */
    
    public double getDistance() {
        return distance;
    }

    /**
     * Setter de distance de Arista
     * @param distance the distance to set
     */
    
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Getter de feromona de Arista
     * @return the feromona
     */
    
    public double getFeromona() {
        return feromona;
    }

    /**
     * Setter de feromona de Arista
     * @param feromona the feromona to set
     */
    
    public void setFeromona(double feromona) {
        this.feromona = feromona;
    }

    /**
     * Getter de la siguiente Arista
     * @return the next
     */
    
    public Arista getNext() {
        return next;
    }

    /**
     * Setter de la siguiente Arista
     * @param next the next to set
     */
    
    public void setNext(Arista next) {
        this.next = next;
    }
    
    public static void WriteTXT(){
    
    }
    
}
