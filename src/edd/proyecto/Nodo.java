/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */
public class Nodo {
    private String element;
    private Arista next;
    
    public Nodo(String element){
        this.element = element;
        this.next = null;
    }

    /**
     * @return the element
     */
    public String getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(String element) {
        this.element = element;
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
