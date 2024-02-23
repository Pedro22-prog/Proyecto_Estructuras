/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;
/***Descripcion: Clase arista que se encarga de ver las ciudades que la hormagia puede visitar, con las feromonas y las distancias respectivas, y con sus setters y getters respectivos.
 * @author: Pedro González
 * @version: 22/02/24
 * Esto es un comentario para javadoc
 */

/**
 *
 * @author pedro
 */
public class Arista {
    private String city;
    private double distance;
    private double feromona;
    private Arista next;
    public double sumatoria;    
    public Arista(String city){
        this.distance = 0;
        this.feromona = 11;
        this.next = null;
        this.city = city;
        this.sumatoria = 0;
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
    public double getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * @return the feromona
     */
    public double getFeromona() {
        return feromona;
    }

    /**
     * @param feromona the feromona to set
     */
    public void setFeromona(double feromona) {
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
