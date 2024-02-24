
package edd.proyecto;

/*public class EDDProyecto {

    public static void main(String[] args) {
        int n = 9;
    }   
}*/


/**
 *
 * @author VirginiaT
 */

// Clase Hormiga " Ants "

public class Ants {
    
    /**
     * Atributos de la Clase Hormiga
     * 
     * distance: Distancia que recorre 
     * visited: Lugares visitados
     */
    
    private double distance;
    private String visited;

    /**
     * Constructor de Ants
     */
    
    public Ants() {
        this.distance = 0;
        this.visited = "";
    }

    /**
     * Getter de distance de Ants
     * @return the distance
     */
    
    public double getDistance() {
        return distance;
    }

    /**
     * Setter de distance de Ants
     * @param distance the distance to set
     */
    
    public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * Getter de visited de Ants
     * @return the visited
     */
    
    public String getVisited() {
        return visited;
    }

    /**
     * Setter de visited de Ants
     * @param visited the visited to set
     */
    
    public void setVisited(String visited) {
        this.visited = visited;
    }
    
}
