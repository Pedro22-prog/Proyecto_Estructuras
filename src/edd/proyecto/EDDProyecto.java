/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.proyecto;

/**
 *
 * @author pedro
 */

public class EDDProyecto {

    public static void main(String[] args) {
//        InicioInterfaz i = new InicioInterfaz();
//        i.setVisible(true);
//        Grafos newgrafo = new Grafos( 25);
//        newgrafo.Insert("5");
//        newgrafo.Insert("4");
//        newgrafo.Insert("3");
//        newgrafo.Insert("2");
//        newgrafo.Insert("1");
//        newgrafo.InsertArista(23, "1", "3");
//        newgrafo.InsertArista(25, "1", "2");
//        //newgrafo.InsertArista(33, "1", "4");
//     //   newgrafo.InsertArista(101, "1", "5");
//        newgrafo.InsertArista(13, "2", "3");
//      //  newgrafo.InsertArista(19, "2", "4");
//        newgrafo.InsertArista(29, "2", "5");
//        newgrafo.InsertArista(26, "3", "5");
//        newgrafo.InsertArista(73, "4", "5");
//        System.out.println(newgrafo.Imprimir());
//        newgrafo.ChangeLast("1");
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 10; j++) {
//                Ants a = new Ants();
//                newgrafo.profundidad(1, 1, a);
//                System.out.println(a.getVisited());
//                System.out.println(a.getDistance());
//                
//            }
//            newgrafo.ActFeromonas(0.5);
            //InicioInterfaz i = new InicioInterfaz();
            Grafos newgrafo = new Grafos(25);
            StartInterface i = new StartInterface(newgrafo);
           i.setVisible(true);
          
            
        }
        
    }  

