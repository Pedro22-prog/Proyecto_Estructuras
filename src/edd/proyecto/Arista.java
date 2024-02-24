/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */


 /** @author VirginiaT
 */

/** Clase Arista
 * Cuyos Atributos son: City, Distance y Feromona
 */
 

public class Arista {
    private String city;
    private int distance;
    private int feromona;
    private Arista next;
    
    
    public Arista(String city){
        this.distance = 0;
        this.feromona = 0;
        this.next = null;
        this.city = city;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the distance
     */
    public int getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @return the feromona
     */
    public int getFeromona() {
        return feromona;
    }

    /**
     * @param feromona the feromona to set
     */
    public void setFeromona(int feromona) {
        this.feromona = feromona;
    }

    /**
     * @return the next
     */
    public Arista getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Arista next) {
        this.next = next;
    }
    
}
