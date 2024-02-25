/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */

// Clase Lista

public class Lista {
    
    /**
     * Atributos de la Clase Lista
     * 
     * primero: 
     * size: Tamaño de la Lista 
     */
    
    public Nodo primero;
    public int size;
    
    /**
     * Constructor de Lista
     */
    
    public Lista(){
        this.primero = null;
        this.size = 0;
}
    
    /**
     * Método para Eliminar 
     * @param element 
     */
    
public void Delete(String element){
    if (primero.getNext().getCity().equals(element)){
       primero.setNext(primero.getNext().getNext());
       size--;
    }
    else{
        Arista aux = primero.getNext();
        while (aux.getNext() != null && !aux.getNext().getCity().equals(element)){
            aux = aux.getNext();
    }
    if(aux.getNext() != null){
    aux.setNext(aux.getNext().getNext());
    size--;}
    }
}

    /**
     * Método para Buscar
     * @return Arista
     * @param element 
     */

public Arista Search(String element){
    Arista aux = primero.getNext();
    for (int i = 0; i < size; i++) {
        if (!aux.getCity().equals(element)){
//            System.out.println(element + "--" + aux.getCity());
            aux = aux.getNext();
        } else {
            return aux;
        }
    }
    return null;
}

    /**
     * Método para Insertar
     * @return Arista
     * @param element 
     */

public Arista Insert(String element){
    Arista NewArista = new Arista(element);
    Arista aux = primero.getNext();
    if (primero.getNext() == null){
        primero.setNext(NewArista);
    } else{
        while(aux.getNext() != null){
            aux = aux.getNext();
        }
        aux.setNext(NewArista);
        }
    
    size++;
   return NewArista;
    }


}