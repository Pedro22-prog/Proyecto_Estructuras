/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;
/***Descripcion: En este archivo se encuentra la clase de los grafos y los métodos que se encargan de revisar si la hormiga visito la ciudad, las formulas y las probabilidades de la ciudad que visite
 * @author: Pedro González
 * @version: 22/02/24
 * 
 * @author VirginiaT
 * @version: 25/02/24
 * 
 * Esto es un comentario para javadoc
 */
import java.util.Random;

// Clase Grafo

public class Grafos {

     /**
     * Atributos de la Clase Grafos
     * 
     * grafosize: Tamaño del Grafo
     * first: 
     * last:
     * save: 
     * vertices: 
     */
    
    private int grafosize;
    private int first;
    private int last;
    private int save;
    Lista[] vertices;

    /**
     * Constructor de Grafos
     * @param grafosize del Grafo
     */
    
    public Grafos(int grafosize) {
        this.grafosize = grafosize;
        this.first = 0;
        this.save = 0;
        this.vertices = new Lista[this.grafosize];
        this.last = 0;
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
        if (save != getGrafosize()) {
            for (int i = 0; i < getGrafosize(); i++) {
                if (vertices[i].primero == null) {
                    vertices[i].primero = newnodo;
                    break;
                }

            }
            save+=1;
        } else {
            Lista[] NewVertices = new Lista[getGrafosize() + 20];
            for (int i = 0; i < getGrafosize(); i++) {
                NewVertices[i] = new Lista();
            }
            System.arraycopy(vertices, 0, NewVertices, 0, getGrafosize());
            NewVertices[vertices.length].primero = newnodo;
            this.grafosize += 20;
            this.vertices = NewVertices;
            this.save += 1;
        }
    }

    /**
     * Método para Insertar una Arista
     * @param City1 
     * @param City2
     * @param element
     */
    
    public void InsertArista(String City1, String City2, double element) {
        Boolean aux = false;
        Boolean abc = false;
        for (int i = 0; i < getGrafosize(); i++) {
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
            for (int i = 0; i < getGrafosize(); i++) {
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
        for (int i = 0; i < getGrafosize(); i++) {
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
        for (int i = 0; i < getGrafosize(); i++) {
            if (vertices[i].primero != null && vertices[i].primero.getElement().equals(element)) {
                vertices[i] = new Lista();
                save--;
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
        for (int i = 0; i < getGrafosize(); i++) {
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
    public void setFirst(int first){
        this.first = first;
    }
    public void setLast(int last){
        this.last = last;
    }
    
    public void ChangeFirst(String element){
        for (int i = 0; i < getGrafosize(); i++) {
            if (vertices[i].primero.getElement().equals(element)){
                this.first = i;
                break;
            }
        }
    }
    
    public void ChangeLast(String element){
        for (int i = 0; i < getGrafosize(); i++) {
            if (vertices[i].primero != null){
                if (vertices[i].primero.getElement().equals(element)){
                    this.last = i;
                    break;
            }
            }
        }
    }
    
    /**
     * Método para conocer la Probabilidad de Cruzar por esos Vértices
     * @param r Primer Vértice
     * @param s Segundo Vértice
     */
    
    public void Probabilidades(int r, boolean[] s, double alpha, double beta, Ants a){
        double p = 0;
        double n = 0;
        s[r] = true;
        a.setVisited(a.getVisited()+this.vertices[r].primero.getElement() + ",");
        if(r != last){
            
    //        for (int i = 0; i < grafosize; i++) {
    //            if (i != r && s[i] != false && vertices[r].Search(vertices[i].primero.getElement()) != null){
    //                count += 1;
    //            }
    //        }
            for (int i = 0; i < getGrafosize(); i++) {
                if (i != r && s[i] != true && vertices[i].primero != null && vertices[r].Search(vertices[i].primero.getElement()) != null){
                   double d = vertices[r].Search(vertices[i].primero.getElement()).getDistance();
//                    System.out.println(d);
//                    System.out.println((vertices[r].Search(vertices[i].primero.getElement()).getFeromona()));
//System.out.println("****************************************");
//System.out.println(vertices[r].Search(vertices[i].primero.getElement()).getFeromona());
                    //System.out.println(1/d);
                    //System.out.println("********************************");
                   p += Math.pow((vertices[r].Search(vertices[i].primero.getElement()).getFeromona()), alpha) * Math.pow(1/d, beta);
            }}
                System.out.println(p);
            Random l = new Random();
            double random = l.nextDouble();
            for (int i = 0; i < getGrafosize(); i++) {
                if(i != r && s[i] != true && vertices[i].primero != null&& vertices[r].Search(vertices[i].primero.getElement()) != null){
                    double d = vertices[r].Search(vertices[i].primero.getElement()).getDistance();
                    n += (Math.pow((vertices[r].Search(vertices[i].primero.getElement()).getFeromona()), alpha) * Math.pow(1/d, beta))/p;
                    System.out.println(n);
                }
                if(n>random && vertices[i].primero != null){
                    a.setDistance(a.getDistance()+  vertices[r].Search(vertices[i].primero.getElement()).getDistance());
                    Probabilidades(i, s, alpha, beta, a);
                    break;
                } 
            }
    }
    }
    
    
//    /**
//     * Método para recorrer a Profundidad 
//     * @param v Primer Vértice
//     * @param visitados
//     */
    
//    public void recorrerProfundidad(int v, boolean[] visitados) {
////se marca el vértice v como visitado
//        visitados[v] = true;
////el tratamiento del vértice consiste únicamente en imprimirlo en pantalla
//        System.out.println(v);
////se examinan los vértices adyacentes a v para continuar el recorrido
//        for (int i = 0; i < this.grafosize; i++) {
//            if ((v != i) && (!visitados[i]) && (this.ExisteArista(v, i))) {
//                
//            }
//            
//            if(true){
//                recorrerProfundidad(i, visitados);
//                
//        }
//    }
//    }
    
    /**
     * Método para recorrer a Profundidad 
     * @param alpha
     * @param beta
     * @param a
     */
//procedimiento no recursivo

    public void profundidad(double alpha, double beta, Ants a) {
        boolean visitados[] = new boolean[this.getGrafosize()];
        

        for (int i = 0; i < getGrafosize(); i++) //inicializar vector con campos false
        {
            visitados[i] = false;
        }
        
        Probabilidades( first, visitados, alpha, beta, a);
        this.CalcularAcumulado(a);
        }
    
    
    public void NewFeromona(){
        for (int i = 0; i < getGrafosize(); i++) {
            if (vertices[i].primero != null){
                Arista aux = vertices[i].primero.getNext();
                while (aux != null){
                    aux.setFeromona(1/(double)this.save);
                    aux = aux.getNext();
                }
            }
        }
    }
    public Arista searchArista(String element1, String element2){
        for (int i = 0; i < getGrafosize(); i++) {
            if(vertices[i].primero != null){
//                System.out.println( vertices[i].primero.getElement() + "    " +element1);
            }
            
            if (vertices[i].primero != null && vertices[i].primero.getElement().equals(element1)){
                Arista aux = vertices[i].primero.getNext();
                while (aux != null && !aux.getCity().equals(element2)){
//                    System.out.println(aux.getCity() + "   " + element2);
                    aux = aux.getNext();
                }
                return aux;
            }
        }
        return null;
    }
    
    
    public void CalcularAcumulado(Ants a){
        String[] visited_cities = a.getVisited().split(",");
//        System.out.println(visited_cities[visited_cities.length-1]);
        for (int i = 0; i < visited_cities.length; i++) {
            if(i+1 < visited_cities.length){
                   
                this.searchArista(visited_cities[i], visited_cities[i+1]).sumatoria += 1/a.getDistance();
                this.searchArista(visited_cities[i+1], visited_cities[i]).sumatoria += 1/a.getDistance();
            }
        }
    }
    
    public void ActFeromonas(double p){
        for (int i = 0; i < getGrafosize(); i++) {
            if (vertices[i].primero != null){
                Arista aux = vertices[i].primero.getNext();
                while (aux != null){
//                    System.out.println("---------------------------------- SUMATORIA --- " + aux.sumatoria);
                    aux.setFeromona(aux.getFeromona() * (1-p) + aux.sumatoria);
                    System.out.println("FEROMONAS "+aux.getFeromona());
                    aux = aux.getNext();
                }
                
            }
        }
        
    }
    
//    public void verferomonas(){
//         for (int i = 0; i < grafosize; i++) {
//            if (vertices[i].primero != null){
//                Arista aux = vertices[i].primero.getNext();
//                while (aux != null){
//                    System.out.println("---------------------------------- feromonas --- " + aux.getFeromona());
//                    
//                    aux = aux.getNext();
//                }
//                
//            }
//        }

    /**
     * @return the grafosize
     */
    public int getGrafosize() {
        return grafosize;
    }
    /*public static boolean IsNumeric(String element) {
        boolean resultado;
        try {
            Double.parseDouble(element);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }*/
    }
    
  /*  public void MinPath(){
        Arista min = null;
        for (int i = 0; i < grafosize; i++) {
            Arista aux = vertices[i].primero.getNext();
            if (min == null && vertices[i].primero != null){
                min = aux;
            }
            else if (min.getDistance() != 0 && aux.getDistance() < min.getDistance()){
                min = aux;
            }
        }
    El metodo buscaba el menor por hormiga, pero no se necesita ya que se creo uno en el JFrameS
    }
}*/

