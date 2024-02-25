/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

import java.util.Random;

/**
 * ([ ])
 *
 * @author pedro
 */

// Clase Grafo

public class Grafos {
    
    /**
     * Atributos de la Clase Grafos
     * 
     * grafosize: Tamaño del Grafo
     * first: 
     * save: 
     * vertices: 
     */

    private int grafosize;
    private Nodo first;
    private int save;
    private Lista[] vertices;

    /**
     * Constructor de Grafos
     * @param grafosize del Grafo
     */
    
    public Grafos(int grafosize) {
        this.grafosize = grafosize;
        this.first = null;
        this.save = 0;
        this.vertices = new Lista[this.grafosize];
        for (int i = 0; i < this.grafosize; i++) {
            this.vertices[i] = new Lista();
        }

    }
    
    /**
     * Método para Insertar un Grafos
     * @param element del Grafo
     */

    public void Insert(String element) {
        Nodo newnodo = new Nodo(element);
        if (save != grafosize) {
            for (int i = 0; i < grafosize; i++) {
                if (vertices[i].primero == null) {
                    vertices[i].primero = newnodo;
                    break;
                }

            }
        } else {
            Lista[] NewVertices = new Lista[grafosize + 20];
            for (int i = 0; i < grafosize; i++) {
                NewVertices[i] = new Lista();
            }
            
            for (int i = 0; i < grafosize; i++) {
                NewVertices[i] = vertices[i];
            }
            NewVertices[vertices.length].primero = newnodo;
            this.grafosize += 20;
            this.vertices = NewVertices;
            this.save += 1;
        }
    }

    /**
     * Método para Insertar una Arista
     * @param element
     * @param City1 
     * @param City2
     */
    
    public void InsertArista(int element, String City1, String City2) {
        Boolean aux = false;
        Boolean abc = false;
        for (int i = 0; i < grafosize; i++) {
            if (vertices[i].primero != null && vertices[i].primero.getElement().equals(City1)) {
                aux = true;
                if (vertices[i].Search(City2) != null) {
                    aux = false;
                }
            } else if (vertices[i].primero != null && vertices[i].primero.getElement().equals(City2)) {
                abc = true;
                if (vertices[i].Search(City1) != null) {
                    abc = false;
                }
            }
        }
        if (aux && abc) {
            for (int i = 0; i < grafosize; i++) {
                if (vertices[i].primero != null && vertices[i].primero.getElement().equals(City1)) {
                    Arista nuevo = vertices[i].Insert(City2);
                    nuevo.setDistance(element);
                } else if (vertices[i].primero != null && vertices[i].primero.getElement().equals(City2)) {
                    Arista nuevo = vertices[i].Insert(City1);
                    nuevo.setDistance(element);
                }
            }
        } else {
            System.out.println("No se puede crear el camino para que pase la hormiga por esas ciudades");
        }
    }
    
    /**
     * Método para Eliminar una Arista
     * @param C1 Primera Ciudad
     * @param C2 Segunda Ciudad
     */

    public void DeleteArista(String C1, String C2) {
        boolean a = false;
        for (int i = 0; i < grafosize; i++) {
            if (vertices[i].primero != null && vertices[i].primero.getElement().equals(C1)) {
                vertices[i].Delete(C2);
                a = true;
            } else if (vertices[i].primero != null && vertices[i].primero.getElement().equals(C2)) {
                vertices[i].Delete(C1);
                a = true;
            }
        }
        if (!a) {
            System.out.println("No hay aristas que se puedan eliminar");
        }
    }

    /**
     * Método para Eliminar un Vértice
     * @param element
     */
    
    public void DeleteVertice(String element) {
        boolean b = false;
        for (int i = 0; i < grafosize; i++) {
            if (vertices[i].primero != null && vertices[i].primero.getElement().equals(element)) {
                vertices[i] = new Lista();
                b = true;
            } else {
                if (vertices[i].primero != null) {
                    Arista aux = vertices[i].primero.getNext();
                    for (int j = 0; j < vertices[i].size; j++) {
                        if (aux.getCity().equals(element)) {
                            vertices[i].Delete(element);
                            b = true;
                            break;
                        } else {
                            aux = aux.getNext();
                        }
                    }
                }
            }
        }
        if (!b) {
            System.out.println("No se pudo eliminar el vertice deseado");
        }
    }

    // Método para Imprimir 
    
    public String Imprimir() {
        String p = "";
        for (int i = 0; i < grafosize; i++) {
            if (vertices[i].primero != null) {
                Arista aux = vertices[i].primero.getNext();

                p += vertices[i].primero.getElement();
                for (int j = 0; j < vertices[i].size; j++) {
                    p += "--> " + aux.getCity();
                    aux = aux.getNext();
                }
                p += "\n";
            }
        }
        return p;
    }

    /**
     * Método para conocer si Existe una Arista
     * @return boolean
     * @param v Primer Vértice
     * @param i Segundo Vértice
     */
    
    public boolean ExisteArista(int v, int i){
        boolean a = false;
        if (vertices[i].primero != null && vertices[v].primero != null){
            if (vertices[i].Search(vertices[i].primero.getElement()) != null ){
                    a = true;
            }
        }
        return a;
    }
    
    /**
     * Método para conocer la Probabilidad de Cruzar por esos Vértices
     * @param r Primer Vértice
     * @param s Segundo Vértice
     */
    
    public void Probabilidades(int r, boolean[] s){
        int count = 0;
        int p = 0;
        int n = 0;
        for (int i = 0; i < grafosize; i++) {
            if (i != r && s[i] != false && vertices[r].Search(vertices[i].primero.getElement()) != null){
                count += 1;
            }
        }
        for (int i = 0; i < grafosize; i++) {
            if (i != r && s[i] != false && vertices[r].Search(vertices[i].primero.getElement()) != null){
               int d = vertices[r].Search(vertices[i].primero.getElement()).getDistance();
               p += 1/(count) * 1/d;
        }
        Random l = new Random();
        double random = l.nextDouble();
        for (int j = 0; j < grafosize; j++) {
            if(i != r && s[i] != false && vertices[r].Search(vertices[i].primero.getElement()) != null){
                int d = vertices[r].Search(vertices[i].primero.getElement()).getDistance();
                n += (1/count * 1/d)/p;
            }
            if(n>random){
                recorrerProfundidad(i, s);
            } 
        }
    }
    }
    
    /**
     * Método para recorrer a Profundidad 
     * @param v Primer Vértice
     * @param visitados
     */
    
    public void recorrerProfundidad(int v, boolean[] visitados) {
        
    // Se marca el vértice v como visitado
        visitados[v] = true;
        
    // El tratamiento del vértice consiste únicamente en imprimirlo en pantalla
        System.out.println(v);
        
    // Se examinan los vértices adyacentes a v para continuar el recorrido
        for (int i = 0; i < this.grafosize; i++) {
            if ((v != i) && (!visitados[i]) && (this.ExisteArista(v, i))) {
                
            }
            
            if(true){
                recorrerProfundidad(i, visitados);
                
        }
    }
    }
    
    /**
     * Método para recorrer a Profundidad 
     */
    
    // Procedimiento no recursivo

    public void profundidad() {
        boolean visitados[] = new boolean[this.grafosize];
        

        for (int i = 0; i < grafosize; i++) //inicializar vector con campos false
        {
            visitados[i] = false;
        }
        
        recorrerProfundidad( 0, visitados);
            
        }
    }

