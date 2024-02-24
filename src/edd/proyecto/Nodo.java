/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 * Clase Nodo
 */

public class Nodo {
    
    /**
     * Atributos de la Clase Nodo
     * 
     * element: 
     * next: Apuntador al Nodo siguiente
     */
    
    private String element;
    private Arista next;
    
    
    /**
     * Constructor del Nodo
     * @param element que contendrá el Nodo
     */
    
    public Nodo(String element){
        this.element = element;
        this.next = null;
    }

    /**
     * Getter del element del Nodo
     * @return the element del Nodo
     */
    public String getElement() {
        return element;
    }

    /**
     * Setter del element del Nodo
     * @param element the element to set
     */
    public void setElement(String element) {
        this.element = element;
    }

    /**
     * Getter de la Arista siguiente
     * @return the next
     */
    public Arista getNext() {
        return next;
    }

    /**
     * Setter de la Arista siguiente
     * @param next Nueva Arista
     */
    public void setNext(Arista next) {
        this.next = next;
    }
    
}
