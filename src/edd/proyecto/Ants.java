
package edd.proyecto;

/*public class EDDProyecto {

    public static void main(String[] args) {
        int n = 9;
    }   
}*/

public class Ants{
    private double distance;
    private String visited;
    
    public Ants(){
        this.distance = 0;
        this.visited = "";
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
     * @return the visited
     */
    public String getVisited() {
        return visited;
    }

    /**
     * @param visited the visited to set
     */
    public void setVisited(String visited) {
        this.visited = visited;
    }
    
}  