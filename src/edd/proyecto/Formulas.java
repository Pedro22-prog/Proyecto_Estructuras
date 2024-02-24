package edd.proyecto;

/**
 *
 * @author MigueMonti
 */
public class Formulas {
        double aleatorio = Math.random()*17+4;
        int ciudades = (int)aleatorio;
        
        Lista ciudad = new Lista();
        for (int i = 0; i < ciudades; i++) {
            ciudad.insertarFinal(i);
        }
//      ciudades.insertarFinal("Kansas City");
        System.out.println("+ CIUDADES +");
        ciudad.print();
        System.out.println("- Número de ciudades = " + ciudad.getSize());
        
        double m = ciudad.getSize();
        double tau = 1/m;
        System.out.println("- Cantidad inicial de feromonas: " + tau);
              
//      Hacer una lista con las distancias respectivas dada la posicion de las ciudades en su lista particular
        
        double ciudad1 = Math.random()*ciudades;
        int r = (int)ciudad1;
        System.out.println("- Ciudad r: " + r);
        int iteracion = r+1;
        int visita = ciudades - iteracion;
        System.out.println("- Ciudades a visitar: " + visita);
        double ciudad2 = Math.random()*visita+iteracion;
        int s = (int)ciudad2;
        System.out.println("- Ciudad s: " + s);
        
        double t = funcionTau(tau);
        double n = funcionEta(s,r);
        double numerador = t*n;
        System.out.println(numerador);
        
        double suma = 0;
        for (int u = iteracion; u < ciudades; u++) {
            double distancia = funcionEta(u,r);
            suma += distancia;
        }
        System.out.println("SUMATORIA ==> " + suma);
        double denominador = t*suma;
        System.out.println(denominador);
        double p = numerador/denominador;
        System.out.println("PROBABILIDAD ==> " + p);
        tau = incremento(tau, s, r);
        System.out.println("INCREMENTO ==> " + tau);
        tau = evaporacion(tau);
        System.out.println("EVAPORACION ==> " + tau);
    }
    
    public double funcionTau(double tau) {
        int alpha = 1;
        double t = Math.pow(tau, alpha);
        return t;
    }
    
    public double funcionEta(int s, int r) {
        int beta = 2;
        int q = 1;
        double d = s-r;
        double eta = q/d;
        double n = Math.pow(eta, beta);
        return n;
    }
    
    public double incremento(double tau, int s, int r) {
        int q = 1;
        int l = s-r;
        double i = tau + q/l;
        return i;
    }
    
    public double evaporacion(double tau) {
        float p = (float)0.5;
        return (1-p)*tau;
    }
    
}
